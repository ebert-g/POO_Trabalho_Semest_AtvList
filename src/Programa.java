import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Prioritizavel;
import entidades.Tarefa;
import entidades.TarefaFaculdade;
import entidades.TarefaPessoal;
import entidades.TarefaTrabalho;
import pastEnum.Prioridade;
import pastEnum.Status;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();
        InicialTarefas.GerarTarefas(tarefas);
        int opn1, opn2, opn3, opn4, opn5, opn6;
        // for (Tarefa tarefa : tarefas) {
        // System.out.println(tarefa);
        // }
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
                } else if (opn2 == 2) {
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

                } else if (opn2 == 3) {
                    System.out.println("Exclua a Tarefa");
                }
                break;
            case 2:
                String escText;
                int esc, ano = 0, mes = 0, dia = 0, escolherTipoBusca;
                System.out.println("BUSCAR TAREFAS\n");
                System.out.println("TAREFAS PENDENTES\n");
                for (Tarefa tarefa : tarefas) {
                    if (tarefa.getStatus() == Status.PENDENTE) {
                        System.out.println(tarefa);
                    }
                }

                System.out.println(
                        """
                                1- BUSCAR POR STATUS 2- BUCAR POR TIPO  3-BUSCAR POR DATA   4- BUSCAR POR PRIORIDADE 5-MOSTRAR TODAS
                                                """);
                escolherTipoBusca = sc.nextInt();
                sc.nextLine();
                switch (escolherTipoBusca) {
                    /* BUSCAR POR STATUS */case 1:
                        System.out.println("BUSCAR POR STATUS\n");
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
                        System.out.println("BUSCAR POR DATA\n");
                        System.out.println("""
                                1 - DIA     2- MES      3- ANO
                                """);
                        esc = sc.nextInt();
                        sc.nextLine();
                        switch (esc) {
                            /* BUSCAR POR DIA */case 1:
                                System.out.println("BUSCAR POR DIA\n");
                                System.out.println("DIGITE O DIA (dd/MM/aaaa)");
                                escText = sc.next().trim();
                                dia = Integer.parseInt(escText.substring(0, 2));
                                mes = Integer.parseInt(escText.substring(3, 5));
                                ano = Integer.parseInt(escText.substring(6, 10));
                                for (Tarefa tarefa : tarefas) {
                                    if ((tarefa.getPrazo().getDayOfMonth() == dia)
                                            && (tarefa.getPrazo().getMonthValue() == mes)
                                            && (tarefa.getPrazo().getYear() == ano)) {
                                        System.out.println(tarefa);

                                    }
                                }
                                break;
                            /* BUSCAR POR MES */case 2:
                                System.out.println("BUSCAR POR MES");
                                System.out.println("DIGITE O MES (MM/aaaa)");
                                escText = sc.next();
                                escText.trim();
                                mes = Integer.parseInt(escText.substring(0, 2));
                                ano = Integer.parseInt(escText.substring(3, 7));
                                for (Tarefa tarefa : tarefas) {
                                    if ((tarefa.getPrazo().getMonthValue() == mes)
                                            && (tarefa.getPrazo().getYear() == ano)) {
                                        System.out.println(tarefa);

                                    }
                                }

                                break;
                            /* BUSCAR POR ANO */case 3:
                                System.out.println("BUSCAR POR ANO\n");
                                System.out.println("DIGITE O ANO (aaaa)");
                                esc = sc.nextInt();
                                sc.nextLine();
                                for (Tarefa tarefa : tarefas) {
                                    if ((tarefa.getPrazo() != null) && (tarefa.getPrazo().getYear() == esc)) {
                                        System.out.println(tarefa);
                                    }
                                }

                                break;

                            default:
                                break;
                        }

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

                break;

            default:
                break;
        }
    }
}
