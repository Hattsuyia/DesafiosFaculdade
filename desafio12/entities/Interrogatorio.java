package desafio.desafio12.entities;

import java.util.Scanner;

public class Interrogatorio {
    private String [] perguntas;
    private String [] respostas;
    private Scanner scanner;

    public Interrogatorio() {
        perguntas = new String[]{
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        respostas = new String[5];

        scanner = new Scanner(System.in);
    }
    public void fazerPerguntas (){
        for (int i = 0; i < perguntas.length ; i++) {
            System.out.println(perguntas[i]);
            respostas[i] = scanner.nextLine().toLowerCase();
        }
    }
    public void classificacaoParticipacao (){
        int participacao =0;

        for (String resposta : respostas) {
            if (resposta.toLowerCase().startsWith("s")){
                participacao++;
            }
        }

        if (participacao == 2){
            System.out.println("Suspeita");
        } else if (participacao == 3 || participacao == 4) {
            System.out.println("Cúmplice");
        } else if (participacao == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
