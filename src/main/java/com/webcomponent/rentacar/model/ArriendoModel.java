/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webcomponent.rentacar.model;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author 19947450-2
 */
public class ArriendoModel {
    private int idArriendo;
    private Date fechaArriendo;
    private PersonaModel Vendedor;
    private PersonaModel Cliente;
    private VehiculoModel Vehiculo;
    private MedioPagoModel MedioPago;

    public static ArrayList<ArriendoModel> arriendos = new ArrayList<>();
            
    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
        this.idArriendo = idArriendo;
    }

    public Date getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(Date fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public PersonaModel getVendedor() {
        return Vendedor;
    }

    public void setVendedor(PersonaModel Vendedor) {
        this.Vendedor = Vendedor;
    }

    public PersonaModel getCliente() {
        return Cliente;
    }

    public void setCliente(PersonaModel Cliente) {
        this.Cliente = Cliente;
    }

    public VehiculoModel getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(VehiculoModel Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public MedioPagoModel getMedioPago() {
        return MedioPago;
    }

    public void setMedioPago(MedioPagoModel MedioPago) {
        this.MedioPago = MedioPago;
    }

    public ArriendoModel() {
    }

    public ArriendoModel(Date fechaArriendo, PersonaModel Vendedor, PersonaModel Cliente, VehiculoModel Vehiculo, MedioPagoModel MedioPago) {
        this.fechaArriendo = fechaArriendo;
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.Vehiculo = Vehiculo;
        this.MedioPago = MedioPago;
    }

   private ArriendoModel(int idArriendo, Date fechaArriendo, PersonaModel Vendedor, PersonaModel Cliente, VehiculoModel Vehiculo, MedioPagoModel MedioPago) {
        this.idArriendo = idArriendo;
        this.fechaArriendo = fechaArriendo;
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.Vehiculo = Vehiculo;
        this.MedioPago = MedioPago;
    }
    
   
}
