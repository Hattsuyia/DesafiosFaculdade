//DESAFIO 10
//*Nível*: Medium
//*Tema*: Array
//*[Proposta do Desafio]*
//`Faça um programa que sorteia um dos 5 alunos, ler nome dos 5 alunos e escrevendo nome do escolhido.

package desafio.desafio10.application;

import desafio.desafio10.entities.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List <Pessoa> list = new ArrayList<>();

        System.out.println("Quantos nomes você deseja digitar para sortear?");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {

            System.out.print(i+"#: ");
            String nome = scanner.nextLine();
            list.add(new Pessoa(nome));

        }

        Pessoa indiceAleatorio = list.get(random.nextInt(list.size()));

        String nomeAleatorio = indiceAleatorio.getNome();

        System.out.println("Nome sorteado foi: "+ nomeAleatorio);

        scanner.close();
    }
}
