/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.AutoridadCtrl;
import com.sv.udb.controlador.InstitucionCtrl;
import com.sv.udb.modelo.Autoridad;
import com.sv.udb.modelo.Institucion;
import com.sv.udb.modelo.Municipios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class frmAutoridad extends javax.swing.JFrame {

    /**
     * Creates new form frmAutoridad
     */
    public frmAutoridad() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnActualizar.setVisible(false);
        Refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutoridad = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblAutoriadaNomb = new javax.swing.JLabel();
        txtAutoridadNomb = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        chkHabilitado = new javax.swing.JCheckBox();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        tblAutoridad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAutoridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutoridadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutoridad);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales"));

        lblCodigo.setText("Codigo");

        txtCodigo.setEditable(false);

        lblAutoriadaNomb.setText("Nombre Autoridad");

        txtAutoridadNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutoridadNombKeyTyped(evt);
            }
        });

        lblCorreo.setText("Correo");

        chkHabilitado.setText("Habilitado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutoriadaNomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAutoridadNomb))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkHabilitado))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutoriadaNomb)
                    .addComponent(lblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutoridadNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkHabilitado)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnGuardar))
                            .addComponent(btnActualizar))
                        .addGap(16, 16, 16)
                        .addComponent(btnEliminar)
                        .addGap(11, 11, 11)
                        .addComponent(btnLimpiar)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar)
                                    .addComponent(btnActualizar)))
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar))
                        .addGap(23, 23, 23))))
        );

        jMenu2.setText("<- Atras");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Cerrar sesion");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Limpiar ()
    {
        txtCodigo.setText("");
        txtAutoridadNomb.setText("");
        txtCorreo.setText("");
        txtAutoridadNomb.requestFocus();
        btnGuardar.setVisible(true);
        btnActualizar.setVisible(false);
        chkHabilitado.setSelected(true);
    }
    public boolean verificar()
    {
        boolean resp = false;
        if(!txtAutoridadNomb.getText().trim().isEmpty() && !txtCorreo.getText().trim().isEmpty())
        {
        resp=true;
        }
        return resp;
    }
    public void Refresh()
    {
         chkHabilitado.setSelected(true);
        DefaultTableModel modelo = (DefaultTableModel)this.tblAutoridad.getModel();
        while(modelo.getRowCount()>0){modelo.removeRow(0);} //Limpiar modelo
        for (Autoridad temp: new AutoridadCtrl().consTodo())
        {

            if(temp != null)
            {
                modelo.addRow(new Object[]{temp,temp.getCorreo(),temp.getEstadoS()});
        
            }
        }
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (verificar())
        {
            Autoridad obj = new Autoridad();
            if (!txtCodigo.getText().isEmpty())
            {
                obj.setCodi(Integer.parseInt(txtCodigo.getText()));
                obj.setNomb(txtAutoridadNomb.getText());
                obj.setCorreo(txtCorreo.getText());
                obj.setEstado(chkHabilitado.isSelected());
                if(new AutoridadCtrl().actu(obj))
                {
                    JOptionPane.showMessageDialog(null, "Modificado");
                    Refresh();
                    Limpiar();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Limpie los datos de la institucion anterior");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Llene todos los datos porfavor");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      if (verificar())
       {
            Autoridad obj = new Autoridad();
           if (txtCodigo.getText().isEmpty())
           {
               obj.setNomb(txtAutoridadNomb.getText());
               obj.setCorreo(txtCorreo.getText());
               obj.setEstado(chkHabilitado.isSelected());
               if(new AutoridadCtrl().guar(obj))
               {
                JOptionPane.showMessageDialog(null, "Guardado");
                Refresh();
                Limpiar();
               }
               else
               {
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
               }

           }
           else
           {
               JOptionPane.showMessageDialog(null,"Limpie los datos de la institucion anterior");
           }
       }
       else
       {
       JOptionPane.showMessageDialog(null,"Llene todos los datos porfavor");
       }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblAutoridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutoridadMouseClicked
     int fila = tblAutoridad.getSelectedRow();
     if(fila >=0)
     {
     Autoridad obj = (Autoridad) this.tblAutoridad.getValueAt(fila,0);
     txtCodigo.setText(String.valueOf(obj.getCodi()));
     txtAutoridadNomb.setText(obj.getNomb());
     txtCorreo.setText(obj.getCorreo());
     if(obj.getEstadoS().equals("Habilitado"))
    {
    this.chkHabilitado.setSelected(true);
    }
    else
    {
    this.chkHabilitado.setSelected(false);
    }
    btnGuardar.setVisible(false);
    btnActualizar.setVisible(true);
     }
    }//GEN-LAST:event_tblAutoridadMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (verificar())
        {
            Autoridad obj = new Autoridad();
            if (!txtCodigo.getText().isEmpty())
            {
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro en eliminar"+txtAutoridadNomb.getText()+"?");
                if(resp == 0)
                {
                    obj.setCodi(Integer.parseInt(txtCodigo.getText()));
                    obj.setEstado(false);
                    if(new AutoridadCtrl().eliminar(obj))
                    {
                        JOptionPane.showMessageDialog(null, "Eliminado");
                        Refresh();
                        Limpiar();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error");
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Limpie los datos de la institucion anterior");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Llene todos los datos porfavor");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    private void txtAutoridadNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutoridadNombKeyTyped
     char c= evt.getKeyChar();
      if(Character.isLetter(c));
      else if (Character.isSpace(c));
      else if (Character.isISOControl(c));
      else
      {
      evt.consume();
          System.out.println("Solo letras");
      }
    }//GEN-LAST:event_txtAutoridadNombKeyTyped

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        frmAdmin obje = new frmAdmin();
        obje.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        frmLogin obje = new frmLogin();
        obje.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(frmAutoridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAutoridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAutoridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAutoridad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAutoridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkHabilitado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutoriadaNomb;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JTable tblAutoridad;
    private javax.swing.JTextField txtAutoridadNomb;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
