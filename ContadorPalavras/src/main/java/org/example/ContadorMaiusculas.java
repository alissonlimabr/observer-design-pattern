package org.example;

public class ContadorMaiusculas implements ContadorPalavras {
    private int qtd;
    @Override
    public void contar(String palavra) {
        if(Character.isUpperCase(palavra.charAt(0)))
            qtd++;
    }

    @Override
    public int contagem() {
        return qtd;
    }
}
