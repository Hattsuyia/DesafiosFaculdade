package Desafios.src.desafio.desafio08.application;

//Faça um programa que peça os 3 lados de um triângulo.
// O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
// Também faça receber 4 lados e indique se é um quadrado ou um retângulo.

//soma de A + B for = C o triangulo não pode existir

import Desafios.src.desafio.desafio08.entites.FiguraGeometrica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tipo de figura vc vai escolher? Quadrado ou Triangulo? ");
        char ch = scanner.next().charAt(0);

        if (ch == 'Q' || ch == 'q') {
            try {
                System.out.println("Digite os 4 lados do quadrado: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double d = scanner.nextDouble();
                if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
                    throw new IllegalArgumentException("Valores inválidos. Insira apenas números positivos.");
                }
                FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
                figuraGeometrica.quadrado(a, b, c, d);

            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Valor Inválido. Apenas numeros positivos e diferentes de zero");
            }
        } else if (ch == 'T' || ch == 't') {
            try {
                System.out.println("Digite os 3 lados do trinangulo: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new IllegalArgumentException("Valores inválidos. Insira apenas " +
                            "números positivos e diferentes de zero.");
                }

                FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
                figuraGeometrica.triangulo(a, b, c);
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Valor Inválido. Apenas numeros positivos");
            }
        } else {
            System.out.println("Não é uma das opções");
        }
        scanner.close();
    }
}