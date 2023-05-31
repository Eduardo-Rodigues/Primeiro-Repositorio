/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;

/**
 *
 * @author eduro
 */
public class EX04 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Raio antes do redimensionamento: " + circulo.getRaio());

        circulo.redimensionar(2.0);
        System.out.println("Raio após o redimensionamento: " + circulo.getRaio());
    }
}
