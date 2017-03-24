/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Institucion;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class InstitucionCtrl {
    public boolean guar(Institucion obje)
    {
    boolean resp = false;
    Connection con = new Conexion().getConn();
        try 
        {
            PreparedStatement cmd = con.prepareStatement("Insert into instituciones values(null,?,?,?,?,?)");
            cmd.setString(1,obje.getNomb());
            cmd.setString(2, obje.getCorreo());
            cmd.setString(3, obje.getDireccion());
            cmd.setInt(4, obje.getMunicipio());
            cmd.setBoolean(5,obje.getEstado());
            cmd.executeUpdate();
            resp=true;
        }
        catch (Exception e) 
        {
            System.out.println("Error:"+e.getMessage());
        }
         finally
        {
        try
        {
        if(con != null)
        {
        if(!con.isClosed())
        {
        con.close();
        }
        }
        }
        catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
    return resp;
    }
    
}
