/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author eduro
 */
abstract class Animal {
    public abstract void emitirSom();
    public abstract void mover();
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late.");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre.");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia.");
    }

    @Override
    public void mover() {
        System.out.println("O gato pula.");
    }
}