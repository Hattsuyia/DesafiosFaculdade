package desafio.desafio05;

//Faça um programa que leia um número e uma letra,
// e verifique se a letra digitada é vogal ou consoante, e se o número digitado é impar ou par

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vogais = "aeiouAEIOU";

        System.out.println("Digite um caracter (letra, numero ou simbolo): ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " é um número par");
            } else {
                System.out.println(num + " é um número ímpar");
            }
        } else {
            char ch = scanner.next().charAt(0);
            if (Character.isLetter(ch)) {
                if (vogais.contains(String.valueOf(ch))) {
                    if (Character.isUpperCase(ch)) {
                        System.out.println("A letra digitada é uma vogal maiuscula: " + ch);
                    } else {
                        System.out.println("Você digitou uma vogal minuscula: " + ch);
                    }
                } else if (Character.isUpperCase(ch)) {
                    System.out.println("Você digitou uma consoante maiuscula: " + ch);
                } else {
                    System.out.println("Você digitou uma consoante minuscula: " + ch);
                }
            } else {
                System.out.println("É um caractere especial " + ch);
            }
            scanner.close();
        }
    }
}
