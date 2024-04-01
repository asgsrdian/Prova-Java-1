public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

  
    public void exibirInfo() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}
