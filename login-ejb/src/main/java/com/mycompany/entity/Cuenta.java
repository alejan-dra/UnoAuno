/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author alejandra
 */
@Entity
@Table
public class Cuenta implements Serializable {
    private int id;
    private String numeroCuenta;
    
    private Inversor inversor;

    public Cuenta(int id, String numeroCuenta, Inversor inversor) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.inversor = inversor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Inversor getInversor() {
        return inversor;
    }

    public void setInversor(Inversor inversor) {
        this.inversor = inversor;
    }

    

   
}

