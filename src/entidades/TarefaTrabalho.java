package entidades;

import java.time.LocalDate;

import pastEnum.Prioridade;
import pastEnum.Status;

public class TarefaTrabalho extends Tarefa implements Prioritizavel {
    private Prioridade prioridade;

    public TarefaTrabalho(int id, String titulo, String descricao, LocalDate prazo, Status status,
            Prioridade prioridade) {
        super(id, titulo, descricao, prazo, status);
        this.prioridade = prioridade;
    }

    @Override
    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        String saida = """
                Tarefa Trabalho
                ID: %d      Titulo: %s      Prioridade: %s
                        Descricao: %s
                        Status: %s              Prazo: %s
                        """.formatted(id, titulo, prioridade, descricao, status, prazo);
        return saida;
    }

    @Override
    public String getTipo() {
        return "Trabalho";
    }

}
