package desafio.desafio14.entities;

import java.util.Scanner;

public class Numeros {
    private int[] numeros;

    public Numeros (int tamanho){
        numeros = new int[tamanho];
    }
    public void lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1) + "o número: ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
    }
    public int soma (){
        int somaVetor = 0;
        for (int i = 0; i < numeros.length ; i++) {
            somaVetor += numeros[i];
        }
        return somaVetor;
    }
    public void exibirPares (){
        System.out.println("Numeros Pares");
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]%2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
    public void exibirImpares (){
        System.out.println("Numeros Imares");
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]%2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
