import java.util.List;
import java.util.Scanner;

import entidades.Tarefa;
import pastEnum.Status;
/* 
     * 
     *          AQUI ERA UMA CLASSE QUE EU TAVA TENTANDO MONTRAR PRA AJUDAR NO MENU
     * 
     * 
     */
public class MenuConsole {
    Scanner sc = new Scanner(System.in);
    List<Tarefa> tarefas;
    String titulo;
    

    public MenuConsole(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void sListadeTarefas() {
        System.out.println("""

                                                                               LISTA DE TAREFAS

                """);
    }

    public void sListaDeTarefasNaoConcluidas() {
        System.out.println("""
                        LISTA ATUAL
                """);
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() != Status.CONCLUIDO) {
                System.out.println(tarefa.toString());

            }
        }
    }

    public void sMenuPrincipal() {
        System.out.println("""
                1 - AÇÕES TAREFAS               2 - BUSCAR TAREFAS
                    """);
    }

    public void sMenuTarefas() {
        System.out.println("""
                1 - ADD NOVA TAREFA                2- CONCLUIR TAREFA                 3 - EDITAR TAREFA
                    """);
    }

    public void addNovaTarefa(char tipoTarefa) {
        System.out.println("Qual o titulo da tarefa? : ");
        titulo = sc.nextLine();
        System.out.println("Qual a descricao da tarefa? : ");
        descricao = sc.nextLine();
        System.out.println("Qual o status dessa tarefa? :");
        System.out.println("""
                1 - Pendente    2 - Em Andamento    3 - CONCLUIDO
                """);
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                status = Status.PENDENTE;
                break;
            case 2:
                status = Status.EM_ANDAMENTO;
                break;
            case 3:
                status = Status.CONCLUIDO;
                break;
            default:
                status = Status.PENDENTE;
                break;
        }
    }

}
