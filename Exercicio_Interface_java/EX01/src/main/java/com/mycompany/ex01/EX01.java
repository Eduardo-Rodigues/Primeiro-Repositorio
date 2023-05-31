/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

/**Crie uma interface chamada Desenhavel com um método desenhar() que não retorna nada.
 * Em seguida, implemente essa interface em três classes diferentes: Circulo, 
 * Retangulo e Triangulo. Cada classe deve implementar o método desenhar() 
 * para exibir o nome da forma geométrica correspondente
 * @author eduro
 *
 * @author eduro
 */
public class EX01 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
    
}
