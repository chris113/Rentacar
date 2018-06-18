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
public class DevolucionModel {
    private int idDevolucion;
    private Date fechaDevoulucion;
    private ArriendoModel Arriendo;

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Date getFechaDevoulucion() {
        return fechaDevoulucion;
    }

    public void setFechaDevoulucion(Date fechaDevoulucion) {
        this.fechaDevoulucion = fechaDevoulucion;
    }

    public ArriendoModel getArriendo() {
        return Arriendo;
    }

    public void setArriendo(ArriendoModel Arriendo) {
        this.Arriendo = Arriendo;
    }
    
    
}
