import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Tarefa;

/* 
     * 
     *          MENU PRINCIPAL
     * 
     * 
     */

public class Programa {
    public static void main(String[] args) throws Exception {
        List<Tarefa> tarefas = new ArrayList<>();
        MenuConsole ms = new MenuConsole(tarefas);
        Scanner sc = new Scanner(System.in);
        int escolhaMenuPrincipal, escolhaMenuTarefas;
        char escolharTxt;

        do {
            // CHAMA O TEXTO INICIAL DA APLICAÇÃO
            ms.sListadeTarefas();

            // MOSTRAR A LISTA DE TAREFAS QUE AINDA ESTÃO PENDENTE OU EM ANDAMENTO
            ms.sListaDeTarefasNaoConcluidas();

            // MOSTRA MENU PRINCIPAL DA APLICAÇÃO
            ms.sMenuPrincipal();

            escolhaMenuPrincipal = sc.nextInt();
            sc.nextLine();

            // MOSTRA MENU DE TAREFAS
            ms.sMenuTarefas();
            System.out.println("QUAL O TIPO DE TAREFA?(PESSOAL (P)/ TRABALHO (T) / FACULDADE ) (F) : ");
            switch (escolharTxt) {
                case 'p':

                    break;

                default:
                    break;
            }

        } while (false);

    }
}
