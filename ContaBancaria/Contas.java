/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author eduro
 */
public class Contas {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Contini", 3536, 2035.0f);
        ContaPoupanca conta2 = new ContaPoupanca("eduardo", 1369, 500.0f, 14);
        ContaEspecial conta3 = new ContaEspecial("Carlos", 3003, 80000.0f, 250000.0f);

        conta1.sacar(500.0f);
        conta1.depositar(1000.0f);

        conta2.calcularNovoSaldo(0.5f);

        conta3.sacar(2500.0f);
        conta3.sacar(1000.0f);
        conta3.depositar(500.0f);
    }
}
