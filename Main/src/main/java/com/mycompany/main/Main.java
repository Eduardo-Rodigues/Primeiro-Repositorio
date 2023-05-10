/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**     Criar uma claase Main com um metodo main() que cria um objeto Cachorro)() 
 * e um objeto Gato() e chama os metodos emitirSom() ew mover() em cada objeto.
 * Croar uma subclasse abrstrata chamada animal com os seguintes metodos abstratos: emitirSom() sem parametros e sem retorno
 * mover(): sem parametros e sem retorno.
 * Em seguida, criar duas subclasses da classe Animal chamada Cachorro e Gato.
 * Implementar os métodos abstratos para cada animal.
 *
 * @author eduro
 */
public class Main {
    
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.mover();

        gato.emitirSom();
        gato.mover();
    }
}
