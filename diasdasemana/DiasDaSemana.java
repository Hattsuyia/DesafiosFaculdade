package desafio.diasdasemana;

import java.util.Scanner;
//Fazer um programa para ler um valor inteiro de 1 a 7 representando um
//dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
//Escrever na tela o dia da semana correspondente, conforme exemplos.
//Entrada Saída
//1 Dia da semana: domingo
//Entrada Saída
//4 Dia da semana: quarta
//Entrada Saída
//9 Dia da semana: valor inválido
public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();

            switch (numero) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda");
                case 3 -> System.out.println("Terça");
                case 4 -> System.out.println("Quarta");
                case 5 -> System.out.println("Quinta");
                case 6 -> System.out.println("Sexta");
                case 7 -> System.out.println("Sábado");
                default -> {
                    System.out.println("entrada inválida");
                    System.out.println("Repita a entrada");
                    continue;
                }
            }
            break;
        }
        scanner.close();
    }
}
