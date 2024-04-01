public class Main {
    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador("Vinicius", 1000, 23);
        Jogador jogador2 = new Jogador("Joao", 100, 26);

        System.out.println("Nome do jogaodor " + jogador1.nome);

        jogador1.AumentarNivel(10);
        jogador1.AumentarPontuação(320);

        jogador1.exibirInfo();
        System.out.println();
        jogador2.exibirInfo();
        
    }
    
}
