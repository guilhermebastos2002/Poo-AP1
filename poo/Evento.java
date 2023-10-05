public abstract class Evento{
    private String nome;
    private String data;
    private String local;
    protected int ingressosInteira;
    public int ingressosMeia;
    private double precoCheio;

    public Evento(String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.ingressosInteira = ingressosInteira;
        this.ingressosMeia = ingressosMeia;
        this.precoCheio = precoCheio;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getIngressosInteira() {
        return ingressosInteira;
    }

    public void setIngressosInteira(int ingressosInteira) {
        this.ingressosInteira = ingressosInteira;
    }

    public int getIngressosMeia() {
        return ingressosMeia;
    }

    public void setIngressosMeia(int ingressosMeia) {
        this.ingressosMeia = ingressosMeia;
    }

    public double getPrecoCheio() {
        return precoCheio;
    }

    public void setPrecoCheio(double precoCheio) {
        this.precoCheio = precoCheio;
    }

    public abstract boolean venderIngresso(TipoIngresso tipo, int quantidade);
{

    
}
public boolean isIngressoDisponivel(TipoIngresso inteira, int quantidadeIngressos) {
    return false;
}
}