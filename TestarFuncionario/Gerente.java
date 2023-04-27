/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testarfuncionario;

/**
 *
 * @author eduro
 */
public class Gerente extends Empregado {
    private String departamento;

    public Gerente(String nomeFuncionario, float salario, String departamento) {
        super(nomeFuncionario, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}

