package entidades;

import java.time.LocalDate;

import pastEnum.Status;

public class TarefaPessoal extends Tarefa {

    public TarefaPessoal(int id, String titulo, String descricao, LocalDate prazo, Status status) {
        super(id, titulo, descricao, prazo, status);

    }

    @Override
    public String toString() {
        return """
                Tarefa Pessoal
                    ID: %d      Titulo: %s
                    Descricao: %s
                    Status: %s              Prazo: %s
                    """.formatted(id, titulo, descricao, status, prazo == null ? "Sem prazo definido" : prazo);

    }

    @Override
    public String getTipo() {
        return "Pessoal";
    }

}
