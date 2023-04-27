/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testaringresso;

/**
 *
 * @author eduro
 */
public class IngressoVip extends Ingresso{
    private float valorAdicional;

    public IngressoVip(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
       return "Valor do ingresso VIP: R$ " + (valor + valorAdicional);
    }
}
