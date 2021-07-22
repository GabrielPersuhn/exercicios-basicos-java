package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int menor = 1000000;
        float media = 0;
        float somaTotal = 0;

        System.out.println("Digite 5 numeros: ");

        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            somaTotal = somaTotal + numeros[i];
        }
        media = somaTotal / 5;

        System.out.printf("O maior número digitado foi %d, o menor número é %d e a média é %.2f", maior, menor, media);
    }
}
