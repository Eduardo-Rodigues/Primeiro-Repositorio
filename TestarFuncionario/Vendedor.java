/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testarfuncionario;

/**
 *
 * @author eduro
 */
public class Vendedor extends Empregado {
    private float porcentagemComissao;

    public Vendedor(String nomeFuncionario, float salario, float porcentagemComissao) {
        super(nomeFuncionario, salario);
        this.porcentagemComissao = porcentagemComissao;
    }

    public float getPercentualComissao() {
        return porcentagemComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public float calcularSalario() {
        return salario * (1 + porcentagemComissao/100);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Salário sem comissão: " + formatarSalario() +
                ", Salário com comissão: " + formatarSalario(calcularSalario()) +
                ", Percentual de comissão: " + porcentagemComissao + "%";
    }
    
    public String formatarSalario(float salario) {
        return String.format("R$ %.2f", salario);
    }
}

