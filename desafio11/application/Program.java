package desafio.desafio11.application;

import desafio.desafio11.entities.Sorteio;
import java.util.Scanner;

//DESAFIO 11
//Faça um programa que sorteia um numero aleatorio entre 1 e 10, e que o usuario tente descobrir que numero é esse.
//(pode implementar quantidade de chances ou não. `

public class Program {
    public static void main(String[] args) {
        final int NUM_CHANCES = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao jogo da adivinhação!!!");
        System.out.println("Aqui vou escolher um numero até 10 e vc deve adivinha-lo");
        System.out.println("Vamos lá!!!! Tente adivinhar qual numero estou pensando!!!");
        System.out.println();

        Sorteio sorteio = new Sorteio();
        sorteio.sorteioNumero();

        boolean acertou = false;

        for (int i = 1; i <= NUM_CHANCES ; i++) {
            System.out.print("Tentativa "+i+ ": ");
            int tentativa = scanner.nextInt();

            if (tentativa == sorteio.getNumeroAleatorio()){
                System.out.println("Parabens vc acertou!!!! O numero era: " + tentativa);
                acertou = true;
                break;
            } else if (tentativa < sorteio.getNumeroAleatorio()) {
                System.out.println("HoHoHo...O numero que escolhi é maior!!!");
            } else {
                System.out.println("HaHaHa...O numero que escolhi é menor!!!");
            }
        }

        if (!acertou) {
            System.out.println("Dançou irmão!!!! O número era: " + sorteio.getNumeroAleatorio());
        }

        scanner.close();
    }
}
