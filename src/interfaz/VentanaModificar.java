/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import basedatos.DataBase;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego V
 */
public class VentanaModificar extends javax.swing.JFrame {

    JFrame ventana;
    /**
     * Creates new form VentanaModificar
     */
    public VentanaModificar(JFrame ventana) {
        this.ventana = ventana;
        initComponents();
        this.setLocationRelativeTo(null);
        this.botonBuscar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        textoExpediente = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        textoNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textoTelefono = new javax.swing.JTextField();
        textoDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textoEdad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonBorrarTodo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Entornos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoEntornos = new javax.swing.JTextField();
        textoProgramacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel5.setText("Edad");

        botonModificar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        textoExpediente.setToolTipText("");
        textoExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoExpedienteActionPerformed(evt);
            }
        });
        textoExpediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoExpedienteKeyPressed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        textoNombre.setEditable(false);
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jButton1.setText("Menú Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textoTelefono.setEditable(false);
        textoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefonoActionPerformed(evt);
            }
        });

        textoDireccion.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("Expediente");

        textoEdad.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Introduce el expediente del alumno");

        botonBorrarTodo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        botonBorrarTodo.setText("Limpiar campos");
        botonBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarTodoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel3.setText("Teléfono");

        Entornos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        Entornos.setText("Entornos");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel7.setText("Programación");

        textoEntornos.setEditable(false);

        textoProgramacion.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(Entornos)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoTelefono)
                            .addComponent(textoExpediente)
                            .addComponent(textoNombre)
                            .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoEntornos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoProgramacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonBuscar)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(botonModificar)
                        .addGap(51, 51, 51)
                        .addComponent(botonBorrarTodo)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entornos)
                    .addComponent(textoEntornos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textoProgramacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar)
                    .addComponent(botonBorrarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(botonBuscar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:

        DataBase conn = new DataBase();
        conn.cargarDriver();
        conn.conectar("localhost", "3306", "alumnos", "usuario", "usuario");

        boolean datosValidos = true;

        // Validar datos
        int edad = 0;
        try {
            edad = Integer.valueOf(textoEdad.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "La edad del alumno debe ser un entero.");
            datosValidos = false;
        }

        int entornos = 0;
        try {
            entornos = Integer.valueOf(textoEntornos.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "La nota de entornos debe ser un entero.");
            datosValidos = false;
        }

        int programacion = 0;
        try {
            programacion = Integer.valueOf(textoProgramacion.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "La nota de eprogramación debe ser un entero.");
            datosValidos = false;
        }

        String nombreAlumno = textoNombre.getText();
        if (nombreAlumno.isEmpty() || nombreAlumno.length() > 10) {
            JOptionPane.showMessageDialog(this, "El nombre del alumno no puede estar vacío y tiene que tener 10 caracteres como máximo.");
            datosValidos = false;
        }

        String expedienteAlumno = textoExpediente.getText();
        if (expedienteAlumno.isEmpty() || expedienteAlumno.length() > 5) {
            JOptionPane.showMessageDialog(this, "El expediente del alumno no puede estar vacío y tiene que tener 5 caracteres como máximo.");
            datosValidos = false;
        }

        String telefonoAlumno = textoTelefono.getText();
        if (telefonoAlumno.isEmpty() || telefonoAlumno.length() > 9) {
            JOptionPane.showMessageDialog(this, "El teléfono del alumno no puede estar vacío y tiene que tener 9 caracteres como máximo.");
            datosValidos = false;
        }

        String direccionAlumno = textoDireccion.getText();
        if (direccionAlumno.isEmpty() || direccionAlumno.length() > 50) {
            JOptionPane.showMessageDialog(this, "La dirección del alumno no puede estar vacío y tiene que tener 50 caracteres como máximo.");
            datosValidos = false;
        }
        if (datosValidos) {
            try {
                actualizarAlumno(conn, edad, nombreAlumno, expedienteAlumno, telefonoAlumno, direccionAlumno, entornos, programacion);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaAlta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_botonModificarActionPerformed

    private void textoExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoExpedienteActionPerformed

    private void textoExpedienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoExpedienteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botonBuscar.doClick();
            textoDireccion.setEditable(true);
            textoEdad.setEditable(true);
            textoNombre.setEditable(true);
            textoTelefono.setEditable(true);
            textoProgramacion.setEditable(true);
            textoEntornos.setEditable(true);
        }
    }//GEN-LAST:event_textoExpedienteKeyPressed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        DataBase conn = new DataBase();
        conn.cargarDriver();
        conn.conectar("localhost", "3306", "alumnos", "usuario", "usuario");

        String expedienteAlumno = textoExpediente.getText();
        if (expedienteAlumno.isEmpty() || expedienteAlumno.length() > 5) {
            JOptionPane.showMessageDialog(this, "El expediente del alumno no puede estar vacío y tiene que tener 5 caracteres como máximo.");
        } else {

            PreparedStatement ps = null;
            try {
                ps = conn.prepararSentencia("SELECT * FROM alumno WHERE expediente =?");
                ps.setString(1, textoExpediente.getText());
            } catch (SQLException ex) {
                Logger.getLogger(VentanaBaja.class.getName()).log(Level.SEVERE, null, ex);
            }
            ResultSet rs = null;
            try {
                rs = ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaBaja.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                if (rs.next()) {
                    // Recojo los valores
                    String nombre = rs.getString(2);
                    String telefono = rs.getString(3);
                    String direccion = rs.getString(4);
                    String edad = rs.getString(5);
                    String entornos = rs.getString(6);
                    String programacion = rs.getString(7);

                    textoNombre.setText(nombre);
                    textoTelefono.setText(telefono);
                    textoDireccion.setText(direccion);
                    textoEdad.setText(edad);
                    textoEntornos.setText(entornos);
                    textoProgramacion.setText(programacion);
                } else {
                    JOptionPane.showMessageDialog(this, "El expediente " + textoExpediente.getText() + " no existe.");
                    botonBorrarTodo.doClick();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaBaja.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                conn.desconectar();
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefonoActionPerformed

    private void botonBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarTodoActionPerformed
        // TODO add your handling code here:
        textoDireccion.setText("");
        textoEdad.setText("");
        textoExpediente.setText("");
        textoNombre.setText("");
        textoTelefono.setText("");
    }//GEN-LAST:event_botonBorrarTodoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ventana.setVisible(true);
    }//GEN-LAST:event_formWindowClosed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entornos;
    private javax.swing.JButton botonBorrarTodo;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoEdad;
    private javax.swing.JTextField textoEntornos;
    private javax.swing.JTextField textoExpediente;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoProgramacion;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables

    private void actualizarAlumno(DataBase conn, int edad, String nombre, String expediente, String telefono, String direccion, int entornos, int progamacion) throws SQLException {

        // Obtengo el PreparedStatement
        PreparedStatement ps = conn.prepararSentencia(
                "UPDATE alumno set expediente=?, nombre=?, telefono=?,"
                + " direccion=?, edad=?, entornos=?,"
                + " programacion=? WHERE expediente=?");
        try {
            ps.setString(1, expediente);
            ps.setString(2, nombre);
            ps.setString(3, telefono);
            ps.setString(4, direccion);
            ps.setInt(5, edad);
            ps.setInt(6, entornos);
            ps.setInt(7, progamacion);
            ps.setString(8, expediente);

            // Ejecuto la inserción
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Alumno guardado con éxito.");

        } catch (MySQLIntegrityConstraintViolationException clavesException) {
            JOptionPane.showMessageDialog(this, "Expediente de alumno duplicado, nombre inválido,teléfono incorrecto, dirección o edad equivocados.");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaAlta.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ha habido un error al guardar el alumno.");
        } finally {
            conn.desconectar();
        }

    }

}