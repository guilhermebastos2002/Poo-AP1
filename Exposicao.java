public class Exposicao extends Evento{
    private String faixaEtaria;
    private String duracao;
    private boolean descontoSocial;

    public Exposicao(String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
        this.descontoSocial = descontoSocial;
    }

    public String getFaixaEtaria(){
        return faixaEtaria;
    }

    public String getDuracao(){
        return duracao;
    }

    public boolean getDescontoSocial(){
        return descontoSocial;
    }

    @Override
    public boolean venderIngresso(TipoIngresso tipo, int quantidade){
        if (tipo == TipoIngresso.INTEIRA) {
            if (quantidade <= ingressosInteira) {
                ingressosInteira -= quantidade;
                return true; 
            } else {
                return false; 
            }
        } else if (tipo == TipoIngresso.MEIA) {
            if (quantidade <= ingressosMeia) {
                ingressosMeia -= quantidade;
                return true; 
            } else {
                return false; 
            }
        } else {
            return false; 
        }
    }
}
