package main.java.list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
         Set<Contato> contatosPorNome = new HashSet<>();
         for (Contato contatos : contatoSet) {
             if (contatos.getNome().startsWith(nome)) {
                 contatosPorNome.add(contatos);
             }
         }
         return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contatos : contatoSet) {
            if (contatos.getNome().equalsIgnoreCase(nome)) {
                contatos.setNumero(novoNumero);
                contatoAtualizado = contatos;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Sergio Campos", 123456);
        agendaContatos.adicionarContato("Sergio Campos", 1234);
        agendaContatos.adicionarContato("Sergio Silva", 11111111);
        agendaContatos.adicionarContato("Sergio Silva de Campos", 654987);
        agendaContatos.adicionarContato("Marcia Campos", 11111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Sergio"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Sergio Campos", 123456789));

        agendaContatos.exibirContatos();
    }
}
