import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Pizza> cardapio = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarCardapio();

        Pedido pedido = new Pedido();

        adicionarPizzasAoPedido(pedido);

        System.out.print("Digite o endereço de entrega: ");
        String enderecoEntrega = scanner.nextLine();
        pedido.setEnderecoEntrega(enderecoEntrega);

        pedido.mostrarDetalhes();
    }

    private static void inicializarCardapio() {
        List<String> ingredientesMussarela = new ArrayList<>();
        ingredientesMussarela.add("Molho de tomate");
        ingredientesMussarela.add("Mussarela");

        Pizza pizzaMussarela = new Pizza("Mussarela", 30.0f, ingredientesMussarela);

        List<String> ingredientesCalabresa = new ArrayList<>();
        ingredientesCalabresa.add("Molho de tomate");
        ingredientesCalabresa.add("Calabresa");
        ingredientesCalabresa.add("Cebola");

        Pizza pizzaCalabresa = new Pizza("Calabresa", 35.0f, ingredientesCalabresa);

        cardapio.add(pizzaMussarela);
        cardapio.add(pizzaCalabresa);
    }

    private static void adicionarPizzasAoPedido(Pedido pedido) {
        System.out.println("Menu:");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i));
        }
        System.out.println("Escolha a pizza pelo número ou digite 0 para finalizar:");
        int opcao;
        do {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao > 0 && opcao <= cardapio.size()) {
                    pedido.adicionarPizza(cardapio.get(opcao - 1));
                    System.out.println("Pizza " + cardapio.get(opcao - 1).getNome() + " adicionada ao pedido.");
                } else if (opcao < 0 || opcao > cardapio.size()) {
                    System.out.println("Opção inválida. Escolha um número válido.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
                opcao = -1;
            }
        } while (opcao != 0);
    }
}