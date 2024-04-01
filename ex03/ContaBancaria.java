public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo=saldo+valor;
        System.err.println("Deposito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(float valor){
        if(saldo<valor){
            System.err.println("Saldo insuficiente");
        }
        else{
            saldo = saldo-valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    public void exibir(){
            System.out.println("\nNumero da conta: " + numeroConta);
            System.out.println("Nome titular: " + nomeTitular);
            System.out.println("saldo: " + saldo);
        }
    }
