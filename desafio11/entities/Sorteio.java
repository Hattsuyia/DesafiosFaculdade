package desafio.desafio11.entities;

import java.util.Random;

public class Sorteio {
    private Random random;
    private int numeroAleatorio;

    public Sorteio (){
        this.random = new Random();
        this.sorteioNumero();
    }
    public void sorteioNumero (){
        this.numeroAleatorio = random.nextInt(10)+1;
    }
    public int getNumeroAleatorio (){
        return this.numeroAleatorio;
    }

}
