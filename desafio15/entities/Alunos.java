package desafio.desafio15.entities;

import java.util.Scanner;

public class Alunos {
    private String nome;
    private double[] notas;

    public Alunos(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double getMediaFinal() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus() {
        double media = getMediaFinal();
        if (media >= 70) {
            return "Aprovado";
        } else if (media >= 40) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(nome + " ficou com media: " + media);
            System.out.println("Digite a nota da prova final: ");
            double finalExam = scanner.nextDouble();
            media = (media + finalExam) / 2;
            if (media >= 50) {
                return "Aprovado após final";
            } else {
                return "Reprovado após final";
            }
        } else {
            return "Reprovado";
        }
    }
}