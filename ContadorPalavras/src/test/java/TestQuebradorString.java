import org.example.ContadorMaiusculas;
import org.example.ContadorPares;
import org.example.ContadorSimples;
import org.example.QuebradorPalavras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuebradorString {
    @Test
    public void quebradorPalavras() {
        String frase = "O rato roeu a roupa do Rei de Roma!";
        QuebradorPalavras quebrador = new QuebradorPalavras();
        String[] palavras = quebrador.quebrar(frase);
        assertEquals(9, palavras.length);
    }

    @Test
    public void contadorSimples() {
        String frase = "O rato roeu a roupa do Rei de Roma!";
        QuebradorPalavras quebrador = new QuebradorPalavras();
        quebrador.adicionaContador("SIMPLES", new ContadorSimples());
        quebrador.quebrar(frase);
        assertEquals(9, quebrador.getContagem("SIMPLES"));
    }

    @Test
    public void contadorMaiuscula() {
        String frase = "O rato roeu a roupa do Rei de Roma!";
        QuebradorPalavras quebrador = new QuebradorPalavras();
        quebrador.adicionaContador("MAIUSCULAS", new ContadorMaiusculas());
        quebrador.quebrar(frase);
        assertEquals(3, quebrador.getContagem("MAIUSCULAS"));
    }

    @Test
    public void contadorPares() {
        String frase = "O rato roeu a roupa do Rei de Roma!";
        QuebradorPalavras quebrador = new QuebradorPalavras();
        quebrador.adicionaContador("PARES", new ContadorPares());
        quebrador.quebrar(frase);
        assertEquals(4, quebrador.getContagem("PARES"));
    }
}
