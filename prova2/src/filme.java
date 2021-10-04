package prova;

import java.util.ArrayList;
import java.util.List;


public class filme {
    public String nome;
    private long idfilme;
    public int duracao;
    private List<Categoria> Categoria = new ArrayList<Categoria>();
    public String sessão;
    private String cinema;

    public filme(long idfilme, String nome, List<Categoria> categoria) {
        this.idfilme = idfilme;
        this.nome = nome;
        Categoria = categoria;
    }

    public Universidade(long idUniversidade, String nome) {
        this.idfilme = idfilme;
        this.nome = nome;
    }
    public long getduracao() {
        return duracao;
    }

    public void setduracao(long duracao) {
        this.duracao = duracao;
    }

    public long cinema() {
        return cinema;
    }

    public void cinema(long cinema) {
        this.cinema = cinema;
    }

    public long sessão() {
        return sessão;
    }

    public void sessão(long sessão) {
        this.sessão = sessão;
    }

    public long getIdfilme() {
        return idfilme;
    }

    public void setIdfilme(long idfilme) {
        this.idfilme = idfilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Categoria> getCategoria() {
        return Categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        Categoria = categoria;
    }

}
