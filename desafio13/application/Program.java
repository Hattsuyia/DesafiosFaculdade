package desafio.desafio13.application;

//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//> *Álcool*:
//> Até 20 litros: desconto de 3% por litro
//> Acima de 20 litros: Desconto de 5% por litro 99.
//▫️*Gasolina*:
//> Até 20 litros: desconto de 4% por litro
//> Acima de 20 litros, desconto de 6% por litro
//-> Escreva um algoritmo que leia
//> o número de litros vendidos
//> o tipo de combustível
//(codificado da seguinte forma: A-álcool. G-gasolina), calcule e imprima o valor a ser pago pelo cliente.

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double custoTotal = 0;
        double alcool = 3.50;
        double gasolina = 5.50;
        double desconto = 0;

        System.out.println("Qual tipo de combutivel vc deseja abastecer? Alcool ou Gasolina ");
        char ch = scanner.next().toUpperCase().charAt(0);
        System.out.println("Quantos litros deseja abastecer? ");
        double qtdAbastecida = scanner.nextDouble();

        if (ch == 'A'){
            System.out.println("Certo. Alcool o valor do Alcool hoje é : R$"+alcool);

            custoTotal = qtdAbastecida*alcool;
            if (qtdAbastecida > 20){

                desconto = custoTotal*0.05;
                custoTotal = custoTotal - desconto;
                System.out.println("A margem de desconto é de 5%");
                System.out.println("O valor do desconto é de: " + desconto);
                System.out.println("O valor total a pagar é de: " + custoTotal);
            } else {
                desconto = custoTotal*0.03;
                custoTotal = custoTotal - desconto;
                System.out.println("A margem de desconto é de 3%.");
                System.out.println("O valor do desconto é de: " + desconto);
                System.out.println("O valor total a pagar é de: " + custoTotal);
            }
        } else {
            System.out.println("Certo. Gasolina o valor da Gasolina hoje é : R$" + gasolina);
            custoTotal = qtdAbastecida * gasolina;

            if (qtdAbastecida > 20) {
                desconto = custoTotal * 0.06;
                custoTotal = custoTotal - desconto;
                System.out.println("A margem de desconto é de 6%");
                System.out.println("O valor do desconto é de: " + desconto);
                System.out.println("O valor total a pagar é de: " + custoTotal);
            } else {
                desconto = custoTotal * 0.04;
                custoTotal = custoTotal - desconto;
                System.out.println("A margem de desconto é de 4%.");
                System.out.println("O valor do desconto é de: " + desconto);
                System.out.println("O valor total a pagar é de: " + custoTotal);
            }
        }
            scanner.close();
    }
}
