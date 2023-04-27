/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testarfuncionario;

/**
 *
 * @author eduro
 */
public class Empregado {
    private String nomeFuncionario;
    protected float salario;

    public Empregado(String nome, float salario) {
        this.nomeFuncionario = nome;
        this.salario = salario;
    }
    
    public void setNome(String nome) {
        this.nomeFuncionario = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String getNome() {
        return nomeFuncionario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeFuncionario + ", Salário: " + formatarSalario();
    }

    public String formatarSalario() {
        return String.format("R$ %.2f", salario);
    }
}
