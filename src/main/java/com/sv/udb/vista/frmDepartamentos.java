/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.DepartamentosCtrl;
import com.sv.udb.modelo.Departamentos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class frmDepartamentos extends javax.swing.JFrame {

    /**
     * Creates new form frmDepartamentos
     */
    public frmDepartamentos() {
        initComponents();
        this.refreshTblDepa();
        txtIdDepa.setVisible(false);
        btnEliDepa.setVisible(false);
        btnEditDepa.setVisible(false);
    }

    public void limpiar()
    {
        txtIdDepa.setText("");
        txtNombreDepa.setText("");
        btnEliDepa.setVisible(false);
        btnEditDepa.setVisible(false);
        btnGuarDepa.setVisible(true);
        
    }
     public void refreshTblDepa()
    {
         try {
            DefaultTableModel model = (DefaultTableModel)this.tblDepa.getModel();
            while(model.getRowCount()>0){model.removeRow(0);} //Limpiar modelo
            for(Departamentos temp : new DepartamentosCtrl().consTodo())
            {
                model.addRow(new Object[]{temp});
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuarDepa = new javax.swing.JButton();
        txtNombreDepa = new javax.swing.JTextField();
        lblNombreDepa = new javax.swing.JLabel();
        btnEditDepa = new javax.swing.JButton();
        btnLimpiarDep = new javax.swing.JButton();
        btnEliDepa = new javax.swing.JButton();
        txtIdDepa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        btnGuarDepa.setText("Guardar");
        btnGuarDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarDepaActionPerformed(evt);
            }
        });

        txtNombreDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDepaActionPerformed(evt);
            }
        });

        lblNombreDepa.setText("Nombre:");

        btnEditDepa.setText("Editar");
        btnEditDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDepaActionPerformed(evt);
            }
        });

        btnLimpiarDep.setText("Limpiar");
        btnLimpiarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDepActionPerformed(evt);
            }
        });

        btnEliDepa.setText("Eliminar");
        btnEliDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliDepaActionPerformed(evt);
            }
        });

        txtIdDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDepaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNombreDepa)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGuarDepa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(btnEditDepa))
                        .addComponent(txtNombreDepa)
                        .addComponent(btnLimpiarDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnEliDepa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtIdDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreDepa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEliDepa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuarDepa)
                    .addComponent(btnEditDepa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnLimpiarDep))
        );

        tblDepa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDepa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDepa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDepaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDepaActionPerformed

    private void btnGuarDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarDepaActionPerformed
     if (!(txtNombreDepa.getText().equals("")))
        {
         try 
         {
             Departamentos obje = new Departamentos();
            
            obje.setNombreDepa(this.txtNombreDepa.getText());
            
            if(new DepartamentosCtrl().guarDepart(obje))
            {
               JOptionPane.showMessageDialog(this, "Datos guardados");
               this.limpiar();
               this.refreshTblDepa();
                
            }
            else
            {
                  JOptionPane.showMessageDialog(this, "Oops! algo malo pasó");
            }
          } 
          catch (Exception ex) 
          {
              JOptionPane.showMessageDialog(this, ex.getMessage());
          }   
        }
        else
        {
         JOptionPane.showMessageDialog(this, "Ingrese todos los datos para poder ingresarlos");
         
        }
    }//GEN-LAST:event_btnGuarDepaActionPerformed

    private void txtIdDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDepaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDepaActionPerformed

    private void btnEditDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDepaActionPerformed
        if(!(txtIdDepa.getText().equals("")))
        { 
                    try 
                    {
                        Departamentos obje = new Departamentos();
            
                       obje.setNombreDepa(this.txtNombreDepa.getText());                      
                       obje.setIdDepa(Integer.parseInt(txtIdDepa.getText()));
                      
                       if(new DepartamentosCtrl().editarDepa(obje))
                       {
                           JOptionPane.showMessageDialog(this, "El Departamento ha sido editado"); 
                           this.limpiar();
                           this.refreshTblDepa();
                            
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(this, "Oops! algo malo pasó al tratar de editar");
                       }  
                    } 
                    catch (Exception e) 
                    {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
               
               
           
        }
        else
        {
         JOptionPane.showMessageDialog(this, "Seleccione un equipo para poder editarlo");    
        }
    }//GEN-LAST:event_btnEditDepaActionPerformed

    private void tblDepaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepaMouseClicked
int fila = this.tblDepa.getSelectedRow();
        if( fila >= 0)
        {
            Departamentos obje = (Departamentos)this.tblDepa.getValueAt(fila, 0);
            this.txtIdDepa.setText(String.valueOf(obje.getIdDepa()));
            this.txtNombreDepa.setText(obje.getNombreDepa());
            
            btnEditDepa.setVisible(true);
        btnEliDepa.setVisible(true);
        btnGuarDepa.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepaMouseClicked

    private void btnEliDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliDepaActionPerformed
        if(!(txtIdDepa.getText().equals("")))
        { 
            if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar este Departamento?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
               {
                    try 
                    {
                        int id =Integer.parseInt(txtIdDepa.getText());
                       
                       if(new DepartamentosCtrl().eliminarDepa(id))
                       {
                           JOptionPane.showMessageDialog(this, "El departamento ha sido eliminado");  
                           this.limpiar();
                           this.refreshTblDepa();
                            
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(this, "Oops! algo malo pasó al tratar de eliminar");
                       }  
                    } 
                    catch (Exception e) 
                    {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
               }
               
           
        }
        else
        {
         JOptionPane.showMessageDialog(this, "Seleccione un equipo para poder eliminarlo");    
        }
    }//GEN-LAST:event_btnEliDepaActionPerformed

    private void btnLimpiarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDepActionPerformed
       this.limpiar();
    }//GEN-LAST:event_btnLimpiarDepActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDepartamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditDepa;
    private javax.swing.JButton btnEliDepa;
    private javax.swing.JButton btnGuarDepa;
    private javax.swing.JButton btnLimpiarDep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreDepa;
    private javax.swing.JTable tblDepa;
    private javax.swing.JTextField txtIdDepa;
    private javax.swing.JTextField txtNombreDepa;
    // End of variables declaration//GEN-END:variables
}
