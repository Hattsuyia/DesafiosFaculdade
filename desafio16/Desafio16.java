package desafio.desafio16;
//DESAFIO 16
//[Proposta do Desafio]
//
// Crie um jogo de dados, aonde é jogado dois dados, e quando aparecer dados iguais, quer dizer que você ganhou,
// e mostre quantas tentativas foram necessárias para tirar os dados iguais.
import java.util.Random;

public class Desafio16 {
    public static void main(String[] args) {
        Random random = new Random();

        int dado1 = 0;
        int dado2 = 1;
        int cont = 0;
        while (dado1 != dado2){
            dado1 = random.nextInt(6)+1;
            dado2 = random.nextInt(6)+1;
            cont++;
            if (dado1 != dado2){
                System.out.println("tente novamente" );
                System.out.println("Dado1 = " + dado1);
                System.out.println("Dado2 = " + dado2);
            } else {
                System.out.println("Ganhou dados iguais");
            }
        }
        System.out.println("Numero de tentativas: " + cont);
    }
}
