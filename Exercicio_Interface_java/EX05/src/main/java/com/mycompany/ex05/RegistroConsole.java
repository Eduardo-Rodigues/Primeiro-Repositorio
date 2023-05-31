/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex05;

/**
 *
 * @author eduro
 */
class RegistroConsole implements Registravel {
    @Override
    public void registrar(String mensagem) {
        System.out.println("Mensagem de log: " + mensagem);
    }
}