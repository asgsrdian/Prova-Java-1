public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    float velocidade;

    public Carro(String marca, String modelo, int ano, String placa, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    public void DiminuirVelocidade(float frear){
        velocidade = velocidade-frear;
        System.out.println("## Freando Carro ##");
        System.out.println("Velocidade: " + velocidade);
    }

    public void AcelerarCarro(float acelerar){
        velocidade = velocidade+acelerar;
        System.out.println("## Acelerando Carro ##");
        System.out.println("Velocidade: " + velocidade);
    }

    public void exibirTudo(){
        System.err.println("\nMarca: " + marca);
        System.err.println("Modelo: " + modelo);
        System.err.println("Ano: " + ano);
        System.err.println("Placa: " + placa);
        System.err.println("Velocidade: " + velocidade);
    }
    
}
