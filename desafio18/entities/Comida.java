package desafio.desafio18.entities;

public class Comida {
    private String tipo;
    private double valorDeFome;

    public Comida(String tipo, double valorDeFome) {
        this.tipo = tipo;
        this.valorDeFome = valorDeFome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDeFome() {
        return valorDeFome;
    }

    public void setValorDeFome(double valorDeFome) {
        this.valorDeFome = valorDeFome;
    }
}
