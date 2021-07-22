package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 5 nomes: ");
        int maiorNome = 0;
        int indiceNoArray = 0;

        for (int i = 0; i < 5; i++) {
            nomes[i] = input.nextLine();
            if (nomes[i].length() > maiorNome) {
                maiorNome = nomes[i].length();
                indiceNoArray = i;
            }
        }
        System.out.println("O maior nome é " + nomes[indiceNoArray]);
    }
}