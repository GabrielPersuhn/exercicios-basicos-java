package br.com.letscode.java.exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String word = input.next();
        int count = 1;
        char[] upper = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (!(count % 2 == 0)) {
                upper[i] = Character.toUpperCase(upper[i]);
                count++;
                System.out.print(upper[i]);
            } else {
                upper[i] = Character.toLowerCase(upper[i]);
                count++;
                System.out.print(upper[i]);
            }
        }
    }
}
