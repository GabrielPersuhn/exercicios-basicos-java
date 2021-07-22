package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        String nome;
        double altura, peso;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        nome = input.nextLine();
        System.out.println("Informe seu peso (usando virgula):");
        peso = input.nextDouble();
        System.out.println("Informe sua altura (usando virgula):");
        altura = input.nextDouble();


        double imc = peso / Math.pow(altura, 2);
        if (imc < 18.5 || imc > 25) {
            System.out.printf("%s esta fora do peso ideal com imc=%.2f\n", nome, imc);
        } else
            System.out.printf("%s esta dentro do peso ideal com imc=%.2f\n", nome, imc);
    }
}

