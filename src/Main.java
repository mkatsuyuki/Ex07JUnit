import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input;

        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        List<Estudante> estudantes = new ArrayList<Estudante>();

        boolean end = false;

        while(!end){


            System.out.println("");
            System.out.println("O que gostaria de fazer?");
            System.out.println("1. Criar disciplina");
            System.out.println("2. Criar aluno");
            System.out.println("3. Criar alunos");
            System.out.println("4. Adicionar aluno a disciplina");
            System.out.println("5. Adicionar alunos a disciplina");
            System.out.println("6. Acessar disciplina");
            System.out.println("7. Acessar aluno");
            System.out.println("8. Sair");

            input = scanner.nextLine();

            switch(input){
                case "1":
                    while(true){
                        System.out.println("Digite o código e o nome da disciplina (ex: SSC0001, Introdução a Computação):");
                        input = scanner.nextLine();
                        String[] split = input.split(", ");

                        if(split.length == 2){
                            Disciplina disciplina = Disciplina.newDisciplina(split[1], split[0]);

                            if(disciplina == null){
                                continue;
                            } else {
                                disciplinas.add(disciplina);
                                System.out.println("Sucesso!");
                                break;
                            }
                        } else System.out.println("Disposição de código e nome inválida!");
                    }
                    break;

                case "2":
                    boolean done2 = false; 
                    while(!done2){
                        System.out.println("Digite o nome e o nUSP do aluno (ex: 9999999, Carlos Eduardo Sumaré):");
                        input = scanner.nextLine();
                        String[] split = input.split(", ");

                        if(split.length == 2){
                            Estudante estudante = Estudante.newEstudante(Integer.parseInt(split[0]), split[1]);

                            if(estudante == null){
                                continue;
                            } else {
                                estudantes.add(estudante);
                                System.out.println("Sucesso!");
                                break;
                            }
                        }
                    }
                    break;

                case "3":
                    boolean done3 = false;
                    while(!done3){
                        System.out.println("Digite o nome e o nUSP do aluno (ex: 9999999, Carlos Eduardo Sumaré; 9999998, João da Silva):");
                        input = scanner.nextLine();
                        String[] strings = input.split("; ");
                        String[][] split = new String[strings.length][2];
                        
                        for (int i = 0; i < strings.length; i++) { 
                            split[i] = strings[i].split(", ");

                            if(split[i].length == 2){
                                Estudante estudante = Estudante.newEstudante(Integer.parseInt(split[i][0]), split[i][1]);
        
                                if(estudante == null){
                                    done3 = false;
                                    break;
                                } else {
                                    estudantes.add(estudante);
                                    done3 = true;
                                    System.out.println("Sucesso!");
                                }
                            }

                        }

                        
                    }
                    break;

                case "4":
                boolean done4 = false;
                    while(!done4){
                        System.out.println("Digite o nUSP do aluno e o código da disciplina (ex: 9999999, SSC0001):");
                        input = scanner.nextLine();
                        String[] split = input.split(", ");

                        if(split.length == 2){
                            for (Estudante e : estudantes) {
                                if(e.getNumero() == Integer.parseInt(split[0])){
                                    for (Disciplina d : disciplinas) {
                                        if(d.getCodigoDisciplina().equals(split[1])){
                                            done4 = true;
                                            d.addEstudante(e);
                                            System.out.println("Sucesso!");
                                            break;
                                        }
                                    }
                                }
                            }
                        } else System.out.println("Disposição invalida!");
                    }
                    
                    break;


                
                case "5":
                    boolean done5 = false;
                    while(!done5){
                        System.out.println("Digite os nUSP dos alunos e o codigo da disciplina (ex: 9999999, 9999998; SSC0002):");
                        input = scanner.nextLine();
                        String[] strings = input.split("; ");
                        String[] split = strings[0].split(", ");
                        
                        for (int i = 0; i < split.length; i++) {
                            for (Estudante e : estudantes) {
                                if(e.getNumero() == Integer.parseInt(split[i])){
                                    for (Disciplina d : disciplinas) {
                                        if(d.getCodigoDisciplina().equals(strings[1])){
                                            d.addEstudante(e);
                                            done5 = true;
                                            System.out.println("Sucesso!");
                                        }
                                    }
                                }
                            }
                            
                        }

                        
                    }
                    break;
                
                case "6":
                    System.out.println("Digite o código da disciplina:");
                    input = scanner.nextLine();
                    boolean found6 = false;
                    
                    for (Disciplina d : disciplinas) {
                        if(d.getCodigoDisciplina().equals(input)){
                            found6 = true;
                            System.out.println("Disciplina encontrada, o que deseja realizar?");
                            System.out.println("1. Printar estudantes");
                            System.out.println("2. Printar estudantes aprovados");
                            System.out.println("3. Printar estudantes reprovados");
                            System.out.println("4. Printar estudantes por média");

                            input = scanner.nextLine();

                            switch(input){
                                case "1":
                                    d.printEstudantes();
                                    break;

                                case "2":
                                    d.printAprovados();
                                    break;

                                case "3":
                                    d.printReprovados();
                                    break;

                                case "4":
                                    d.printEstudantesMedia();
                                    break;
                            }

                        }
                    }

                    if(!found6) System.out.println("Disciplina não encontrada"); 
                    break;


                case "7":

                    System.out.println("Digite o nUSP do aluno:");
                    input = scanner.nextLine();
                    boolean found7 = false;
                    
                    for (Estudante e : estudantes) {
                        if(e.getNumero() == Integer.parseInt(input)){
                            found7 = true;
                            System.out.println("Aluno encontrado, o que deseja realizar?");
                            System.out.println("1. Printar nome");
                            System.out.println("2. Printar notas e média");
                            System.out.println("3. Setar notas");

                            input = scanner.nextLine();


                            switch(input){
                                case "1":
                                    System.out.println(e.getNome());
                                    break;

                                case "2":
                                    System.out.println("Nota 1: " + e.getNota1());
                                    System.out.println("Nota 2: " + e.getNota2());
                                    System.out.println("Nota 3: " + e.getNota3());
                                    System.out.println("Media: " + e.getMedia());
                                    
                                    break;

                                case "3":
                                    System.out.print("Digite a nota 1:");
                                    input = scanner.nextLine();
                                    e.setNota1(Float.parseFloat(input));

                                    System.out.print("Digite a nota 2:");
                                    input = scanner.nextLine();
                                    e.setNota2(Float.parseFloat(input));

                                    System.out.print("Digite a nota 3:");
                                    input = scanner.nextLine();
                                    e.setNota3(Float.parseFloat(input));

                                    break;

                                default:
                                    System.out.println("Comando inválido!");
                                    break;

                            }
                        }
                    }

                    if(!found7) System.out.println("Aluno não encontrado"); 
                    break;

                case "8":
                    end = true;
                    break;

                default:
                    System.out.println("Comando invalido!");
                    break;
                

            }
        }

        scanner.close();


        
    }

}
