package desafio.desafio15.application;
//DESAFIO 15
//
//[Proposta do Desafio]
//
//Leia 5 nomes de alunos, e nota av1 e av2, e informe quem foi aprovado e quem foi reprovado e quem ficou de final. E se ficou de final, se foi aprovado ou reprovado.
//nota final = (av1+av2)/2
//se nota final maior ou igual a 7 => aprovado
//se nota final entre 4 ou 6.9 => faz final
//se nota final menor ou igual a 3.9  => reprovado
//se ficou de final o calculo é esse
//(nota final + final)/2 = media final
//se media final igual ou maior que 5  => aprovado
//se media final igual ou menor que 4.9 => reprovado
import desafio.desafio15.entities.Alunos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos:");
        int qtdAlunos = scanner.nextInt();

        Alunos[] alunos = new Alunos[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.next();

            double[] notas = new double[2];
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota " + (j+1) + " do aluno " + nome + ":");
                notas[j] = scanner.nextDouble();
            }

            alunos[i] = new Alunos(nome, notas);
        }

       for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno(a) "+alunos[i].getNome() + ": " + alunos[i].getStatus());
        }
    }
}
