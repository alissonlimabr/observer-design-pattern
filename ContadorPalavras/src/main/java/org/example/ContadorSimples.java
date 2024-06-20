package org.example;

public class ContadorSimples implements ContadorPalavras {
    private int qtd;

    @Override
    public void contar(String palavra) {
        qtd++;
    }

    @Override
    public int contagem() {
        return qtd;
    }
}
