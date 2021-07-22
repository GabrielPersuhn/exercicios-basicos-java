package br.com.letscode.java.exercicios;

public class ExercicioOnze {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 1;
        int delta;

        delta = (b*b) + (-4*a*c);
        System.out.println("Delta = " + delta);

        double x1 = (-b + Math.sqrt(delta)) / 2d*a;
        double x2 = (-b - Math.sqrt(delta)) / 2d*a;
        System.out.println(x1);
        System.out.println(x2);

    }
}
