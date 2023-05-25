package desafio.desafio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> idades = new ArrayList<>();
        List<Double> pesos = new ArrayList<>();

        System.out.print("Digite quantas pessoas serão adicionadas: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da "+i+"a pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso da "+i+"a pessoa: ");
            double peso = scanner.nextDouble();
            idades.add(idade);
            pesos.add(peso);
        }
        
        int pessoasAcimaDeNoventa =0;
        for (Double peso : pesos) {
            if (peso>=90){
                pessoasAcimaDeNoventa ++;
            }
        }

        double somaIdades = 0;
        for (Integer idade : idades) {
            somaIdades += idade;
        }

        double mediaIdade = somaIdades/ idades.size();

        System.out.printf("Quantidade de pessoas com mais de 90kg: %d%n", pessoasAcimaDeNoventa);
        System.out.printf("Média das idades das pessoas: %.2f%n", mediaIdade);

        scanner.close();
    }
}
