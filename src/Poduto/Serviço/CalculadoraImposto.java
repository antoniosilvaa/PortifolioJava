package Poduto.Serviço;

import Poduto.Dominio.Produto;

import java.util.Scanner;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de Impostos");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

    }
}
