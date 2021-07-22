package br.com.letscode.java.exercicios;

public class ExercicioSete {
    public static void main(String[] args) {
        String[] nomes = {"Gabriell", "Grazy", "Ronaldo", "Messi", "Neymar"};
        int[] idade = {20, 19, 45, 31, 29};
        int menorIdade = 0, maiorIdade = 0;
        double mediaIdade = 0;


        for (int i=0; i < nomes.length; i++){
            if (idade[i] > idade[maiorIdade]){
                maiorIdade = i;
            }
            if (idade[i] < idade[menorIdade]){
                menorIdade = i;
            }
            mediaIdade += idade[i];
        }
        System.out.println("A maior idade é " + nomes[maiorIdade]);
        System.out.println("A menor idade é " + nomes[menorIdade]);
        System.out.println("A media de idades é " + mediaIdade/idade.length);
    }
}
