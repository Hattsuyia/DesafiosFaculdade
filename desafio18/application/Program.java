package desafio.desafio18.application;

import desafio.desafio18.entities.Menu;
import desafio.desafio18.entities.Tamagushi;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual nome do seu Tamagoshi?");
        String nome = scanner.nextLine();

        System.out.println("Ola eu sou " + nome);

        System.out.print("Qual meu nivel de fome? ");
        double fome = scanner.nextDouble();

        System.out.print("Qual meu nivel de saude? ");
        double saude = scanner.nextDouble();

        Tamagushi tamagushi = new Tamagushi(nome, fome, saude,1);
        Menu menu = new Menu(tamagushi);
        menu.exibirMenu();

        scanner.close();
    }
}
