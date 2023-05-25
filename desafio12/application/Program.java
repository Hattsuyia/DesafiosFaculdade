package desafio.desafio12.application;

//DESAFIO 12
//Nível: Medium
//Tema: IF e ELSE

//[Proposta do Desafio]

//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

//> “Telefonou para a vítima? “
//> “Esteve no local do crime?”
//> “Mora perto da vítima? “
//> “Devia para a vítima? “
//> “Já trabalhou com a vítima? “

//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
//Se a pessoa responder SIM em:
//2 questões ela deve ser classificada como “Suspeita”,
//3 e 4 questões -> classificada como “Cúmplice”
//5 questões -> classificada como “Assassino“.
//Caso contrário, ele será classificado como “Inocente“

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participacao = 0;
        System.out.println("-----------INVESTIGAÇÃO-----------");
        System.out.println("Responda sim ou não");
        System.out.println();

        System.out.println("Telefonou para vitima?");
        char ch = scanner.next().charAt(0);

        if (ch == 's'){
            participacao++;
        }

        System.out.println("Esteve no local do crime?");
        ch = scanner.next().charAt(0);

        if (ch == 's'){
            participacao++;
        }

        System.out.println("Mora perto da vítima?");
        ch = scanner.next().charAt(0);

        if (ch == 's'){
            participacao++;
        }

        System.out.println("Devia para a vítima?");
        ch = scanner.next().charAt(0);

        if (ch == 's'){
            participacao++;
        }

        System.out.println("Já trabalhou com a vítima?");
        ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 's'){
            participacao++;
        }

        switch (participacao) {
            case 2 -> System.out.println("Suspeita");
            case 3, 4 -> System.out.println("Cúmplice");
            case 5 -> System.out.println("Assassino");
            default -> System.out.println("Inocente");
        }
        scanner.close();
    }
}
