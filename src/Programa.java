import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Tarefa;

public class Programa {
    public static void main(String[] args) throws Exception {
        List<Tarefa> tarefas = new ArrayList<>();
        InicialTarefas.GerarTarefas(tarefas);
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
        int opn1, opn2, opn3, opn4, opn5, opn6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Tarefa");
        System.out.println("2 - Buscar tarefa");
        opn1 = sc.nextInt();
        switch (opn1) {
            case 1:
                System.out.println("Menu:");
                System.out.println("1 - Adicionar Tarefa");
                System.out.println("2 - Editar Tarefa");
                System.out.println("3 - Excluir Tarefa");
                opn2 = sc.nextInt();
                if (opn2 == 1) {
                    System.out.println("Selecione o nível de prioridade:");
                    System.out.println("1 - Alto");
                    System.out.println("2 - Medio");
                    System.out.println("3 - Baixo");
                    opn3 = sc.nextInt();
                    switch (opn3) {
                        case 1:
                            System.out.println("Classifique sua tarefa:");
                            System.out.println("1- Tarefa Pessoal");
                            System.out.println("2- Tarefa de Facudade");
                            System.out.println("3- Tarefa de trabalho");
                            opn4 = sc.nextInt();
                            break;
                        case 2:
                            System.out.println("Classifique sua tarefa:");
                            System.out.println("1- Tarefa Pessoal");
                            System.out.println("2- Tarefa de Facudade");
                            System.out.println("3- Tarefa de trabalho");
                            opn4 = sc.nextInt();
                            break;
                        case 3:
                            System.out.println("Classifique sua tarefa:");
                            System.out.println("1- Tarefa Pessoal");
                            System.out.println("2- Tarefa de Facudade");
                            System.out.println("3- Tarefa de trabalho");
                            opn4 = sc.nextInt();
                            break;
                        default:
                            break;
                    }
                }else if(opn2 == 2){
                    System.out.println("Selecione sua tarefa:");
                    // ############################################## - Logica das tarefas
                    for (int i = 0; i < 7; i++) {
                        System.out.println(i + " - Tarefa " + i);
                    }
                    // ##############################################
                    opn5 = sc.nextInt();
                    System.out.println("Selecione o item que você deseja editar de sua tarefa numero: " + opn5);
                    System.out.println("1 - Titulo");
                    System.out.println("2 - Descrição");
                    System.out.println("3 - Prazo");
                    System.out.println("4 - Status");
                    opn6 = sc.nextInt();
                    switch (opn6) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                    
                        default:
                            break;
                    }


                }else if(opn2 == 3){
                    System.out.println("Exclua a Tarefa");
                }
                break;
            case 2:
                System.out.println("PARTE DE EBERT");
                break;
        
            default:
                break;
        }
    }
}

