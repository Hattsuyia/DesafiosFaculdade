package Desafios.src.desafio.desafio09.entities;

public class Calcular {

    public void calcularProduto (int numero){

        for (int i = 1; i <= 10; i++) {
            int produto = numero*i;
            System.out.println(numero + " * " + i + " = " + produto);

        }
    }
}
