import java.util.List;
import java.util.Scanner;

import entidades.Tarefa;
import pastEnum.Status;

public class BuscarTarefas {

    public static void Buscar(List<Tarefa> tarefas) {
        Scanner sc = new Scanner 
        int escolherTipoBusca;
        System.out.println("BUSCAR TAREFAS");
        System.out.println("TAREFAS PENDENTES\n\n");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus() == Status.PENDENTE) {
                System.out.println(tarefa);
            }
        }

        System.out.println("""
                1- BUSCAR POR 2- BUCAR POR STATUS TIPO  3-BUSCAR POR DATA   4-BUSCAR POR DATA 5-MOSTRAR TODAS
                                """);
        

    }
}
