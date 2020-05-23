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
    /*
    public boolean verificaAddEstudante(Estudante newEstudante, Disciplina disciplina){
        
    }
    */

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        resultado_aux = true;
        Disciplina disciplinaGlobal = new Disciplina("Teste03", "SSC0620");
        Estudante alunoAprovado1 = new Estudante(1000000, "Aprovado");
        alunoAprovado1.setNota1(10);
        alunoAprovado1.setNota2(9.5f);
        alunoAprovado1.setNota3(7.8f);

        Estudante alunoAprovado2 = new Estudante(1000001, "Aprovado");
        alunoAprovado2.setNota1(4);
        alunoAprovado2.setNota2(5);
        alunoAprovado2.setNota3(4);

        Estudante alunoAprovado3 = new Estudante(1000002, "Aprovado");
        alunoAprovado3.setNota1(5);
        alunoAprovado3.setNota2(5);
        alunoAprovado3.setNota3(5);

        Estudante alunoReprovado1 = new Estudante(1000004, "Reprovado");
        alunoReprovado1.setNota1(2);
        alunoReprovado1.setNota2(3);
        alunoReprovado1.setNota3(2);

        Estudante alunoReprovado2 = new Estudante(1000005, "Reprovado");
        alunoReprovado2.setNota1(4.1f);
        alunoReprovado2.setNota2(5.3f);
        alunoReprovado2.setNota3(3.9f);

        //Inserção de um estudante em uma disciplina recém criada
        disciplinaGlobal.addEstudante(alunoAprovado1);
        disciplinaGlobal.addEstudante(alunoAprovado2);
        disciplinaGlobal.addEstudante(alunoAprovado3);
        disciplinaGlobal.addEstudante(alunoReprovado1);
        disciplinaGlobal.addEstudante(alunoReprovado2);
    }

    /* Caso Teste 01, testa a inserção de um código proibido */
    @Test
    public void casoTeste01(){
        Disciplina disciplina_aux = new Disciplina("Teste01", "SSC123456789");
        resultado_aux = disciplina_aux.verificaCodigoDisciplina();
        assertEquals(validaSaida, resultado_aux);
    }
    
    /* Caso Teste 02, testa a inserção de um código proibido */
    @Test
    public void casoTeste02(){
        Disciplina disciplina_aux = new Disciplina("Teste02", "ABC4567");
        resultado_aux = disciplina_aux.verificaCodigoDisciplina();
        assertEquals(validaSaida, resultado_aux);
    }      
    
    /* Caso Teste 03, testa a inserção de um código permitido */
    @Test
    public void casoTeste03(){
        Disciplina disciplina_aux = new Disciplina("Teste03", "SSC0620");
        resultado_aux = disciplina_aux.verificaCodigoDisciplina();
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 03, testa a inserção de um código permitido */
    @Test
    public void casoTeste04(){
        
        assertEquals(validaSaida,resultado_aux);
    }
}