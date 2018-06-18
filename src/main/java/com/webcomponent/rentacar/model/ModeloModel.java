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
public class ModeloModel {
    private int idModelo;
    private String nombreModelo;
    private String detalle;
    private MarcaModel Marca;
    
      public static ArrayList<ModeloModel> modelos = new ArrayList<>();

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public MarcaModel getMarca() {
        return Marca;
    }

    public void setMarca(MarcaModel Marca) {
        this.Marca = Marca;
    }

    public ModeloModel() {
    }

    
    public ModeloModel(String nombreModelo, String detalle, MarcaModel Marca) {
        this.nombreModelo = nombreModelo;
        this.detalle = detalle;
        this.Marca = Marca;
    }

    private ModeloModel(int idModelo, String nombreModelo, String detalle, MarcaModel Marca) {
        this.idModelo = idModelo;
        this.nombreModelo = nombreModelo;
        this.detalle = detalle;
        this.Marca = Marca;
    }

  
}
