import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;
        while (executando) {
            System.out.println("### Sistema de Gerenciamento de Estoque ###");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Mostrar Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    mostrarRelatorioEstoque();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }

    private static void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        System.out.print("Preço do produto: ");
        float preco = scanner.nextFloat();
        estoque.add(new Produto(nome, codigo, quantidade, preco));
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void atualizarProduto() {
        System.out.print("Código do produto que deseja atualizar: ");
        int codigo = scanner.nextInt();
        boolean encontrado = false;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.print("Quantidade em estoque: ");
                int novaQuantidade = scanner.nextInt();
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void removerProduto() {
        System.out.print("Código do produto que deseja remover: ");
        int codigo = scanner.nextInt();
        boolean removido = false;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void mostrarRelatorioEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("### Relatório de Estoque ###");
            for (Produto produto : estoque) {
                System.out.println(produto);
            }
            float valorTotalEstoque = calcularValorTotalEstoque();
            System.out.println("Valor total em estoque: R$" + valorTotalEstoque);
        }
    }

    private static float calcularValorTotalEstoque() {
        float valorTotal = 0;
        for (Produto produto : estoque) {
            valorTotal += produto.getValorTotal();
        }
        return valorTotal;
    }
}