package desafio.desafio03;

//Leia um vetor de 10 posições e verifique se existem valores iguais e os escreva.

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma quantidade de numeros para comparar: ");
        int quantidade = scanner.nextInt();
        boolean repetiu = false;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Números repetidos :" + vetor[i]);
                    repetiu = true;
                }
            }
        }

        if (!repetiu){
            System.out.println("Não há números repetidos");
        }

        scanner.close();
    }
}
