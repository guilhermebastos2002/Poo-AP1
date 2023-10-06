import java.util.Scanner;

public class AplicativoIngresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  interação com o usuário
        while (true) {
            System.out.println("Qual evento você está interessado :");
            // Exiba a lista de eventos disponíveis para compra
            String[] opcoesDisponiveis = {"Opção 1", "Opção 2", "Opção 3"};
//criar um cadastre o evento 
// evento foi cadastrado ? se sim continue para o evento
            // Exibe as opções disponíveis para o usuário
            System.out.println("Opções disponíveis:");
            for (int i = 0; i < opcoesDisponiveis.length; i++) {
                System.out.println((i + 1) + ". " + opcoesDisponiveis[i]);
            }

            System.out.print("Digite o número do evento: ");
            int numeroEvento = scanner.nextInt();
            scanner.nextLine(); 

            Evento eventoEscolhido = getEvento(numeroEvento);
            
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

            // Pergunte ao usuário se deseja continuar comprando
            System.out.print("Deseja comprar mais ingressos? (S/N): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("S")) {
                System.out.println("Obrigado, volte sempre!");
                break;
            }
        }

    }
        scanner.close();
    }

    private static Evento getEvento(int numeroEvento) {
        return null;
    }
}
