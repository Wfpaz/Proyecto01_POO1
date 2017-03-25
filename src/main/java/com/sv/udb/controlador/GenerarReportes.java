/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.recursos.Conexion;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author oscar
 */
public class GenerarReportes {
    
    public void reporteDenuncias()
    {
        try {
            JasperReport reporte = (JasperReport)JRLoader.loadObjectFromFile("reporte1.jasper");
           
            
            JasperPrint j = JasperFillManager.fillReport(reporte, null, new Conexion().getConn());
          JasperViewer jv = new JasperViewer(j,false);
          jv.setTitle("Reporte de denuncia por fecha y tipo");
          jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al crear el reporte"+e);
        }
    }
            
            
            
}
