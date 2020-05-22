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
        disciplina = new Disciplina("nomeDisciplina", "codigoDisciplina");
        resultado_aux = true;
    }

    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void verificaCodigoDisciplina01(){
        resultado_aux = disciplina.validacaoID("a52589");
        assertEquals(validaSaida, resultado_aux);
    }
}