class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private float preco;

    public Produto(String nome, int codigo, int quantidade, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public float getValorTotal() {
        return quantidade * preco;
    }

    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
}