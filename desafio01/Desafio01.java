package desafio.desafio01;

//Faça um programa que receba CINCO números e verifique (usando if e else) e imprima o maior dentre todos eles.

import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar? ");
        int n = scanner.nextInt();

        double maiorNumero = Double.NEGATIVE_INFINITY;
        double menorNumero = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {

            System.out.println("Digite o " + i + "o número: ");
            double n1 = scanner.nextDouble();

            if (n1 < menorNumero) {
                menorNumero = n1;
            }
            if (n1 > maiorNumero) {
                maiorNumero = n1;
            }
        }
        System.out.println("Maior número é: " + maiorNumero);
        System.out.println("Menor número é: " + menorNumero);

        scanner.close();
    }
}
