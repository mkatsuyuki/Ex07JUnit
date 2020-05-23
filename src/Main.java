public class Main {
    public static void main(String[] args) throws Exception {
        Disciplina orgcomp = new Disciplina("SSC0001", "OrgComp");

        Estudante aluno1 = new Estudante(10101010, "Aluno 1");
        Estudante aluno2 = new Estudante(10101011, "Aluno 2");
        Estudante aluno3 = new Estudante(10101012, "Aluno 3");
        Estudante aluno4 = new Estudante(10101013, "Aluno 4");
        Estudante aluno5 = new Estudante(10101014, "Aluno 5");
        /*
        Estudante[] alunos = new Estudante[] {aluno1, aluno2, aluno3};
        orgcomp.addEstudantes(Arrays.asList(alunos));
        */
        aluno1.setNota1(10);
        aluno1.setNota2(9.5f);
        aluno1.setNota3(7.8f);
        
        aluno2.setNota1(4);
        aluno2.setNota2(5);
        aluno2.setNota3(4);
        
        aluno3.setNota1(5);
        aluno3.setNota2(5);
        aluno3.setNota3(5);
        
        aluno4.setNota1(2);
        aluno4.setNota2(3);
        aluno4.setNota3(2);
    
        aluno5.setNota1(4.1f);
        aluno5.setNota2(5.3f);
        aluno5.setNota3(3.9f);

        orgcomp.addEstudante(aluno1);
        orgcomp.addEstudante(aluno2);
        orgcomp.addEstudante(aluno3);
        orgcomp.addEstudante(aluno4);
        orgcomp.addEstudante(aluno5);

        System.out.println("Estudantes:");
        orgcomp.printEstudantes();
        System.out.println("Aprovados:");
        orgcomp.printAprovados();
        System.out.println("Reprovados:");
        orgcomp.printReprovados();

        orgcomp.avaliarMedias();
        System.out.println("Aprovados:");
        orgcomp.printAprovados();
        System.out.println("Reprovados:");
        orgcomp.printReprovados();
        
        System.out.println("");
        System.out.println("Num aprovados: " + orgcomp.quantidadeAprovados());

        System.out.println("Media aluno 1: " + orgcomp.getMediaEstudante(aluno1.getNumero()));
    }
}
