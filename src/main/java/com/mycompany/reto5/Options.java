 
package com.mycompany.reto5;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;


public class Options extends javax.swing.JFrame {

    
    public Options() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTablas = new javax.swing.JComboBox<>();
        Reg = new javax.swing.JButton();
        ir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATABASE ADMINISTRATOR");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel1.setText("M Y S Q L   -->  DATABASE ADMINISTRATOR");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jLabel2.setText("TABLAS DE LA BASE DE DATOS ");

        cbTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", " ", "Tabla Fabricantes", " ", " " }));

        Reg.setText("R E G R E S A R");
        Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegActionPerformed(evt);
            }
        });

        ir1.setText("A C C E D E R");
        ir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(cbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ir1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ir1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegActionPerformed
          int Resp = JOptionPane.showConfirmDialog(null, "Realmente desea salir del DataBase Administrator?",
                                                "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (Resp == YES_OPTION){
            JOptionPane.showMessageDialog(null,"Regresando....");
             new Conectar().setVisible(true);
             setVisible(false);
        }else {
            JOptionPane.showMessageDialog(null,"La Operacion fue cancelada con exito!");
        }
        
    }//GEN-LAST:event_RegActionPerformed

    public void eleccion(){
          String Eleccion = cbTablas.getSelectedItem().toString();
         
        if (Eleccion == "Tabla Proveedor"){
             new Ventana_provedor().setVisible(true);
             
        }else if (Eleccion == "Tabla Fabricantes"){
             new VentanaFabricantes().setVisible(true);
             
        }else if(Eleccion == "Tabla Intencion de Compras"){
                new Tabla_Intencion().setVisible(true);
                
        }else if(Eleccion == "Tabla Bicicleta"){
             new VentanaBicicleta().setVisible(true);
             
        }else if(Eleccion == "Tabla Motocicleta"){
             new VentanaMotocicleta().setVisible(true);
              
        }else if(Eleccion == "Tabla Cliente"){
             new VentanaCliente().setVisible(true);
             
        }
    }
    private void ir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ir1ActionPerformed
      eleccion();
      
    }//GEN-LAST:event_ir1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reg;
    private javax.swing.JComboBox<String> cbTablas;
    private javax.swing.JButton ir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
