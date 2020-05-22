public class Estudante{
    private String nome;
    private int nUSP;
    private float nota1;
    private float nota2;
    private float nota3;

    public Estudante(int nUSP, String nome){
        this.nome = nome;
        this.nUSP = nUSP;
    }

    public void setNota1(float nota){
        this.nota1 = nota;
    }

    public void setNota2(float nota){
        this.nota2 = nota;
    }

    public void setNota3(float nota){
        this.nota3 = nota;
    }

    public int getNumero(){
        return nUSP;
    }

    public float getMedia(){
        return (this.nota1 + this.nota2 + this.nota3)/3;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public String getNome() {
        return nome;
    }
}
