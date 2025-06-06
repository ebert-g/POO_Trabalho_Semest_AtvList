import java.time.LocalDate;
import java.util.List;

import entidades.Tarefa;
import entidades.TarefaFaculdade;
import entidades.TarefaPessoal;
import entidades.TarefaTrabalho;
import pastEnum.Prioridade;
import pastEnum.Status;

public class InicialTarefas {

        public static void GerarTarefas(List<Tarefa> tarefas) {
                Tarefa tarefa;
                tarefa = new TarefaPessoal(0, "Comprar pao", "Comprar pao pela Manha", LocalDate.now(),
                                Status.PENDENTE);
                tarefas.add(tarefa);
                tarefa = new TarefaFaculdade(1, "Estudar para Apresentacao de POO",
                                "Estudar o codigo do projeto de poo",
                                LocalDate.of(2025, 6, 9), Status.EM_ANDAMENTO, Prioridade.ALTA);
                tarefas.add(tarefa);
                tarefa = new TarefaTrabalho(2, "Comprar Mouse", "Compra 2 mouses de escritorio",
                                LocalDate.of(2025, 4, 30),
                                Status.CONCLUIDO, Prioridade.MEDIA);
                tarefas.add(tarefa);
                tarefa = new TarefaPessoal(3, "Fazer caminhada", "Caminhar 30 minutos no final da tarde",
                                LocalDate.of(2025, 6, 6), Status.PENDENTE);
                tarefas.add(tarefa);

                tarefa = new TarefaFaculdade(4, "Ler capítulo de Redes de Computadores",
                                "Estudar o capítulo 5 para o seminário de sexta-feira",
                                LocalDate.of(2025, 6, 7), Status.EM_ANDAMENTO, Prioridade.MEDIA);
                tarefas.add(tarefa);

                tarefa = new TarefaTrabalho(5, "Organizar arquivos da equipe",
                                "Criar pastas por setor e mover documentos antigos",
                                LocalDate.of(2025, 6, 5), Status.CONCLUIDO, Prioridade.BAIXA);
                tarefas.add(tarefa);

                tarefa = new TarefaFaculdade(6, "Finalizar slide da apresentação de IA",
                                "Adicionar exemplos práticos e revisar layout dos slides",
                                LocalDate.of(2025, 6, 8), Status.PENDENTE, Prioridade.ALTA);
                tarefas.add(tarefa);
        }
}
