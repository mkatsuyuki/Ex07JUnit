import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

//Classe que implementa os casos de testes de objetos específicos Ex: Estudante

public class DisciplinaTest{
    //variáveis globais da classe de teste
    Disciplina disciplina;           //Classe desejada para ser testada
    boolean validaSaida = true;
    boolean invalidaSaida = false;
    boolean resultado_aux;
    String nomeDisciplina;
    String codigoDisciplina;
    /*
    public boolean verificaAddEstudante(Estudante newEstudante, Disciplina disciplina){
        
    }
    */

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        resultado_aux = true;
    }

    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void casoTeste01(){
        nomeDisciplina = "Teste01";
        codigoDisciplina = "SSC123456789";
        disciplina = new Disciplina(nomeDisciplina, codigoDisciplina);
        resultado_aux = disciplina.verificaCodigoDisciplina();
        assertEquals(validaSaida, resultado_aux);
    }
    
    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void casoTeste02(){
        nomeDisciplina = "Teste02";
        codigoDisciplina = "ABC4567";
        disciplina = new Disciplina(nomeDisciplina, codigoDisciplina);
        resultado_aux = disciplina.verificaCodigoDisciplina();
        assertEquals(validaSaida, resultado_aux);
    }      
    
    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void casoTeste03(){
        nomeDisciplina = "Teste03";
        codigoDisciplina = "SSC0620";
        disciplina = new Disciplina(nomeDisciplina, codigoDisciplina);
        resultado_aux = disciplina.verificaCodigoDisciplina();
        assertEquals(validaSaida,resultado_aux);
    }
}