package prova;

public class categoria {
    private long idCategoria;
    private String nome;



    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "categoria{" +
                "idcategoria=" + idCategoria +
                ", nome='" + nome + '\'' +
                '}';
    }
}

