package Map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;

//Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:
//USANDO MAP
//adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
//removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
//exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
//pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.


public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        return contatos.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Maria"));

        agenda.removerContato("Maria");

        agenda.exibirContatos();
    }
}
