/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testaringresso;

/**
 *
 * @author eduro
 */
public class TestarIngresso {

    public static void main(String[] args) {
        Ingresso objIngresso = new Ingresso(80);
        IngressoVip objIngressoVip = new IngressoVip(120, 45);

        System.out.println(objIngresso);
        System.out.println(objIngressoVip);
    }
}
