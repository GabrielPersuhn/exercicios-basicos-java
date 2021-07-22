package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        System.out.println("Insira 5 numeros (separados pelo enter) para evr quais são ímpares e quais são pares:");
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);
        int[] numerosPares = new int[5];
        int[] numerosImpares = new int[5];
        int numPar = 0;
        int numImpar = 0;

        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 != 0) {
                numerosImpares[numImpar] = numeros[i];
                numImpar++;
            } else {
                numerosPares[numPar] = numeros[i];
                numPar++;
            }
        }
        System.out.println("Esses são os números ímpares: ");
        for (int i = 0; i < numImpar; i++) {
            System.out.println(numerosImpares[i]);
        }
        System.out.println("Esses são os números pares: ");
        for (int i = 0; i < numPar; i++) {
            System.out.println(numerosPares[i]);
        }
    }


}

