package entidades;

import java.time.LocalDate;

import pastEnum.Status;

public abstract class Tarefa {
    protected int id;
    protected String titulo;
    protected String descricao;
    protected LocalDate prazo;
    protected Status status;

    public Tarefa(int id, String titulo, String descricao, LocalDate prazo, Status status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.status = Status.PENDENTE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isConcluida() {
        return this.status == Status.CONCLUIDO;
    }

    public abstract String toString();

    public abstract String getTipo();
}
