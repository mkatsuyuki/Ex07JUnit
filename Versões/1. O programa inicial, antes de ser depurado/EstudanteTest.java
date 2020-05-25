import org.junit.Test;

import jdk.jshell.VarSnippet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

//Classe que implementa os casos de testes de objetos específicos Ex: Estudante

public class EstudanteTest{
    //variáveis globais da classe de teste
    Estudante estudante;           //Classe desejada para ser testada
    boolean validaSaida = true;
    boolean invalidaSaida = true;
    boolean resultado_bool;
    float resultado_float;
    int numero;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        numero = 10277040;
        estudante = new Estudante(numero, "Paulo");

    }

    // Teste se retorna o nUSP correto
    @Test
    public void casoTeste1 (){
        resultado_float = estudante.getNumero();
        assertEquals(numero, resultado_float, 0);
    }

    // Teste se a Nota1 está entre 0 e 10
    @Test
    public void casoTeste2 (){
        float nota = estudante.getNota1();
        boolean teste;

        if(nota <= 10 & nota >= 0) teste = true;   
        else teste = false;

        assertEquals(teste, true);
    }

    // Teste se a Nota2 está entre 0 e 10
    @Test
    public void casoTeste3 (){
        float nota = estudante.getNota2();
        boolean teste;

        if(nota <= 10 & nota >= 0) teste = true;   
        else teste = false;

        assertEquals(teste, true);
    }

    // Teste se a Nota3 está entre 0 e 10
    @Test
    public void casoTeste4 (){
        float nota = estudante.getNota3();
        boolean teste;

        if(nota <= 10 & nota >= 0) teste = true;   
        else teste = false;

        assertEquals(teste, true);
    }

    // Teste se o nUSP tem no maximo 7 digitos
    @Test
    public void casoTeste5 (){
        boolean teste;
        int numero = estudante.getNumero();

        if(numero > 9999999) teste = true;
        else teste = false;
        assertEquals(teste, true);
    }
}
