package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        System.out.println("Escreva abaixo a palavra que você deseja ver ao contrario:");
        Scanner input = new Scanner(System.in);
        String palavra = input.next();
        char[] letras = palavra.toCharArray();
        System.out.println("O inverso da sua palavra é:");
        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i]);
        }

    }
}
