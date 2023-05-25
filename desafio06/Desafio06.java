package desafio.desafio06;

//Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
//A quantidade de pessoas com mais de 90 quilos;
//A média das idades das sete pessoas

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeTotal = 0;
        double pesoMaisNoventa = 0;

        System.out.print("Digite quantas pessoas serão adicionadas: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Digite a idade da "+i+"a pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso da "+i+"a pessoa: ");
            double peso = scanner.nextDouble();
            if (peso >= 90) {
                pesoMaisNoventa++;
            }
            idadeTotal += idade;
       }
        double media = (double)idadeTotal/n;

        System.out.println("Quantidade de pessoas acima de 90kg: " + pesoMaisNoventa);
        System.out.println("Média da idade das pessoas: " + media);

        scanner.close();
    }
}
