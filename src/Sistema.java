import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private Professor professor;
    private List<Disciplina> listaDisciplinas;

    public Sistema(String nome, int numUSP){
        this.professor = new Professor(nome, numUSP);
        this.listaDisciplinas = new ArrayList<Disciplina>();
    }

    public void addDisciplina(String codigoDisciplina, String nomeDisciplina){
        Disciplina disciplina = new Disciplina(nomeDisciplina, codigoDisciplina);
        this.listaDisciplinas.add(disciplina);
    }

    public boolean addEstudantesDisciplina(String codigo, List<Estudante> estudantes){
        for ( Disciplina d: this.listaDisciplinas) {
            if(d.getCodigoDisciplina().equals(codigo)){
                d.addEstudantes(estudantes);
                return true;
            }
        }
        return false;
    }

    public boolean addEstudanteDisciplina(String codigo, Estudante estudante){
        for (Disciplina d: this.listaDisciplinas) {
            if(d.getCodigoDisciplina().equals(codigo)){
                d.addEstudante(estudante);
                return true;
            }
        }
        return false;
    }





}
