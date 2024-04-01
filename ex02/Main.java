public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Livro livro2 = new Livro("O Senhor dos Anéis - A Sociedade do Anel", "J.R.R. Tolkien", 1954);
        Livro livro3 = new Livro("1984", "George Orwell", 1949);

        livro1.exibirInfo();
        System.out.println(); 
        livro2.exibirInfo();
        System.out.println(); 
        livro3.exibirInfo();
    }
}
