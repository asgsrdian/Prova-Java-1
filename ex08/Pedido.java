import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedido() {
        pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void cancelarPedido() {
        pizzas.clear();
        enderecoEntrega = null;
    }

    public float calcularTotal() {
        float total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    public void mostrarDetalhes() {
        System.out.println("=== Detalhes do Pedido ===");
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("Quantidade de Pizzas: " + pizzas.size());
        System.out.println("Pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("Total a pagar: R$" + calcularTotal());
    }
}