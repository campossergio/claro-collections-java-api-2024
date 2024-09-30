package main.java.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributos

    // criando uma coleção de convidados
    private Set<Convidados> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String name, int codInvite) {
        convidadoSet.add(new Convidados(name, codInvite));
    }

    public void removerConvidadoPorCodigoConvite(int codInvite) {
        Convidados convidadosParaRemover = null;
        for (Convidados convidado : convidadoSet) {
            if (convidado.getCodInvite() == codInvite) {
                convidadosParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadosParaRemover);
    }

    // retornar a quantidade de convidados
    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        for (Convidados convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados!!!");

        conjuntoConvidados.adicionarConvidado("Sergio Campos", 123);
        conjuntoConvidados.adicionarConvidado("Marcia CaMPOS", 456);
        conjuntoConvidados.adicionarConvidado("Giovani Campos", 789);
        conjuntoConvidados.adicionarConvidado("Miguel Campos", 101);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados!!!");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados!!!");

        conjuntoConvidados.exibirConvidados();
    }
}
