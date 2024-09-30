package main.java.list.OperacoesBasicas;

import java.util.Objects;

public class Convidados {
    // atributos

    private String name;
    private int codInvite;

    public Convidados(String name ,int codInvite) {
        this.name = name;
        this.codInvite = codInvite;
    }

    public String getName() {
        return name;
    }

    public int getCodInvite() {
        return codInvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidados that = (Convidados) o;
        return codInvite == that.codInvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codInvite);
    }

    @Override
    public String toString() {
        return "Convidados {" +
                " name= '" + name + '\'' +
                ", codInvite= " + codInvite +
                '}';
    }
}
