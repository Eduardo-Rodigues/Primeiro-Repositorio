/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

/**
 *Crie uma interface chamada Ordenavel com um método ordenar() que recebe um 
 * array de inteiros e o ordena em ordem crescente. Em seguida, implemente essa
 * interface em uma classe chamada BubbleSort que implementa o algoritmo de ordenação Bubble Sort
 * 
 */
public class EX02 {

    public static void main(String[] args) {
        int[] array = {33, 18, 69, 0, 13, 9};

        Ordenavel bubbleSort = new MetodoBolha();
        bubbleSort.ordenar(array);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(" -- "+num + " -- ");
        }
    }
}
