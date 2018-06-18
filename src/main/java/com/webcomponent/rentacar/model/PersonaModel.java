/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webcomponent.rentacar.model;
import java.util.Date;
/**
 *
 * @author 19947450-2
 */
public class PersonaModel {
    private int idPersona;
    private String Rut;
    private String Nombre;
    private String Apellido;
    private Date fechaNacimiento;
    private String Telefono;
    private String Direccion1;
    private String Direccion2;
    private CiudadModel Ciudad;
    private TipoPersonaModel TipoPersona;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion1() {
        return Direccion1;
    }

    public void setDireccion1(String Direccion1) {
        this.Direccion1 = Direccion1;
    }

    public String getDireccion2() {
        return Direccion2;
    }

    public void setDireccion2(String Direccion2) {
        this.Direccion2 = Direccion2;
    }

    public CiudadModel getCiudad() {
        return Ciudad;
    }

    public void setCiudad(CiudadModel Ciudad) {
        this.Ciudad = Ciudad;
    }

    public TipoPersonaModel getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(TipoPersonaModel TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
    
    
}
