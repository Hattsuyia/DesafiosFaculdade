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

import desafio.desafio13.entities.Combustivel;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDesconto {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tipo de combutivel vc deseja abastecer? Alcool ou Gasolina ");
        String tipo = scanner.nextLine().toUpperCase();
        System.out.println("Quantos litros deseja abastecer? ");
        double qtdAbastecida = scanner.nextDouble();

        if (qtdAbastecida <= 0){
            System.out.println("Valor inválido");
            return;
        }

        Combustivel combustivel = new Combustivel(tipo, qtdAbastecida);

        if(tipo.equals("A")){
            combustivel.setValor(3.50);
            System.out.println("O valor do Alcool hoje é de: R$"+combustivel.getValor());
        } else if (tipo.equals("G")){
            combustivel.setValor(5.50);
            System.out.println("O valor da Gasolina hoje é de: R$"+combustivel.getValor());
        }

        combustivel.abastecendo(qtdAbastecida);
        double custoTotal = combustivel.calcularCustoTotal();
        double custoComDesconto = combustivel.calcularDesconto();

        System.out.printf("O custo total é R$ %.2f e o custo com desconto é R$ %.2f", custoTotal, custoComDesconto);

        scanner.close();
    }
}
