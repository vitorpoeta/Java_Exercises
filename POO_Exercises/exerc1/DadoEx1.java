// Dado.java
package entities;

import java.util.Random;

public class DadoEx1 {
    private Random gerador;

    public DadoEx1() {
        this.gerador = new Random();
    }

    public int rolarDado() {
        return gerador.nextInt(6) + 1; // Rola o dado com 6 lados, adicionando 1 para garantir que o resultado esteja entre 1 e 6
    }
}
