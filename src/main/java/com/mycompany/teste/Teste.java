/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 * se 10 maior que 20 
 * @author eduro
 */

import java.util.Scanner;
public class Teste {
    
    public static void main(String[] args) {
        int medidaT_A, medidaT_B;
        double area;
        Scanner  read = new Scanner (System.in);
        
        System.out.println("Para calcular a area de um triangulo informe a base: ");
        medidaT_A = read.nextInt();
        
        System.out.println("Informe a 2° medida : ");
        medidaT_B = read.nextInt();
        
        area = (medidaT_A *medidaT_B)/2;
        System.out.println("A area do triangulo é "+area);
        
    }
    
}
