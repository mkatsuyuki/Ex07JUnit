import org.junit.Test;

//import jdk.javadoc.internal.tool.Main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

//Classe que implementa os casos de testes de objetos específicos Ex: Estudante

public class MainTest{
    //variáveis globais da classe de teste
    Main main;           //Classe desejada para ser testada
    boolean validaSaida = true;
    boolean invalidaSaida = false;
    boolean resultado_aux;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        main = new Main();
        resultado_aux = false;
    }

    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void casoTeste1 (){
        assertEquals(validaSaida, resultado_aux);
    }
}