/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex04;

/**Crie uma interface chamada Redimensionavel com um método 
 * redimensionar(double fator) que redimensiona um objeto geométrico. 
 * Em seguida, implemente essa interface em uma classe chamada Circulo para 
 * redimensionar o raio do círculo pelo fator fornecido.
 *
 * @author eduro
 */
class Circulo implements Redimensionavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void redimensionar(double fator) {
        raio *= fator;
    }

}