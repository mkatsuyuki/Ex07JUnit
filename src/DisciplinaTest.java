import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;

//Classe que implementa os casos de testes de objetos específicos Ex: Estudante

public class DisciplinaTest{
    //variáveis globais da classe de teste
    Disciplina disciplina;           //Classe desejada para ser testada
    boolean validaSaida = true;
    boolean invalidaSaida = false;
    boolean resultado_aux;

    Disciplina disciplinaGlobal = new Disciplina("Teste03", "SSC0620");
    Estudante alunoAprovado1 = new Estudante(1000000, "Aprovado");
    Estudante alunoAprovado2 = new Estudante(1000001, "Aprovado");
    Estudante alunoAprovado3 = new Estudante(1000002, "Aprovado");
    Estudante alunoReprovado1 = new Estudante(1000004, "Reprovado");
    Estudante alunoReprovado2 = new Estudante(1000005, "Reprovado");
    /*
    public boolean verificaAddEstudante(Estudante newEstudante, Disciplina disciplina){
    }
    */

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        resultado_aux = true;
        
        
        alunoAprovado1.setNota1(10);
        alunoAprovado1.setNota2(9.5f);
        alunoAprovado1.setNota3(7.8f);

        
        alunoAprovado2.setNota1(4);
        alunoAprovado2.setNota2(5);
        alunoAprovado2.setNota3(6);

        
        alunoAprovado3.setNota1(5);
        alunoAprovado3.setNota2(5);
        alunoAprovado3.setNota3(5);

        
        alunoReprovado1.setNota1(2);
        alunoReprovado1.setNota2(3);
        alunoReprovado1.setNota3(2);

        
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
        //tenta criar disciplina com código invalido, estourando o limite de numeros
        Disciplina disciplina_aux = new Disciplina("Teste01", "SSC123456789");

        //checagem
        resultado_aux = disciplina_aux.verificaCodigoDisciplina();

        //validação da saida
        assertEquals(validaSaida, resultado_aux);
    }
    
    /* Caso Teste 02, testa a inserção de um código proibido */
    @Test
    public void casoTeste02(){
        //tenta criar disciplina com codigo invalido, não começando com SSC
        Disciplina disciplina_aux = new Disciplina("Teste02", "ABC4567");

        //checagem
        resultado_aux = disciplina_aux.verificaCodigoDisciplina();
        assertEquals(validaSaida, resultado_aux);
    }      
    
    /* Caso Teste 03, testa a inserção de um código permitido */
    @Test
    public void casoTeste03(){
        //tenta criar disciplina com codigo valido
        Disciplina disciplina_aux = new Disciplina("Teste03", "SSC0620");
        //checagem
        resultado_aux = disciplina_aux.verificaCodigoDisciplina();
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 04, testa a quantidade de alunos matriculados */
    @Test
    public void casoTeste04(){
        //checa se quantidade calculada de alunos realmente é 5
        if(disciplinaGlobal.quantidadeEstudantes() == 5) resultado_aux = true;
        else resultado_aux = false;

        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 05, testa a quantidade de alunos aprovados */
    @Test
    public void casoTeste05(){
        //checa se a quantidade calculada de alunos aprovados realmente é 3 
        if(disciplinaGlobal.quantidadeAprovados() == 3) resultado_aux = true;
        else resultado_aux = false;

        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 06, testa a quantidade de alunos reprovados */
    @Test
    public void casoTeste06(){
        //checa se a quantidade calculada de alunos reprovados realmente é 2
        if(disciplinaGlobal.quantidadeReprovados() == 2) resultado_aux = true;
        else resultado_aux = false;

        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 07, testa a nota1 do aluno reprovado 2 */
    @Test
    public void casoTeste07(){

        //se a nota 1 do estudante 2 (requisitada por meio da disciplina tendo o nusp dele como parametro) é realmente 4.10, true, se não false
        if(disciplinaGlobal.getNota1Estudante(alunoReprovado2.getNumero()) == 4.10f) resultado_aux = true;
        else resultado_aux = false;
        
        //se for true, sucesso
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 08, testa a nota2 do aluno reprovado 2 */
    @Test
    public void casoTeste08(){

        //se a nota do estudante 2 2 (requisitada por meio da disciplina tendo o nusp dele como parametro) é realmente 5.30, true, se não false
        if(disciplinaGlobal.getNota2Estudante(alunoReprovado2.getNumero()) == 5.30f) resultado_aux = true;
        else resultado_aux = false;
        
        //se for true, sucesso
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 09, testa a nota3 do aluno reprovado 2 */
    @Test
    public void casoTeste09(){

        //se a nota 3 do estudante 2 (requisitada por meio da disciplina tendo o nusp dele como parametro) é realmente 3.90, true, se não false
        if(disciplinaGlobal.getNota3Estudante(alunoReprovado2.getNumero()) == 3.90f) resultado_aux = true;
        else resultado_aux = false;
        
        //se for true, sucesso
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 10, testa a media do aluno aprovado 1 */
    @Test
    public void casoTeste10(){
        //acessa media do estudante 1 por meio da disciplina (usando nusp como parametro), de valor ideal 9.10
        float med = disciplinaGlobal.getMediaEstudante(alunoAprovado1.getNumero());
        
        //se for realmente 9.10 (com erro de 0.01 pois a aproximação feita pelo programa é 9.0999), sucesso
        assertEquals(med, 9.10f, 0.01f);
    }

    /* Caso Teste 11, testa a ordenação decrescente dos alunos */
    @Test
    public void casoTeste11(){

        //requisita lista dos estudantes ordenada decrescentemente
        List<Estudante> lista = disciplinaGlobal.printEstudantes();
        resultado_aux = true;

        for (int i = 1; i < lista.size(); i++) {
            //se o nUSP de um aluno for maior que o anterior (mostrando que não esta decrescente), resultado é false
            if(lista.get(i).getNumero() > lista.get(i-1).getNumero())
                resultado_aux = false;
        }
        
        //se for true, sucesso. se falso, erro
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 12, testa se a lista de aprovados realmente só possui aprovados */
    @Test
    public void casoTeste12(){
        //requisita lista de aprovados
        List<Estudante> lista = disciplinaGlobal.printAprovados();
        resultado_aux = true;

        for (int i = 0; i < lista.size(); i++) {
            //se a media de algum deles for menos que 5, falso
            if(lista.get(i).getMedia() < 5)
                resultado_aux = false;
        }
        
        //se for true, sucesso. se falso, erro
        assertEquals(validaSaida,resultado_aux);
    }

    /* Caso Teste 13, testa se a lista de reprovados realmente só possui reprovados */
    @Test
    public void casoTeste13(){
        //requisita lista de reprovados
        List<Estudante> lista = disciplinaGlobal.printReprovados();
        resultado_aux = true;

        for (int i = 0; i < lista.size(); i++) {
            //se a media de um deles for maior que 5, falso
            if(lista.get(i).getMedia() > 5)
                resultado_aux = false;
        }
        
        //se for true, sucesso. se falso, erro
        assertEquals(validaSaida,resultado_aux);
    }
}