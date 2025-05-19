import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Tarefa;
import entidades.TarefaFaculdade;
import entidades.TarefaPessoal;
import entidades.TarefaTrabalho;
import pastEnum.Prioridade;
import pastEnum.Status;

public class TFF {
    /* 
     * 
     *          AQUI ERA O MAIN QUE ETU TAVA TENTANDO FAZER
     * 
     * 
     */
        Scanner sc = new Scanner(System.in);
        int escolha;
        char escolhaTxt;
        int id = 1;
        String titulo;
        String descricao;
        Prioridade prioridade;
        Status status;
        LocalDate prazo;
        int mes, dia, ano;
        Tarefa tarefaObj;
        InterfaceSaidaMetodos interfaceSaidaMetodos = null;

        List<Tarefa> tarefas = new ArrayList<>();

        do {
            interfaceSaidaMetodos.sListadeTarefas();
            interfaceSaidaMetodos.sMenuPrincipal();
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                interfaceSaidaMetodos.sMenuTarefas();
                escolha = sc.nextInt();
                sc.nextLine();

                if (escolha == 1) {

                    System.out.println("QUAL O TIPO DE TAREFA?(PESSOAL (P)/ TRABALHO (T) / FACULDADE ) (F) : ");
                    
                    escolhaTxt = sc.next().toLowerCase().charAt(0);

                    if (escolhaTxt == 'p') {
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
                        System.out.println("Essa tarefa possui prazo?(S/N) : ");
                        escolhaTxt = sc.next().toLowerCase().charAt(0);
                        if (escolhaTxt == 's') {
                            System.out.println("Qual o dia?: ");
                            dia = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Qual Mes? : ");
                            mes = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Qual o ano? : ");
                            ano = sc.nextInt();

                            prazo = LocalDate.of(ano, mes, dia);
                        } else {
                            prazo = null;
                        }
                        tarefaObj = new TarefaPessoal(id, titulo, descricao, prazo, status);
                        id++;

                    }

                    else if (escolhaTxt == 't') {
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

                        System.out.println("Qual o prazo para essa tarefa? : ");
                        System.out.println("Qual o dia?: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Qual Mes? : ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Qual o ano? : ");
                        ano = sc.nextInt();
                        prazo = LocalDate.of(ano, mes, dia);

                        System.out.println("Qual a Prioridade? : ");
                        System.out.println("""
                                1 - Alta    2 - Media    3 - Baixa
                                """);
                        escolha = sc.nextInt();
                        switch (escolha) {
                            case 1:
                                prioridade = Prioridade.ALTA;
                                break;
                            case 2:
                                prioridade = Prioridade.MEDIA;
                                break;
                            case 3:
                                prioridade = Prioridade.BAIXA;
                                break;
                            default:
                                prioridade = Prioridade.BAIXA;
                                break;
                        }
                        tarefaObj = new TarefaTrabalho(id, titulo, descricao, prazo, status, prioridade);
                        id++;

                    }

                    else if (escolhaTxt == 'f') {
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

                        System.out.println("Qual o prazo para essa tarefa? : ");
                        System.out.println("Qual o dia?: ");
                        dia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Qual Mes? : ");
                        mes = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Qual o ano? : ");
                        ano = sc.nextInt();
                        prazo = LocalDate.of(ano, mes, dia);

                        System.out.println("Qual a Prioridade? : ");
                        System.out.println("""
                                1 - Alta    2 - Media    3 - Baixa
                                """);
                        escolha = sc.nextInt();
                        switch (escolha) {
                            case 1:
                                prioridade = Prioridade.ALTA;
                                break;
                            case 2:
                                prioridade = Prioridade.MEDIA;
                                break;
                            case 3:
                                prioridade = Prioridade.BAIXA;
                                break;
                            default:
                                prioridade = Prioridade.BAIXA;
                                break;
                        }
                        tarefaObj = new TarefaFaculdade(id, titulo, descricao, prazo, status, prioridade);
                        id++;

                    }

                    continue;
                } else if (escolha == 2) {
                    for (Tarefa tarefa : tarefas) {
                        if (tarefa.getStatus() != Status.CONCLUIDO) {
                            System.out.println(tarefa.toString());
                        }
                    }

                    int concluida;
                    System.out.println("QUAL TAREFA DESEJA MARCA COMO CONCLUIDA? (DIGITE O ID) : ");
                    concluida = sc.nextInt();
                    sc.nextLine();
                    for (Tarefa tarefa : tarefas) {
                        if (tarefa.getId() == concluida) {
                            tarefa.setStatus(Status.CONCLUIDO);
                        } else {
                            System.out.println("Não existe Tarefas concluidas");
                        }

                    }
                    continue;

                } else if (escolha == 3) {
                    int novoId;
                    for (Tarefa tarefa : tarefas) {
                        System.out.println(tarefa.toString());
                    }
                    System.out.println("QUAL TAREFA VOCE DESEJA EDITAR? (ID):");
                    id = sc.nextInt();
                    System.out.println("O que vc deseja editar? ");
                    System.out.println("""
                            1 - ID | 2 - TITULO | 3- DESCRIÇÃO | 4- STATUS | 5 - PRAZO | 6 - PRIORIDADE
                                """);
                    escolha = sc.nextInt();
                    sc.nextLine();
                    switch (escolha) {
                        case 1:
                            System.out.println("Qual o novo ID?: ");
                            novoId = sc.nextInt();
                            sc.nextLine();
                            break;
                        case 2:
                            System.out.println("Qual o novo titulo: ");
                            titulo = sc.nextLine();
                            break;
                        case 3:
                            System.out.println("Qual a nova descrição: ");
                            descricao = sc.nextLine();
                            break;
                        case 4:
                            System.out.println("Qual o novo Status? : ");

                        default:
                            break;
                    }

                }
            }

        } while (false);
    }
}
