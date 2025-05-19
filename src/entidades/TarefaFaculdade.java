package entidades;

import java.time.LocalDate;

import pastEnum.Prioridade;
import pastEnum.Status;

public class TarefaFaculdade extends Tarefa implements Prioritizavel {
    private Prioridade prioridade;

    public TarefaFaculdade(int id, String titulo, String descricao, LocalDate prazo, Status status,
            Prioridade prioridade) {
        super(id, titulo, descricao, prazo, status);
        this.prioridade = prioridade;
    }

    @Override
    public Prioridade getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        String saida = """
                ID: %d      Titulo: %s      Prioridade: %s
                Descricao: %s
                Status: %s              Prazo: %s
                """.formatted(id, titulo, prioridade, descricao, status, prazo);
        return saida;
    }

    @Override
    public String getTipo() {
        return "Faculdade";
    }

}
