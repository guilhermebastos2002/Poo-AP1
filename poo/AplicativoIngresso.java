import java.util.List;
import java.util.Scanner;

public class AplicativoIngresso {
    private static Evento eventoEscolhido;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaCadastroEventos sistema = new SistemaCadastroEventos();

        Evento evento1 = new Show("Show", "2023-10-10", "Maracanã", 500, 250, 0, "Marshmello", "Eletrônica");
        Evento evento2 = new Jogo("Jogo", "2023-10-22", "Maracanã", "80", "50", "100", "Futebol", "Flamengo", "Vasco", "42.50");

        sistema.cadastrarEvento(evento1);
        sistema.cadastrarEvento(evento2);

        while (true) {
            System.out.println("Qual evento você está interessado:");
            List<Evento> eventosDisponiveis = sistema.listarEventos();

            // Exibe as opções disponíveis para o usuário
            for (int i = 0; i < eventosDisponiveis.size(); i++) {
                Evento evento = eventosDisponiveis.get(i);
                System.out.println((i + 1) + ". " + evento.getNome());
            }

            System.out.print("Digite o número do evento (ou 0 para sair): ");
            int numeroEvento = scanner.nextInt();
            scanner.nextLine();

            if (numeroEvento == 0) {
                System.out.println("Obrigado por usar o aplicativo. Até!");
                break;
            }

            if (numeroEvento >= 1 && numeroEvento <= eventosDisponiveis.size()) {
                Evento eventoEscolhido = eventosDisponiveis.get(numeroEvento - 1);

                System.out.println("Nome do evento: " + eventoEscolhido.getNome());
                System.out.println("Data do evento: " + eventoEscolhido.getData());
                System.out.println("Local do evento: " + eventoEscolhido.getLocal());
                System.out.println("Nome do artista/jogo: " + eventoEscolhido.getArtista());
                System.out.println("Gênero musical/esporte: " + eventoEscolhido.getgeneroMusical());
            } else {
                System.out.println("Número de evento inválido. Tente novamente.");
        
            }
            System.out.print("Digite a quantidade de ingressos desejados" );
            int quantidadeIngressos = scanner.nextInt();
            // quantidade e valida
            if (quantidadeIngressos > 0) {

                // Verifique se há ingressos disponíveis para o evento e a quantidade desejada
                if (eventoEscolhido.isIngressoDisponivel(TipoIngresso.INTEIRA, quantidadeIngressos)) {
                    // Realize a venda de ingressos
                    boolean precoTotal = eventoEscolhido.venderIngresso(TipoIngresso.INTEIRA, quantidadeIngressos);
                    System.out.println("Compra realizada com sucesso!");
                    System.out.println("Preço total: R$" + precoTotal);
                } else {
                    System.out.println("Desculpe, não há ingressos disponíveis para a quantidade desejada.");
                }

        }

        scanner.close();
    }
}
}
