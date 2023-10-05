import java.util.Scanner;

public class AplicativoIngresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evento[] eventosDisponiveis = new Evento[10];
        eventosDisponiveis[0] = new Jogo ("Flamengo", "01/01/2023", "Local A", 100, 50, 50.0, null, null, null, 2);
        eventosDisponiveis[1] = new Show (null, null, null, 0, 0, 0, null, null);
       



        // Exemplo de interação com o usuário
        while (true) {
            System.out.println("Qual evento você está interessado :");
            // Exiba a lista de eventos disponíveis para compra
            System.out.println("Lista de eventos disponíveis para compra:");
for (int i = 0; i < eventosDisponiveis.length; i++) {
    Evento evento = eventosDisponiveis[i];
    System.out.println("Evento " + i);
    System.out.println("Nome: " + evento.getNome());
    System.out.println("Data: " + evento.getData());
    System.out.println("Local: " + evento.getLocal());
    System.out.println("Ingressos Inteira Disponíveis: " + evento.getIngressosInteira());
    System.out.println("Ingressos Meia Disponíveis: " + evento.getIngressosMeia());
    System.out.println("Preço Cheio: R$" + evento.getPrecoCheio());
    System.out.println();
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
