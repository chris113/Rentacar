/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webcomponent.rentacar.model;

/**
 *
 * @author 19947450-2
 */
public class MarcaModel {
      private int idMarca;
    private String nombreMarca;
     private String Detalle;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public MarcaModel() {
    }

    public MarcaModel(String nombreMarca, String Detalle) {
        this.nombreMarca = nombreMarca;
        this.Detalle = Detalle;
    }

    private MarcaModel(int idMarca, String nombreMarca, String Detalle) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
        this.Detalle = Detalle;
    }
      
}
