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
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Tarefa");
            System.out.println("2 - Buscar tarefa");
            System.out.println("0 - Sair");
            int opn1 = sc.nextInt();

            if (opn1 == 0) {
                System.out.println("Encerrando o programa. Até logo!");
                break;
            }

            switch (opn1) {
                case 1:
                    System.out.println("Menu:");
                    System.out.println("1 - Adicionar Tarefa");
                    System.out.println("2 - Editar Tarefa");
                    System.out.println("3 - Excluir Tarefa");
                    int opn2 = sc.nextInt();
                    // Adicionar
                    if (opn2 == 1) {
                        System.out.println("Selecione o nível de prioridade:");
                        System.out.println("1 - Alto");
                        System.out.println("2 - Medio");
                        System.out.println("3 - Baixo");
                        int opn3 = sc.nextInt();
                        Prioridade prioridade;
                        switch (opn3) {
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
                                System.out.println("Opção inválida. Usando prioridade MEDIA por padrão.");
                                prioridade = Prioridade.MEDIA;
                        }

                        System.out.println("Classifique sua tarefa:");
                        System.out.println("1 - Tarefa Pessoal");
                        System.out.println("2 - Tarefa de Faculdade");
                        System.out.println("3 - Tarefa de Trabalho");
                        int opn4 = sc.nextInt();
                        sc.nextLine(); // limpar o buffer

                        System.out.print("Digite o título da tarefa: ");
                        String titulo = sc.nextLine();

                        System.out.print("Digite a descrição da tarefa: ");
                        String descricao = sc.nextLine();

                        System.out.print("Digite o prazo (AAAA-MM-DD): ");
                        String dataStr = sc.nextLine();
                        LocalDate prazo = LocalDate.parse(dataStr); // você pode colocar try/catch depois

                        Status status = Status.PENDENTE; // padrão
                        System.out.println("Deseja mudar o status? (1 - Sim | 2 - Não)");
                        int mudarStatus = sc.nextInt();
                        sc.nextLine();
                        if (mudarStatus == 1) {
                            System.out.println("Escolha o status: 1 - CONCLUIDO | 2 - EM ANDAMENTO | 3 - PENDENTE");
                            int statusOp = sc.nextInt();
                            switch (statusOp) {
                                case 1 -> status = Status.CONCLUIDO;
                                case 2 -> status = Status.EM_ANDAMENTO;
                                case 3 -> status = Status.PENDENTE;
                            }
                        }
                        int novoId = tarefas.size(); // o ID será o próximo da lista

                        switch (opn4) {
                            case 1:
                                Tarefa nova = new TarefaPessoal(novoId, titulo, descricao, prazo, status);
                                tarefas.add(nova);
                                System.out.println("Tarefa Pessoal adicionada com sucesso!");
                                System.out.println(nova);
                                break;
                            case 2:
                                Tarefa novaFaculdade = new TarefaFaculdade(novoId, titulo, descricao, prazo, status,
                                        prioridade);
                                tarefas.add(novaFaculdade);
                                System.out.println("Tarefa Faculdade adicionada com sucesso!");
                                System.out.println(novaFaculdade);
                                break;
                            case 3:
                                Tarefa novaTrabalho = new TarefaTrabalho(novoId, titulo, descricao, prazo, status,
                                        prioridade);
                                tarefas.add(novaTrabalho);
                                System.out.println("Tarefa Trabalho adicionada com sucesso!");
                                System.out.println(novaTrabalho);
                                break;
                            default:
                                System.out.println("Tipo inválido!");
                                break;
                        }

                        // Editar
                    } else if (opn2 == 2) {
                        System.out.println("Selecione sua tarefa:");
                        // ############################################## - Logica das tarefas
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + " - " + tarefas.get(i).getTitulo());
                        }
                        // ##############################################
                        int opn5 = sc.nextInt();

                        Tarefa tarefaSelecionada = tarefas.get(opn5);
                        sc.nextLine(); // limpar o buffer

                        System.out.println("Selecione o item que você deseja editar de sua tarefa numero: " + opn5);
                        System.out.println("1 - Titulo");
                        System.out.println("2 - Descrição");
                        System.out.println("3 - Prazo");
                        System.out.println("4 - Status");
                        int opn6 = sc.nextInt();
                        switch (opn6) {
                            case 1:
                                System.out.print("Digite o novo título: ");
                                String novoTitulo = sc.next();
                                tarefaSelecionada.setTitulo(novoTitulo);
                                System.out.println("Título atualizado!");
                                break;
                            case 2:
                                System.out.print("Digite a nova descrição: ");
                                String novaDescricao = sc.next();
                                tarefaSelecionada.setDescricao(novaDescricao);
                                System.out.println("Descrição atualizada!");

                                break;
                            case 3:
                                System.out.println("Em desenvolvimento");
                                break;
                            case 4:
                                System.out.println("Escolha o novo status:");
                                System.out.println("1 - CONCLUIDO");
                                System.out.println("2 - EM_ANDAMENTO");
                                System.out.println("3 - PENDENTE");
                                int novoStatus = sc.nextInt();
                                switch (novoStatus) {
                                    case 1 -> tarefaSelecionada.setStatus(Status.CONCLUIDO);
                                    case 2 -> tarefaSelecionada.setStatus(Status.EM_ANDAMENTO);
                                    case 3 -> tarefaSelecionada.setStatus(Status.PENDENTE);
                                    default -> System.out.println("Opção inválida! Status não alterado.");
                                }
                                System.out.println("Status atualizado!");
                                sc.nextLine(); // limpar buffer após nextInt

                                break;

                            default:
                                System.out.println("Opção inválida.");

                                break;
                        }

                    } else if (opn2 == 3) {
                        if (tarefas.isEmpty()) {
                            System.out.println("Não há tarefas para excluir.");
                            break;
                        }
                        System.out.println("Selecione a tarefa que deseja excluir:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + " - " + tarefas.get(i).getTitulo());
                        }
                        int indiceExcluir = sc.nextInt();
                        if (indiceExcluir >= 0 && indiceExcluir < tarefas.size()) {
                            Tarefa removida = tarefas.remove(indiceExcluir);
                            System.out.println("Tarefa \"" + removida.getTitulo() + "\" excluída com sucesso!");

                            // Atualiza os IDs restantes
                            for (int i = 0; i < tarefas.size(); i++) {
                                tarefas.get(i).setId(i);
                            }
                        } else {
                            System.out.println("Índice inválido. Nenhuma tarefa foi excluída.");
                        }

                    }
                    break;
                case 2:
                    String escText;
                    int esc, ano = 0, mes = 0, dia = 0;
                    int escolherTipoBusca;
                    // System.out.println("BUSCAR TAREFAS\n");
                    // System.out.println("TAREFAS PENDENTES\n");
                    for (Tarefa tarefa : tarefas) {
                        if (tarefa.getStatus() == Status.PENDENTE) {
                            System.out.println(tarefa);
                        }
                    }

                    System.out.println("Menu:");
                    System.out.println("1 - Buscar por Status:");
                    System.out.println("2 - Buscar por tipo:");
                    System.out.println("3 - Buscar por Data:");
                    System.out.println("4 - Buscar por Prioridade:");
                    System.out.println("5 - Mostrar todas:");
                    escolherTipoBusca = sc.nextInt();
                    sc.nextLine();

                    switch (escolherTipoBusca) {
                        /* BUSCAR POR STATUS */
                        case 1:
                            System.out.println("Buscar por Status:\n");
                            System.out.println("1 - Concluido");
                            System.out.println("2 - Em andamento");
                            System.out.println("3 - Pendente");
                            esc = sc.nextInt();
                            sc.nextLine();

                            switch (esc) {
                                /* CONCLUIDO */
                                case 1:
                                    System.out.println("Tarefas Concluidas:");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa.getStatus() == Status.CONCLUIDO) {
                                            System.out.println(tarefa);
                                        }
                                    }

                                    break;
                                /* EM ANDAMENTO */
                                case 2:
                                    System.out.println("Tarefas em Andamento:");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa.getStatus() == Status.EM_ANDAMENTO) {
                                            System.out.println(tarefa);
                                        }
                                    }

                                    break;

                                /* PENDENTE */
                                case 3:
                                    System.out.println("Tarefas Pendente:");
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
                        /* BUCAR POR TIPO */
                        case 2:
                            System.out.println("Buscar por Tipo:");
                            System.out.println("1 - Tarefa Pessoal");
                            System.out.println("2 - Tarefa Trabalho");
                            System.out.println("3 - Tarefa Faculdade");
                            esc = sc.nextInt();
                            sc.nextLine();

                            switch (esc) {
                                /* TAREFA PESSOAL */
                                case 1:
                                    System.out.println("Tarefa Pessoal: ");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa instanceof TarefaPessoal) {
                                            System.out.println(tarefa);
                                        }
                                    }
                                    break;
                                /* TAREFA TRABALHO */
                                case 2:
                                    System.out.println("Tarefa Trabalho");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa instanceof TarefaTrabalho) {
                                            System.out.println(tarefa);
                                        }
                                    }
                                    break;
                                /* TAREFA FACULDADE */
                                case 3:
                                    System.out.println("Tarefa Faculdade");
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
                        /* BUSCAR POR DATA */
                        case 3:
                            System.out.println("Buscar por Data:");
                            System.out.println("1 - Dia");
                            System.out.println("2 - Mes");
                            System.out.println("3 - Ano");
                            esc = sc.nextInt();
                            sc.nextLine();
                            switch (esc) {
                                /* BUSCAR POR DIA */case 1:
                                    System.out.println("Buscar por Dia");
                                    System.out.println("Digite o dia (dd/MM/aaaa)");
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
                                    System.out.println("Buscar por Mes");
                                    System.out.println("Digite o mes (MM/aaaa)");
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
                                    System.out.println("Buscar por Ano");
                                    System.out.println("Digite o ano (aaaa)");
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
                            /* BUSCAR POR PRIORIDADE */
                        case 4:
                            System.out.println("Buscar por Prioridade");
                            System.out.println("1 - Alta");
                            System.out.println("2 - Media");
                            System.out.println("3 - Baixa");
                            esc = sc.nextInt();
                            sc.nextLine();

                            switch (esc) {
                                /* ALTA */
                                case 1:
                                    System.out.println("Prioridade Alta: ");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa instanceof Prioritizavel p && p.getPrioridade() == Prioridade.ALTA) {
                                            System.out.println(tarefa);
                                        }
                                    }
                                    break;
                                /* MEDIA */
                                case 2:
                                    System.out.println("Prioridade Media: ");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa instanceof Prioritizavel p
                                                && p.getPrioridade() == Prioridade.MEDIA) {
                                            System.out.println(tarefa);
                                        }
                                    }

                                    break;

                                /* BAIXA */
                                case 3:
                                    System.out.println("Prioridade Baixa");
                                    for (Tarefa tarefa : tarefas) {
                                        if (tarefa instanceof Prioritizavel p
                                                && p.getPrioridade() == Prioridade.BAIXA) {
                                            System.out.println(tarefa);
                                        }
                                    }
                                    break;

                                default:
                                    break;
                            }
                            break;
                        /* MOSTRAR TODAS */
                        case 5:
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
        sc.close();
    }
}
