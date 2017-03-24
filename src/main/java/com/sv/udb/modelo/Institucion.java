/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Luis
 */
public class Institucion {
    int codigo,Municipio;
    boolean estado;
    String nomb,correo,direccion;

    public Institucion() {
    }
    public Institucion(int codigo, int Municipio, boolean estado, String nomb, String correo, String direccion) {
        this.codigo = codigo;
        this.Municipio = Municipio;
        this.estado = estado;
        this.nomb = nomb;
        this.correo = correo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
       return nomb;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(int Municipio) {
        this.Municipio = Municipio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
 public String getNomb() {
        return nomb;
    }
    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
