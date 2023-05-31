/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex05;

/**Crie uma interface chamada Registravel com um método registrar(String mensagem) 
 * que registra uma mensagem de log. 
 * Em seguida, implemente essa interface em uma 
 * classe chamada RegistroConsole que exibe a mensagem de log no console
 *
 * @author eduro
 */
public class EX05 {

    public static void main(String[] args) {
        Registravel registro = new RegistroConsole();
        registro.registrar("Mensagem Registrada com sucesso");
    }
}
