package Poduto.Test;

import Poduto.Dominio.Celular;
import Poduto.Dominio.Produto;
import Poduto.Serviço.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto celular = new Celular("Samsung A15 5G", 1041.65);
        CalculadoraImposto.calcularImposto(celular);
    }
}
