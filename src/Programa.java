import java.util.ArrayList;
import java.util.List;

import entidades.Tarefa;

public class Programa {
    public static void main(String[] args) throws Exception {
        List<Tarefa> tarefas = new ArrayList<>();
        InicialTarefas.GerarTarefas(tarefas);
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }

    }
}
