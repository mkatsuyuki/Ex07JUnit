public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Disciplina orgcomp = new Disciplina("SSC0001", "OrgComp");

        Estudante aluno1 = new Estudante(10101010, "Aluno 1");
        Estudante aluno2 = new Estudante(10101011, "Aluno 1");
        Estudante aluno3 = new Estudante(10101012, "Aluno 1");

        Estudante[] alunos = new Estudante[] {aluno1, aluno2, aluno3};
        orgcomp.addEstudantes(Arrays.asList(alunos));

        orgcomp.printAlunos();
    }
}
