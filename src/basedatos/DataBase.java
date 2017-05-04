package basedatos;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Vitoria
 */
public class DataBase {

    private Connection conexion;

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    public boolean cargarDriver() {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean conectar(String host, String puerto, String database, String usuario, String password) {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/" + database, usuario, password);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean desconectar() {

        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    public PreparedStatement prepararSentencia(String sentencia) throws SQLException {
        PreparedStatement ps;
        return ps = conexion.prepareStatement(sentencia);
    }

    public ResultSet consultaSinParametros(String consulta) throws SQLException {
        ResultSet rs = prepararSentencia(consulta).executeQuery();
        return rs;
    }

    //Esta clase no la uso ya que tengo el autocommit a true y se hace solo
    public void confirmarCambios() {
        try {
            // Al hacer commit, decimos a la base de datos que escriba
            // todos nuestros cambios
            conexion.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

}
