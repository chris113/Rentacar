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
public class RegionModel {
      private int idRegion;
    private String nombreRegion;
    private String detalleRegion;

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getDetalleRegion() {
        return detalleRegion;
    }

    public void setDetalleRegion(String detalleRegion) {
        this.detalleRegion = detalleRegion;
    }
    
}
