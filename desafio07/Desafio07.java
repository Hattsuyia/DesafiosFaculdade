package desafio.desafio07;
//Leia um vetor de 10 posições, gerado de forma aleatória de 1 a 15,
// e verifique se existem valores iguais e os escreva.

import java.util.Random;
import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite uma quantidade de numeros para comparar: ");
        int quantidade = scanner.nextInt();
        boolean repetiu = false;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Sera gerado " + (i + 1) + "o número: ");
            vetor[i] = random.nextInt(30);
            System.out.println(vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Números repetidos :" + vetor[i]);
                    repetiu = true;
                }
            }
        }
        System.out.println("");
        if (!repetiu) {
            System.out.println("Não há números repetidos");
        }
        scanner.close();
    }
}
