package desafio.desafio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioTest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;

        while (quantidade <= 0) {
            try {
                System.out.println("Digite uma quantidade de numeros para comparar: ");
                quantidade = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite uma quantidade valida");
                scanner.nextLine();
                }
        }

        int[] num = desafio.desafio07.VerificarNumeros.gerarNumerosAletorios(quantidade, 30);

        int[] numerosRepetidos = desafio.desafio07.VerificarNumeros.contemNumerosRepetidos(num);

        if (numerosRepetidos.length>0){
            System.out.println("Há numeros repetidos");

            for (int numerosRepetido : numerosRepetidos) {
                System.out.println(numerosRepetido);
            }
        } else{
            System.out.println("Não há numeros repetidos");
        }
        scanner.close();
    }
}
