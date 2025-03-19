package Set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

//Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:
//
//adicionarContato(String nome, int numero): Adiciona um contato à agenda.
//exibirContatos(): Exibe todos os contatos da agenda.
//pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
//atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.


public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public  void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contato.setNumero(novoNumero);
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("José", 456789123);

        System.out.println("Contatos: ");
        agendaContatos.exibirContatos();

        System.out.println("Pesquisa por nome: ");
        System.out.println(agendaContatos.pesquisarPorNome("Jo"));
        System.out.println(agendaContatos.pesquisarPorNome("Ma"));

        agendaContatos.atualizarNumeroContato("Maria", 111111111);
        System.out.println("Contatos atualizados: ");
        agendaContatos.exibirContatos();
    }
}


