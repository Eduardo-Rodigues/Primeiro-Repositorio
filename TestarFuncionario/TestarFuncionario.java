/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testarfuncionario;

/**
 *
 * @author eduro
 */
public class TestarFuncionario {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("José", 1800.95f);
        System.out.println(empregado1);

        Gerente gerente1 = new Gerente("Ana", 5500.48f, "Vendas");
        System.out.println(gerente1);

        Vendedor vendedor1 = new Vendedor("Maria", 2200.0f, 11.0f);
        System.out.println(vendedor1);
    }
}
