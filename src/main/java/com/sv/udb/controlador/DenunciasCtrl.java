/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Denuncias;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Walter
 */
public class DenunciasCtrl {
    
    public boolean guarDenu(Denuncias obje, String opci){
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            
            if (null != opci) switch (opci) {
                case "Archivar":
                    
                    PreparedStatement cmd = cn.prepareStatement("INSERT INTO denuncia VALUES(NULL,?)");
                    cmd.setString(1, obje.getFecha());
                    cmd.executeUpdate();
                    resp=true;
                    
                    break;
                case "Remitir":
                    
                    
                    
                    break;
                case "Contactar":
                    
                    
                    
                    break;
                default:
                    break;
            }
            
        } catch (Exception ex) 
        {
            System.err.println("Error al guardar departamento: " + ex.getMessage());
        }
        finally
        {
            try 
            {
                if(cn != null)
                {
                    if(!cn.isClosed())
                    {
                        cn.close();
                    }    
                }
               
            } 
            catch (SQLException err) {
                err.printStackTrace();
            }
    
        }
        return resp;   
    }
    
}
