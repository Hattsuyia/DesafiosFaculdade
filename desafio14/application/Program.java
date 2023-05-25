package desafio.desafio14.application;

import desafio.desafio14.entities.Numeros;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros serão adicionados para execução do programa? ");
        int num = scanner.nextInt();

        Numeros numeros = new Numeros(num);

        System.out.println("Digite " +num+" números: ");
        numeros.lerNumeros();

        System.out.println("A soma dos números é: " + numeros.soma());

        numeros.exibirPares();
        numeros.exibirImpares();
    }
}
