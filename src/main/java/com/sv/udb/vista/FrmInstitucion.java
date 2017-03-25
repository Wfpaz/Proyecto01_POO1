/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.AutoridadCtrl;
import com.sv.udb.controlador.CtrlMunicipios;
import com.sv.udb.controlador.DepartamentosCtrl;
import com.sv.udb.controlador.InstitucionCtrl;
import com.sv.udb.modelo.Autoridad;
import com.sv.udb.modelo.Departamentos;
import com.sv.udb.modelo.Institucion;
import com.sv.udb.modelo.Municipios;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmInstitucion extends javax.swing.JFrame {

    /**
     * Creates new form FrmInstitucion
     */
    public FrmInstitucion() {
        initComponents();
        LlenarComboxDepar();
        btnActualizar.setVisible(false);
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNomb = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNomb = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cmbDepartamento = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        chkHabilitado = new javax.swing.JCheckBox();
        btnGuar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInst = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Generales"));

        lblCodigo.setText("Codigo");

        lblNomb.setText("Nombre de Institución ");

        lblCorreo.setText("Correo");

        lblDireccion.setText("Dirección");

        lblDepartamento.setText("Departamento");

        lblMunicipio.setText("Municipio");

        txtCodigo.setEditable(false);

        cmbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentoItemStateChanged(evt);
            }
        });

        chkHabilitado.setText("Habilitado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkHabilitado)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCodigo)
                        .addComponent(lblDireccion)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNomb, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNomb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCorreo)))
                        .addComponent(txtDireccion)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDepartamento))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMunicipio)
                                .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomb)
                    .addComponent(lblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamento)
                    .addComponent(lblMunicipio))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkHabilitado))
        );

        btnGuar.setText("Guardar");
        btnGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarActionPerformed(evt);
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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tblInst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Direccion", "Departamento", "Municipio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInst);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnGuar)))
                        .addGap(9, 9, 9)
                        .addComponent(btnEliminar)
                        .addGap(11, 11, 11)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(btnGuar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean verificar()
    {
    boolean resp=false;
    if(!txtNomb.getText().trim().isEmpty() && !txtCorreo.getText().trim().isEmpty() 
       && !txtDireccion.getText().trim().isEmpty()&&cmbDepartamento.getSelectedIndex() > 0 
       &&  cmbMunicipio.getSelectedIndex() > 0)
    {
    resp=true;
    }
    return resp;
    }
    public void Refresh()
    {
        try 
        {
            DefaultTableModel modelo = (DefaultTableModel)this.tblInst.getModel();
            while(modelo.getRowCount()>0){modelo.removeRow(0);} //Limpiar modelo
            for(Institucion temp: new InstitucionCtrl().consTodo())
            {
              if(temp != null)
              {
                modelo.addRow(new Object[]{temp,temp.getCorreo(),temp.getDireccion(),temp.getDepartamentoN(),temp.getMunicipioN(),temp.getEstadoS()});
            
              }
            }
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
     public void LlenarComboxDepar ()
    {
         try 
        {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("");
      for(Departamentos temp: new DepartamentosCtrl().consTodo())
      {
      model.addElement(temp);
      }    
      cmbDepartamento.setModel(model);
        } 
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
      public void LlenarComboxMuni ()
    {
         try 
        {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Departamentos objDepa = (Departamentos)this.cmbDepartamento.getSelectedItem();
        model.addElement("");
      for(Municipios temp: new  CtrlMunicipios().consUnoV2(objDepa.getIdDepa()))
      {
      model.addElement(temp);
      }    
      cmbMunicipio.setModel(model);
        } 
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    public void Limpiar()
    {
    btnGuar.setVisible(true);
      btnActualizar.setVisible(false);
    txtCodigo.setText("");
    txtNomb.setText("");
    txtCorreo.setText("");
    txtDireccion.setText("");
    cmbDepartamento.setSelectedIndex(-1);
    cmbMunicipio.setSelectedIndex(-1);
    txtNomb.requestFocus();
    }
    private void btnGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarActionPerformed
       if (verificar())
       {
            Institucion obj = new Institucion();
            Municipios obje = (Municipios)this.cmbMunicipio.getSelectedItem();
           if (txtCodigo.getText().isEmpty())
           {
              
               obj.setNomb(txtNomb.getText());
               obj.setCorreo(txtCorreo.getText());
               obj.setDireccion(txtDireccion.getText());
               obj.setMunicipio(obje.getIdMuni());
               obj.setEstado(chkHabilitado.isSelected());
               if(new InstitucionCtrl().guar(obj))
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
       
    }//GEN-LAST:event_btnGuarActionPerformed

    private void cmbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentoItemStateChanged
     if(cmbDepartamento.getSelectedIndex()>0)
     {
        LlenarComboxMuni();
     }
     else
     {
     DefaultComboBoxModel modelo = new DefaultComboBoxModel();
     modelo.addElement("");
     cmbMunicipio.setModel(modelo);
     }
    }//GEN-LAST:event_cmbDepartamentoItemStateChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
     if (verificar())
       {
            Institucion obj = new Institucion();
            Municipios obje = (Municipios)this.cmbMunicipio.getSelectedItem();
           if (!txtCodigo.getText().isEmpty())
           {
               obj.setCodigo(Integer.parseInt(txtCodigo.getText()));
               obj.setNomb(txtNomb.getText());
               obj.setCorreo(txtCorreo.getText());
               obj.setDireccion(txtDireccion.getText());
               obj.setMunicipio(obje.getIdMuni());
               obj.setEstado(chkHabilitado.isSelected());
               if(new InstitucionCtrl().actu(obj))
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

    private void tblInstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInstMouseClicked
     int fila = tblInst.getSelectedRow();
      if(fila >= 0)
    {
    Institucion obj = (Institucion) this.tblInst.getValueAt(fila,0);
    InstitucionCtrl obje = new InstitucionCtrl();
    this.txtCodigo.setText(String.valueOf(obj.getCodigo()));
    this.txtNomb.setText(obj.getNomb());
    this.txtCorreo.setText(obj.getCorreo());
    this.txtDireccion.setText(obj.getDireccion());
    this.cmbDepartamento.setEditable(true);
    this.cmbDepartamento.setSelectedIndex(obje.Index(obj.getDepartamentoN()));
    this.cmbDepartamento.setEditable(false);
     this.cmbMunicipio.setEditable(true);
    this.cmbMunicipio.setSelectedIndex(obje.Index2(obj.getDepartamentoN(),obj.getMunicipioN()));
    this.cmbMunicipio.setEditable(false);
    if(obj.getEstadoS().equals("Habilitado"))
    {
    this.chkHabilitado.setSelected(true);
    }
    else
    {
    this.chkHabilitado.setSelected(false);
    }
    btnGuar.setVisible(false);
    btnActualizar.setVisible(true);
    }
    }//GEN-LAST:event_tblInstMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       if (verificar())
        {
            Institucion obj = new Institucion();
            if (!txtCodigo.getText().isEmpty())
            {
                int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro en eliminar"+txtNomb.getText()+"?");
                if(resp == 0)
                {
                    obj.setCodigo(Integer.parseInt(txtCodigo.getText()));
                    obj.setEstado(false);
                    if(new InstitucionCtrl().elim(obj))
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
            java.util.logging.Logger.getLogger(FrmInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInstitucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkHabilitado;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNomb;
    private javax.swing.JTable tblInst;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNomb;
    // End of variables declaration//GEN-END:variables
}
