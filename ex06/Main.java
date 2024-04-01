import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("João", "41996532105");
        Contato contato2 = new Contato("Maria", "41987654321");
        Contato contato3 = new Contato("João", "41999999999");

        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        String nomeBusca = "João";
        List<Contato> contatosEncontrados = agenda.buscarContatosPorNome(nomeBusca);
        if (!contatosEncontrados.isEmpty()) {
            System.out.println("Contatos encontrados com o nome '" + nomeBusca + "':");
            for (Contato contato : contatosEncontrados) {
                System.out.println(contato);
            }
        } else {
            System.out.println("Nenhum contato encontrado com o nome '" + nomeBusca + "'.");
        }
    }
}