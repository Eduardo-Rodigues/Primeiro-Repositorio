/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author eduro
 */
public class ContaBancaria {
    private String cliente;
    private int num_conta;
    protected float saldo;
    public ContaBancaria (String cliente, int num_Conta, float saldo){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    public String getCliente(){
        return cliente;
    }
    public int getNum_conta(){
        return num_conta;
    }
    public float getSaldo(){
        return saldo;
    }
    public void sacar(float valor){
        if(saldo - valor >=0){
            saldo -=valor;
            System.out.println("Saque realizado com sucesso."+ saldo);
        }else {
            System.out.println("Saldo Insuficiente para realizar o saque.");
        }
    }
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    
}
