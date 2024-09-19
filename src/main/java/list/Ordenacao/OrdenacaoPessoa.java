package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // atributos

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        // criando uma lista
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        // criando uma lista
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Sergio", 46, 1.74);
        ordenacaoPessoa.adicionarPessoa("Marcia", 49, 1.66);
        ordenacaoPessoa.adicionarPessoa("Agnelo", 29, 1.84);
        ordenacaoPessoa.adicionarPessoa("Giovani", 19, 1.80);
        ordenacaoPessoa.adicionarPessoa("Miguel", 11, 1.55);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
