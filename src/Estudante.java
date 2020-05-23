//import sun.security.util.Length;

public class Estudante{
    private String nome;
    private int nUSP;
    private float nota1;
    private float nota2;
    private float nota3;

    public Estudante(int nUSP, String nome){

        if(nUSP > 9999999){
            throw new IllegalArgumentException("nUSP deve ter no maximo 7 digitos, porem foi encontrado: "+ nUSP);
        }
        this.nome = nome;
        this.nUSP = nUSP;
    }

    public boolean setNota1(float nota){
        if(nota > 0 & nota < 10){
            this.nota1 = nota;
            return true;
        }

        return false;
        
    }

    public boolean setNota2(float nota){
        if(nota > 0 & nota < 10){
            this.nota2 = nota;
            return true;
        }

        return false;
    }

    public boolean setNota3(float nota){
        if(nota > 0 & nota < 10){
            this.nota3 = nota;
            return true;
        }

        return false;
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
