package Desafios.src.desafio.desafio09.application;

import Desafios.src.desafio.desafio09.entities.Calcular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean opcao = false;

        while (!opcao) {

            try {
                System.out.println("Digite qual tabuada deseja que seja calculada");
                int numero = scanner.nextInt();

                Calcular calcular = new Calcular();

                calcular.calcularProduto(numero);
                opcao = true;

            } catch (InputMismatchException e) {
                System.out.println("Não foi digitado um numero");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
