public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Nissan", "Sedan", 2020, "CTA-2023", 100);
        
        System.err.println("Velocidade: " + carro1.velocidade);
        carro1.AcelerarCarro(20);
        carro1.DiminuirVelocidade(10);

        carro1.exibirTudo();
    }
}
