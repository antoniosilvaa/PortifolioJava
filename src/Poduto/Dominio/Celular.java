package Poduto.Dominio;

public class Celular extends Produto{
    private static final double imposto = 0.07;
    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * imposto;
    }
}
