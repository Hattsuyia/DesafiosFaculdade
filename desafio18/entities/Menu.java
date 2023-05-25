package desafio.desafio18.entities;

import java.util.Scanner;

public class Menu {
    private Tamagushi tamagushi;

    public Menu(Tamagushi tamagushi) {
        this.tamagushi = tamagushi;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 5) {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Dormir");
            System.out.println("2 - Comer");
            System.out.println("3 - Brincar");
            System.out.println("4 - Humor");
            System.out.println("5 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> {
                    tamagushi.dormir();
                    if (tamagushi.getIdade() == 10) {
                        escolha = 5;
                    }
                }
                case 2 -> {
                    System.out.println("Obg estava com fome");
                    tamagushi.comer();
                }
                case 3 -> {
                    System.out.println("Eu gosto de brincar!!!");
                    tamagushi.brincar();
                }
                case 4 -> {
                    tamagushi.humor();
                    System.out.println("Saude: " + tamagushi.getSaude());
                    System.out.println("Fome: " + tamagushi.getFome());
                }
                case 5 -> System.out.println("Encerrando o programa");
                default -> System.out.println("Opção inválida");
            }
            System.out.println();
        }
        scanner.close();
    }
}
