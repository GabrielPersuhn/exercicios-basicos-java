package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {
        Init();
    }
    public static void Init(){
        /* Escreva um programa que recebe dois números inteiros
         * e informe o resultado das operações: soma, subtração, multiplicação e divisão.
         * Considere sempre a ordem em que foram informados.*/
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        a = input.nextInt();
        System.out.println("Informe o segundo número: ");
        b = input.nextInt();

        System.out.printf("Soma: %d\n", a+b);
        System.out.printf("Subtração: %d\n", a-b);
        System.out.printf("Multiplicação: %d\n", a*b);
        System.out.printf("Exponenciação (a^b): %f\n", Math.pow(a,b));

        //Se b = 0 então informe uma mensagem
        //Senão informe o resultado
        if (b == 0) {
            System.out.println("Esta é uma divisão por zero. ");
        } else {
            System.out.printf("Divisão: %f\n", ((float) a) / b);
        }
    }
}
