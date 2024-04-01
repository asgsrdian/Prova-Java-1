import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("### CALCULADORA ####");
        System.out.println("Inserir primeiro numero:");
        float num1 = scanner.nextFloat();

        System.out.println("Inserir segundo numero:");
        float num2 = scanner.nextFloat();

        System.out.println("Escolha a operação: + (adição), - (subtração), * (multiplicação), / (divisão)");
        char operation = scanner.next().charAt(0);

        float resultado;
        scanner.close();

        switch (operation) {
            case '+':
                resultado = calculator.adição(num1, num2);
                break;
            case '-':
                resultado = calculator.subtração(num1, num2);
                break;
            case '*':
                resultado = calculator.mult(num1, num2);
                break;
            case '/':
                resultado = calculator.div(num1, num2);
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
        
    }
}
