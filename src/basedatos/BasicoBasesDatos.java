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
 * @author CPIFP LOS ENLACES
 */
public class BasicoBasesDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection conexion = null;
        try {
            //Cargar driver
            //  Para lo que hemos tenido que importar la clase adecuada
            //  a la base de datos que nos vamos a conectar. En este caso es
            //  MySQL y hemos importado com.mysql.jdbc.Driver;
            DriverManager.registerDriver(new Driver());

            //Establecer la conexión
            String servidor = "localhost";
            String puerto = "3306";
            String basedatos = "alumnos";
            String usuario = "usuario";
            String password = "usuario";
            //jdbc:mysql://servidor:puerto/basedatos
            conexion = DriverManager.getConnection("jdbc:mysql://"
                    + servidor + ":" + puerto + "/" + basedatos, usuario, password);

            //Ahora preparo la sentencia que voya ejecutar contra la base de datos
            //  Para lo que necesito la conexión establecida justo antes "conexion"
            ps = conexion.prepareStatement("select * from alumno");

            //ejecuto la consulta contra la base de datos que devuelte un ResultSet
            rs = ps.executeQuery();

            //Recorro el resultado de la consulta.
            //  Cada iteración del bucle es una fila
            while (rs.next()) {
                //Obtengo los datos de cada columna de la fila en la que estoy
                //  y los muestro por pantalla.
                //Puedo usar el nombre de la columna
                String expediente = rs.getString("expediente");
                //O la posición que ocupa la columna
                String nombre = rs.getString(2);
                //Obtengo el resto de las columnas que me interesan
                String telefono = rs.getString("telefono");
                int edad = rs.getInt("edad");
                int notaEntornos = rs.getInt(6);
                int notaProgramacion = rs.getInt(7);
                //Ahora muestro por pantalla la información obtenida en esa fila
                System.out.println("Expediente " + expediente + ": " + nombre + "-" + telefono + "-" + edad + " años- Entornos:" + notaEntornos + "- Programación:" + notaProgramacion);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                //Ahora vamos a liberar los recursos utilizados (ps y rs)
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }

                //También hay que cerrar la conexión con la base de datos.
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al liberar recuros o cerrar conexión");
            }
        }
    }

}
