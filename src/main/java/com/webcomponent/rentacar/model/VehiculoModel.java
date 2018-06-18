/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webcomponent.rentacar.model;

import java.util.ArrayList;

/**
 *
 * @author 19947450-2
 */
public class VehiculoModel {
    private int idVehiculo;
    private String Patente;
    private int Valor;
    private int Año;
    private String Color;
    private TipoVehiculoModel TipoVehiculo;
    private VersionModel Version;

      public static ArrayList<VehiculoModel> vehiculos = new ArrayList<>();
    
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public TipoVehiculoModel getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculoModel TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public VersionModel getVersion() {
        return Version;
    }

    public void setVersion(VersionModel Version) {
        this.Version = Version;
    }
    
}
