package desafio.desafio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VerificarNumeros {

    public static int [] gerarNumerosAletorios (int qtd, int max ){
        Random random = new Random();
        int [] vetor = new int[qtd];
        for (int i = 0; i <vetor.length ; i++) {
            vetor[i]= random.nextInt(max);
            System.out.println("# "+(i+1)+": "+ vetor[i]);
        }
        return vetor;
    }

    public static int[] contemNumerosRepetidos(int[] vetor) {
        List<Integer> numerosRepetidos = new ArrayList<>();
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    if (!numerosRepetidos.contains(vetor[i])) {
                        numerosRepetidos.add(vetor[i]);
                    }
                }
            }
        }

        int[] arrayNumerosRepetidos = new int[numerosRepetidos.size()];
        for (int i = 0; i < numerosRepetidos.size(); i++) {
            arrayNumerosRepetidos[i] = numerosRepetidos.get(i);
        }
        return arrayNumerosRepetidos;
    }
}
