package Poduto.Dominio;

import java.io.Closeable;

public class LoginProdutoExceptions extends Exception {
    public LoginProdutoExceptions() {
    }

    public LoginProdutoExceptions(String message) {
        super(message);
    }
}
