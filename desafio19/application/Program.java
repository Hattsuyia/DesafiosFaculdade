package desafio.desafio19.application;

import desafio.desafio19.entities.GeradorNumeros;

import java.util.Scanner;

import static desafio.desafio19.entities.GeradorNumeros.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeradorNumeros geradorNumeros = new GeradorNumeros();

        int [] array1 = lerNumeros(scanner, geradorNumeros);
        imprimirNumeros(array1);
        int [] array2 = lerNumeros(scanner, geradorNumeros);
        imprimirNumeros(array2);
        int [] array3 = lerNumeros(scanner, geradorNumeros);
        imprimirNumeros(array3);

        int[]numerosUnicos = unirArrays(array1, array2, array3);

        System.out.println("Array com numeros unicos");
        imprimirNumeros(numerosUnicos);

    }
}
