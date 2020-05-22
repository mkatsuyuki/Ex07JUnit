import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

//Classe que implementa os casos de testes de objetos específicos Ex: Estudante

public class TestesJUnit_Template {
    /*
    //variáveis globais da classe de teste
    IdentifierExemplo identifier;           //Classe desejada para ser testada
    String validaSaida = "ID válido";
    String invalidaSaida = "ID inválido";
    String resultado_aux;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        identifier = new Disciplina();
        resultado_aux = "";
    }

    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    /*
    @Test
    public void casoTeste1 (){
        resultado_aux = identifier.validacaoID("a52589");
        assertEquals(validaSaida, resultado_aux;
    }

    /** Implementação do caso de teste <b74ad58es24e, ID válido> [limite superior] */
    /*
    @Test
    public void casoTeste2 (){
        resultado_aux = identifier.validacaoID("b74ad58es24e");
        assertEquals(validaSaida, resultado_aux);
    }

    /** Implementação do caso de teste <b74ad&58es24e, ID inválido> [seguinte do limite superior] */
    /*
    @Test
    public void casoTeste3 (){
        resultado_aux = identifier.validacaoID("b74ad&58es24e");
        assertEquals(invalidaSaida, resultado_aux);
    }

    /** Implementação do caso de teste < B*ss2, ID inválido > [anterior do limite inferior] */
    /*
    @Test
    public void casoTeste4 (){
        resultado_aux = identifier.validacaoID("B*ss2");
        assertEquals(invalidaSaida, resultado_aux;
    }
    */
}