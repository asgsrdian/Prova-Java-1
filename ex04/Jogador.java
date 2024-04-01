public class Jogador {
    String nome;
    private int pontuação;
    private int nivel;

    public Jogador(String nome, int pontuação, int nivel){
        this.nome = nome;
        this.pontuação = pontuação;
        this.nivel = nivel;
    }

    public void AumentarNivel(int aumentanivel){
        nivel=nivel+aumentanivel;
        System.err.println("Foi aumentado " + aumentanivel + " nivel(is).");
    }

    public void AumentarPontuação(int aumentapontuação){
        pontuação=pontuação+aumentapontuação;
        System.err.println("Foi aumentado " + aumentapontuação + " pontuação.");
    }

    public float aumentapontuação(){
        return pontuação;
    }

    public float aumentanivel(){
        return nivel;
    }

    public void exibirInfo() {
        System.out.println("\nJogador: " + nome);
        System.out.println("Pontuação: " + pontuação);
        System.out.println("Nivel: " + nivel);
    }



    
}
