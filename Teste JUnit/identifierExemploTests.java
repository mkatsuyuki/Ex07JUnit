import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class identifierExemploTests {

    //variáveis globais da classe de teste
    IdentifierExemplo identifier;
    String valido = "ID válido";
    String invalido = "ID inválido";
    String result;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        identifier = new IdentifierExemplo();
        result = "";
    }

    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void casoTeste1 (){
        result = identifier.validacaoID("a52589");
        assertEquals(valido, result);
    }

    /** Implementação do caso de teste <b74ad58es24e, ID válido> [limite superior] */
    @Test
    public void casoTeste2 (){
        result = identifier.validacaoID("b74ad58es24e");
        assertEquals(valido, result);
    }

    /** Implementação do caso de teste <b74ad&58es24e, ID inválido> [seguinte do limite superior] */
    @Test
    public void casoTeste3 (){
        result = identifier.validacaoID("b74ad&58es24e");
        assertEquals(invalido, result);
    }

    /** Implementação do caso de teste < B*ss2, ID inválido > [anterior do limite inferior] */
    @Test
    public void casoTeste4 (){
        result = identifier.validacaoID("B*ss2");
        assertEquals(invalido, result);
    }
}