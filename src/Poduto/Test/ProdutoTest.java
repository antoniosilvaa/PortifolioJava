package Poduto.Test;

import Poduto.Dominio.Celular;
import Poduto.Dominio.LoginProdutoExceptions;
import Poduto.Dominio.Produto;
import Poduto.Serviço.CalculadoraImposto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        try {
            LogarProduto();
        } catch (LoginProdutoExceptions e) {
            throw new RuntimeException(e);
        }
    }

    public static void LogarProduto() throws LoginProdutoExceptions{
        Scanner teclado = new Scanner(System.in);
        String produto = "Samsung A15 5G";
        String valor = "1041";
        System.out.println("Produto: ");
        String produtoDigitado = teclado.nextLine();
        System.out.println("Valor: ");
        String valorDigitado = teclado.nextLine();

        if (!produto.equals(produtoDigitado) || !valor.equals(valorDigitado)){
            throw new LoginProdutoExceptions("Produto e valor lançados errado no sistema, tente novamente");
        }else {
            System.out.println("Produto e Valor Lançado com sucesso");
        }

    }
}
