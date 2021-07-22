package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {

        Scanner peso = new Scanner(System.in);
        System.out.println("Escreva seu peso em KGs: ");
        double pesoPessoa = peso.nextFloat();

        final float FATOR_CONVERSAO = 2.20462f;
        System.out.printf("O seu peso em libras é de %f", pesoPessoa * FATOR_CONVERSAO);
    }
}
