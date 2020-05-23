public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

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

        orgcomp.addEstudante(aluno1);
        orgcomp.addEstudante(aluno2);
        orgcomp.addEstudante(aluno3);
        orgcomp.addEstudante(aluno4);
        orgcomp.addEstudante(aluno5);
        orgcomp.printEstudantes();
    }
}
