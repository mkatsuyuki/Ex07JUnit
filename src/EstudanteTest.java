import org.junit.Test;

//import jdk.jshell.VarSnippet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

//Classe que implementa os casos de testes de objetos específicos Ex: Estudante

public class EstudanteTest{
    //variáveis globais da classe de teste
    Estudante estudante1;           //Classe desejada para ser testada
    Estudante estudanteNUSP_01;           //Classe desejada para ser testada
    Estudante estudanteNUSP_02;           //Classe desejada para ser testada
    Estudante estudanteNUSP_03;           //Classe desejada para ser testada
    Estudante estudanteNOTAS;           //Classe desejada para ser testada
    boolean validaSaida = true;
    boolean resultado_bool;
    double resultado_float;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        resultado_float = 0;
        estudanteNUSP_01 = new Estudante(10277040, "Teste01");          
        estudanteNUSP_02 = new Estudante(123456789, "Teste02");          
        estudanteNUSP_03 = new Estudante(1234, "Teste03"); 
        estudante1 = new Estudante(10277040, "Paulo");
        estudanteNOTAS = new Estudante(1000001, "Miguel");

    }

    // Teste formatação nUSP
    @Test
    public void casoTeste1 (){
        resultado_bool = new Estudante(10277040);
        assertEquals(validaSaida, resultado_bool);
    }

    // Teste formatação nUSP
    @Test
    public void casoTeste2 (){
        resultado_bool = new Estudante(123A567);
        assertEquals(validaSaida, resultado_bool);
    }

    // Teste formatação nUSP
    @Test
    public void casoTeste3 (){
        boolean teste;
        int numero = estudante.getNumero();

        if(numero > 9999999) teste = true;
        else teste = false;
        assertEquals(teste, true);
    }
    // Teste se a Nota P1 está entre 0 e 10
    @Test
    public void casoTeste4 (){]
        resultado_bool = estudanteNOTAS.setNota1(6);
        assertEquals(validaSaida, resultado_bool);
    }

    // Teste se a Nota P2 está entre 0 e 10
    @Test
    public void casoTeste5 (){
        resultado_bool = estudanteNOTAS.setNota1(-1);
        assertEquals(validaSaida, resultado_bool);
    }

    // Teste se a Nota P3 está entre 0 e 10
    @Test
    public void casoTeste6 (){
        resultado_bool = estudanteNOTAS.setNota1(12);
        assertEquals(validaSaida, resultado_bool);
    }

    // Teste se retorna o nUSP correto
    @Test
    public void casoTeste7 (){
        assertEquals(10277040, estudante1.getNumero());
    }
}
