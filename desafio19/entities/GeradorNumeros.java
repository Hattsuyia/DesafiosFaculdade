package desafio.desafio19.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeradorNumeros {
    // Método para ler os números a serem gerados
    public static int[] lerNumeros(Scanner scanner, GeradorNumeros geradorNumeros) {

        System.out.println("Quantos numeros serão gerados?");
        int qtd = scanner.nextInt();

        System.out.println("Qual numero minimo?");
        int minimo = scanner.nextInt();

        System.out.println("Qual numero maximo");
        int maximo = scanner.nextInt();

        return gerarNumeros(qtd, minimo, maximo);
    }
    // Método para gerar os números aleatórios dentro de um intervalo
    public static int[] gerarNumeros(int qtdDeNumeros, int numeroInicial, int numeroFinal) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeroAleatorio = new int[qtdDeNumeros];

        for (int i = 0; i < numeroAleatorio.length; i++) {
            // Gera um número aleatório entre o número inicial e o número final (inclusivos)
            numeroAleatorio[i] = random.nextInt(numeroFinal - numeroInicial + 1) + numeroInicial;
        }
        return numeroAleatorio;
    }
    // Método para imprimir os números em ordem crescente
    public static void imprimirNumeros(int[] array) {
        Arrays.sort(array);
        for (int numero : array) {
            System.out.println(numero + " ");
        }
        System.out.println();
    }
    // Método para adicionar os números únicos de um array em uma lista
    public static void adicionarNumerosUnicos(ArrayList<Integer> numerosUnicosList, int[] array) {
        for (int numero : array) {
            if (!numerosUnicosList.contains(numero)) {
                numerosUnicosList.add(numero);
            }
        }
    }
    // Método para unir os arrays removendo números repetidos
    public static int[] unirArrays(int[] array1, int[] array2, int[] array3) {
        ArrayList<Integer> numerosUnicosList = new ArrayList<>();

        adicionarNumerosUnicos(numerosUnicosList, array1);
        adicionarNumerosUnicos(numerosUnicosList, array2);
        adicionarNumerosUnicos(numerosUnicosList, array3);

        int[] numerosUnicos = new int[numerosUnicosList.size()];
        for (int i = 0; i < numerosUnicosList.size(); i++) {
            numerosUnicos[i] = numerosUnicosList.get(i);
        }
        return numerosUnicos;
    }
}