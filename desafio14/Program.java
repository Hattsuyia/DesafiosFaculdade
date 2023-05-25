package desafio.desafio14;

import java.util.Scanner;

//DESAFIO 14
//*Nível*: Medium
//*Tema*: Laço de Repetição + Array + IF/ELSE
//*[Proposta do Desafio]*
//`Faça um programa que receba dez números, calcule a soma de todos os números e
// mostre os números pares e depois os números ímpares`
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros serão adicionados para execução do programa? ");
        int num = scanner.nextInt();
        int[] vetorNumeros = new int[num];
        int somaVetor=0;

        for (int i = 0; i <num ; i++) {
            System.out.print((i+1)+"o número: ");
            vetorNumeros[i] = scanner.nextInt();
            somaVetor += vetorNumeros[i];
        }

        System.out.println("Soma dos numeros é: "+ somaVetor);

        System.out.println("Números pares:");
        for (int i = 0; i < vetorNumeros.length ; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                System.out.println(vetorNumeros[i]);
            }
        }

        System.out.println("Números ímpares:");
        for (int i = 0; i < vetorNumeros.length ; i++) {
            if (vetorNumeros[i] % 2 != 0) {
                System.out.println(vetorNumeros[i]);
            }
        }

        scanner.close();
    }
}
