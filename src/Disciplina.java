import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disciplina {

    private String nomeDisciplina;
    private String codigoDisciplina;

    private List<Estudante> listaEstudantes;
    private List<Estudante> listaAprovados;
    private List<Estudante> listaReprovados;

    public Disciplina(String nomeDisciplina, String codigoDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
    }

    public void addEstudantes(List<Estudante> listaEstudantes){
        this.listaEstudantes.addAll(listaEstudantes);
    }

    public void addEstudante(Estudante newEstudante){
        this.listaEstudantes.add(newEstudante);
    }

    public boolean setNota1Estudante(int num, float nota){
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                a.setNota1(nota);
                return true;
            }
        }
        return false;
    }

    public boolean setNota2Estudante(int num, float nota){
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                a.setNota2(nota);
                return true;
            }
        }
        return false;
    }

    public boolean setNota3Estudante(int num, float nota){
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                a.setNota3(nota);
                return true;
            }
        }
        return false;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void avaliarMedias(){
        for (Estudante a : this.listaEstudantes){
            if( a.getMedia() >= 5.0f)
                this.listaAprovados.add(a);

            else this.listaReprovados.add(a);
        }
    }

    public int quantidadeEstudantes(){
        return this.listaEstudantes.size();
    }

    public int quantidadeAprovados(){
        return this.listaAprovados.size();
    }

    public int quantidadeReprovados(){
        return this.listaReprovados.size();
    }

    public float getNota1Estudante(int num){
        float n = -1;
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                n = a.getNota1();
            }
        }

        return n;
    }


    public float getNota2Estudante(int num){
        float n = -1;
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                n = a.getNota2();
            }
        }
        return n;
    }

    public float getNota3Estudante(int num){
        float n = -1;
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                n = a.getNota3();
            }
        }
        return n;
    }

    public float getMediaEstudante(int num){
        float n = -1;
        for (Estudante a: this.listaEstudantes) {
            if(a.getNumero() == num) {
                n = a.getMedia();
            }
        }
        return n;
    }

    public void printEstudantes(){
        //ordenar lista de alunos por nusp decrescente
        Collections.sort(this.listaEstudantes, new Comparator(){
            public int compare(Object o1, Object o2) {
                Estudante a1 = (Estudante) o1;
                Estudante a2 = (Estudante) o2;
                return a1.getNumero() < a2.getNumero() ? +1 : (a1.getNumero() > a2.getNumero() ? -1 : 0);
            }
        });

        for (Estudante a: this.listaEstudantes) {
            System.out.println(a.getNome() + ", " + a.getNumero());
        }

    }

    public void printAprovados(){
        //ordenar lista de alunos por nusp decrescente
        Collections.sort(this.listaAprovados, new Comparator() {
            public int compare(Object o1, Object o2) {
                Estudante a1 = (Estudante) o1;
                Estudante a2 = (Estudante) o2;
                return a1.getNumero() < a2.getNumero() ? +1 : (a1.getNumero() > a2.getNumero() ? -1 : 0);
            }
        });
        for (Estudante a: this.listaAprovados) {
            System.out.println(a.getNome() + ", " + a.getNumero() + ":  " + a.getNota1() + ", " + a.getNota2() + ", " + a.getNota3() + ", Média: " + a.getMedia());
        }
    }

    public void printReprovados(){
        //ordenar lista de alunos por nusp decrescente
        Collections.sort(this.listaReprovados, new Comparator() {
            public int compare(Object o1, Object o2) {
                Estudante a1 = (Estudante) o1;
                Estudante a2 = (Estudante) o2;
                return a1.getNumero() < a2.getNumero() ? +1 : (a1.getNumero() > a2.getNumero() ? -1 : 0);
            }
        });

        for (Estudante a: this.listaReprovados) {
            System.out.println(a.getNome() + ", " + a.getNumero() + ":  " + a.getNota1() + ", " + a.getNota2() + ", " + a.getNota3() + ", Média: " + a.getMedia());
        }
    }

    public void printEstudantessMedia(){
        //ordenar lista de alunos por media decrescente
        Collections.sort(this.listaEstudantes, new Comparator() {
            public int compare(Object o1, Object o2) {
                Estudante a1 = (Estudante) o1;
                Estudante a2 = (Estudante) o2;
                return a1.getMedia() < a2.getMedia() ? +1 : (a1.getMedia() > a2.getMedia() ? -1 : 0);
            }
        });

        for (Estudante a: this.listaEstudantes) {
            System.out.println(a.getNome() + ", " + a.getNumero() + ", Média: " + a.getMedia());
        }
    }
    public boolean verificaCodigoDisciplina(){
        
        if(codigoDisciplina.length() == 7){
                String tresPrimeirosCaracteres = codigoDisciplina.substring(0, 3);
                if(tresPrimeirosCaracteres == "SSC"){
                    return true;
                }else{
                    return false;
                }
        }else{
            return false;
        }
    }
}
