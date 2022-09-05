
package com.mycompany.reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VentanaFabricantes extends javax.swing.JFrame {

    //instanciamos la conexion de nuestra base de datos
    
    ConexionBd cc = new ConexionBd();
    Connection con = cc.Conectar();
    
    
    
    
    public VentanaFabricantes() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        leer = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Fabricantes");
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel2.setText("TABLA FABRICANTE");

        Crear.setText("REGISTRAR FABRICANTE");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        leer.setText("CARGAR TABLA FABRICANTES");
        leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerActionPerformed(evt);
            }
        });

        actualizar.setText("ACTUALIZAR FABRICANTE");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        borrar.setText("ELIMINAR FABRICANTES");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        reg.setText("R E G R E S A R");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel1.setText("M Y S Q L   -->  DATABASE ADMINISTRATOR");

        jLabel5.setText("Nombre del fabricante:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(leer, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg)
                .addContainerGap())
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel3.setText("REGISTROS EXISTENTES");

        jLabel4.setText("PARA ACTUALIZAR Y ELIMINAR REGISTROS DEBE SELECCIONARLO EN LA TABLA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
        new Options().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_regActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Eliminar();
        mostrarDatos();
        limpiar();
    }//GEN-LAST:event_borrarActionPerformed

    private void leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerActionPerformed
        mostrarDatos();
        
  
            
    }//GEN-LAST:event_leerActionPerformed

    
    
    //metodo para agregar datos a la tabla
    public void InsertarDatos(){
        try {
            String Sql = "insert into fabricantes values(?)";
            PreparedStatement pst = con.prepareStatement(Sql);
            
            pst.setString(1, txtNom.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al registar");
        }
    }
    //metodo para limpiar campos
    public void limpiar(){
        txtNom.setText("");
    }
    
    //metodo mostrar datos
    public void mostrarDatos(){
        String[] fabricantes={"Nombre del fabricante"};
        String[] registros = new String[1];
        
        DefaultTableModel modelo = new DefaultTableModel(null,fabricantes);
        
        String Sql = "select * from fabricantes";
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            
            while(rs.next()){
                registros[0] = rs.getString("fabricante");
                
                modelo.addRow(registros);
            }
            
            table.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al visualizar Datos" + e);
        }
    }
    
    //metodo para actualizar datos de la tabla
    public void ActualizarDatos(){
        
        try {
            String Sql = "update fabricantes set fabricante=? where fabricante=?";
            
            int Fila = table.getSelectedRow();
            String dao = (String)table.getValueAt(Fila, 0);
            PreparedStatement pst = con.prepareStatement(Sql);
            
            pst.setString(1, txtNom.getText());
            
            pst.setString(2,dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "El registro se Actualizo exitosamente!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al Actualizar");
        }
    }
    
    //metodo para Borrar datos de la tabla
    public void Eliminar(){
          
          int filaSeleccionada=table.getSelectedRow();
          
          
          try {
          
            String Sql = "DELETE FROM fabricantes WHERE fabricante="+table.getValueAt(filaSeleccionada,0);
            
            Statement st = con.createStatement();
            int n = st.executeUpdate(Sql);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "El registro se Elimino exitosamente!!");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al Eliminar " + e);
        }
    }
    
    
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        InsertarDatos(); // Registra datos
        mostrarDatos();
        limpiar(); // Limpia el formmulario
    }//GEN-LAST:event_CrearActionPerformed

    
    //EVENTO MOUSE CLICKED
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
            int filaSeleccionada=table.rowAtPoint(evt.getPoint());
            
            txtNom.setText(table.getValueAt(filaSeleccionada,0).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
         ActualizarDatos();
         mostrarDatos();
         limpiar();
    }//GEN-LAST:event_actualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leer;
    private javax.swing.JButton reg;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
