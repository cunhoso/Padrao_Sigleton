package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import padroescriacao.singleton.Parametros;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeEscola() {
        Parametros.getInstance().setnomeBiblioteca("Escola 1");
        assertEquals("Escola 1", Parametros.getInstance().getnomeBiblioteca());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setfuncionarioLogado("Usuario 1");
        assertEquals("Usuario 1", Parametros.getInstance().getfuncionarioLogado());
    }

}