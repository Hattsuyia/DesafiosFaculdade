package desafio.desafio18.entities;

import java.util.Scanner;

public class Tamagushi {
    private String nome;
    private double fome;
    private double saude;
    private int idade;

    public Tamagushi() {

    }

    public Tamagushi(String nome, double fome, double saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

     public void humor() {
        double status = (fome + saude) / 2;
        if (status >= 80) {
            System.out.println("Meu humor é Feliz");
        } else if (status >= 60) {
            System.out.println("Meu humor é Chateado");
        } else if (status >= 30) {
            System.out.println("Meu humor é Triste");
        } else if (status >= 1) {
            System.out.println("Meu humor é Raiva");
        } else {
            System.out.println("Meu humor é Morto");
        }
    }

    public void dormir() {
        idade++;
        saude += 20;

        if (saude >=100){
            setSaude(100);
        }

        if (idade == 10) {
            System.out.println("O tamagoshi " + getNome() + " morreu com " + idade + " anos");
        } else {
            System.out.println("Obg vou dormir um pouco");
            System.out.println("Agora tenho " + idade + " anos");
            System.out.println("Minha saúde aumentou para: " + saude);
        }
    }

    public void brincar() {
        this.saude += 20;
        if (getSaude() >= 100) {
            this.saude = 100;
            System.out.println("Minha saude esta no maximo: " + this.saude);
        } else {
            System.out.println("Minha saude aumentou para: " + this.saude);
        }
    }
    public void comer() {
        Scanner scanner = new Scanner(System.in);
        Comida comida;

        System.out.println("Escolha o tipo de comida (maça, banana, melancia): ");
        String tipoComida = scanner.nextLine();

        if (tipoComida.equalsIgnoreCase("maça")) {
            comida = new Comida("maça", 10);
        } else if (tipoComida.equalsIgnoreCase("banana")) {
            comida = new Comida("banana", 20);
        } else {
            comida = new Comida("melancia", 30);
        }

        this.setFome(this.getFome() + comida.getValorDeFome());

        if (this.getFome() >= 100) {
            this.setFome(100);
            System.out.println("Minha barriga está cheia " + this.getFome());
        } else {
            System.out.println("Minha barriga está quase cheia " + this.getFome());
        }
        scanner.close();
    }
}
