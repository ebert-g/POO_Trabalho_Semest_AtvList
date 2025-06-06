import java.util.List;
import java.util.Scanner;

import entidades.Prioritizavel;
import entidades.Tarefa;
import entidades.TarefaFaculdade;
import entidades.TarefaPessoal;
import entidades.TarefaTrabalho;
import pastEnum.Prioridade;
import pastEnum.Status;

public class BuscarTarefas {

    public static void Buscar(List<Tarefa> tarefas) {
        Scanner sc = new Scanner(System.in);
        int escolherTipoBusca;
        int esc;
        System.out.println("BUSCAR TAREFAS");
        System.out.println("TAREFAS PENDENTES\n\n");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == Status.PENDENTE) {
                System.out.println(tarefa);
            }
        }

        System.out.println("""
                1- BUSCAR POR STATUS 2- BUCAR POR TIPO  3-BUSCAR POR DATA   4- BUSCAR POR PRIORIDADE 5-MOSTRAR TODAS
                                """);
        escolherTipoBusca = sc.nextInt();
        sc.nextLine();
        switch (escolherTipoBusca) {
            /* BUSCAR POR STATUS */case 1:
                System.out.println("BUSCAR POR STATUS");
                System.out.println("""
                        1- CONCLUIDO 2- EM ANDAMENTO 3- PENDENTE
                        """);
                esc = sc.nextInt();
                sc.nextLine();
                switch (esc) {
                    /* CONCLUIDO */case 1:
                        System.out.println("TAREFAS CONCLUIDAS");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa.getStatus() == Status.CONCLUIDO) {
                                System.out.println(tarefa);
                            }
                        }

                        break;
                    /* EM ANDAMENTO */case 2:
                        System.out.println("TAREFAS EM ANDAMENTO");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa.getStatus() == Status.EM_ANDAMENTO) {
                                System.out.println(tarefa);
                            }
                        }

                        break;

                    /* PENDENTE */case 3:
                        System.out.println("TAREFAS PENDENTES");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa.getStatus() == Status.PENDENTE) {
                                System.out.println(tarefa);
                            }
                        }
                        break;

                    default:
                        break;
                }

                break;
            /* BUCAR POR TIPO */case 2:
                System.out.println("BUSCAR POR TIPO");
                System.out.println("""
                        1- TAREFA PESSOAL   2- TAREFA TRABALHO 3- TAREFA FACULADE
                        """);
                esc = sc.nextInt();
                sc.nextLine();
                switch (esc) {
                    /* TAREFA PESSOAL */case 1:
                        System.out.println("TAREFA PESSOAL");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa instanceof TarefaPessoal) {
                                System.out.println(tarefa);
                            }
                        }
                        break;
                    /* TAREFA TRABALHO */case 2:
                        System.out.println("TAREFA TRABALHO");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa instanceof TarefaTrabalho) {
                                System.out.println(tarefa);
                            }
                        }
                        break;
                    /* TAREFA FACULDADE */case 3:
                        System.out.println("TAREFA FACULDADE");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa instanceof TarefaFaculdade) {
                                System.out.println(tarefa);
                            }
                        }
                        break;

                    default:
                        break;
                }
                break;
            /* BUSCAR POR DATA */case 3:

                break;
            /* BUSCAR POR PRIORIDADE */case 4:
                System.out.println("BUSCAR POR PRIORIDADE");
                System.out.println("""
                        1-ALTA  2-MEDIA  3- BAIXA
                        """);
                esc = sc.nextInt();
                sc.nextLine();
                switch (esc) {
                    /* ALTA */case 1:
                        System.out.println("BUSCAR PRIORIDADE ALTA");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa instanceof Prioritizavel p && p.getPrioridade() == Prioridade.ALTA) {
                                System.out.println(tarefa);
                            }
                        }
                        break;
                    /* MEDIA */case 2:
                        System.out.println("BUSCAR PRIORIDADE MEDIA");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa instanceof Prioritizavel p && p.getPrioridade() == Prioridade.MEDIA) {
                                System.out.println(tarefa);
                            }
                        }

                        break;

                    /* BAIXA */case 3:
                        System.out.println("BUSCAR PRIORIDADE BAIXA");
                        for (Tarefa tarefa : tarefas) {
                            if (tarefa instanceof Prioritizavel p && p.getPrioridade() == Prioridade.BAIXA) {
                                System.out.println(tarefa);
                            }
                        }
                        break;

                    default:
                        break;
                }
                break;
            /* MOSTRAR TODAS */case 5:
                for (Tarefa tarefa : tarefas) {
                    System.out.println(tarefa);
                }
                break;

            default:
                break;
        }
    }
}
