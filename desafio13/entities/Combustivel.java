package desafio.desafio13.entities;

public class Combustivel {
    private double valor;
    private String tipo;
    private double qtdAbastecida;

    public Combustivel(String tipo, double qtdAbastecida) {
        this.tipo = tipo;
        this.qtdAbastecida = qtdAbastecida;
    }

    public double getQtdAbastecida() {
        return qtdAbastecida;
    }

    public void setQtdAbastecida(double qtdAbastecida) {
        this.qtdAbastecida = qtdAbastecida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularCustoTotal() {
        return valor * qtdAbastecida;
    }

    public double calcularDesconto() {
        double desconto = 0;
        if (tipo.equals("A")) {
            if (qtdAbastecida <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo.equals("G")) {
            if (qtdAbastecida <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        }
        return calcularCustoTotal() * (1 - desconto);
    }

    public void abastecendo(double qtdAbastecida) throws InterruptedException {
        int max = 100; // valor máximo da barra de progresso

        // loop para atualizar a barra de progresso
        for (int i = 0; i <= max; i++) {
            // calcula o percentual atual
            int percent = i * 100 / max;

            // monta a barra de progresso
            String progressBar = "[";
            double progressLength = qtdAbastecida;
            double progress = i * progressLength / max;
            for (int j = 0; j < progressLength; j++) {
                if (j <= progress) {
                    progressBar += "|";
                } else {
                    progressBar += "-";
                }
            }
            progressBar += "] " + percent + "%";

            // exibe a barra de progresso na tela
            System.out.print("\r" + progressBar);
            Thread.sleep(100); // pausa por 100 milissegundos
        }
        System.out.println();
        System.out.println("Quantidade solicitada abastecida!!!");
    }
}