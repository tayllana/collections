package List.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
//        for (listas.listaDeTarefas.Tarefa t: tarefaList){
//            if (t.getDescricao().equalsIgnoreCase(descricao)) {
//                tarefaParaRemover.add(t);
//            }
//        }
        tarefaList.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefa(){
        System.out.println(tarefaList);
    }

    @Override
    public String toString() {
        return "listas.listaDeTarefas.ListaTarefas{" +
                "tarefaList=" + tarefaList +
                '}';
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("comprar sal");
        lista.adicionarTarefa("comprar feijao");
        lista.adicionarTarefa("comprar arroz");

        lista.obterDescricoesTarefa();
    }
}
