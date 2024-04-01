public class Main {
 
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria(102, "Vinicius Gonçalves Ribeiro", 3000);

        System.out.println("Saldo da conta: R$" + conta1.consultarSaldo());

        conta1.depositar(1000);
        conta1.sacar(10000);

        System.out.println("Saldo de R$" + conta1.consultarSaldo());

        conta1.exibir();
    }
}
