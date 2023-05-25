package desafio.desafio02;
//Faça um programa que leia cinco valores (A, B, C, D, E) e mostre-os na ordem lida.
// Em seguida, mostre-os em ordem crescente e decrescente.

import java.util.*;

public class Desafio02 {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos numeros deseja digitar: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {

            System.out.println("Digite o # " + i+"o numero: ");
            list.add(scanner.nextInt());
        }

        System.out.println("Numeros digitados: " + list);

        Collections.sort(list);
        System.out.println("Numeros em ordem crescente: " + list);

        Collections.reverse(list);
        System.out.println("Numeros em ordem decrescente: "+ list);

        scanner.close();
    }
}
