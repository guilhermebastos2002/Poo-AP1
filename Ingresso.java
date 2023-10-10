public abstract class Ingresso {
    private Evento evento;
    private TipoIngresso tipo;

    public Ingresso(Evento evento, TipoIngresso tipo) {
        this.evento = evento;
        this.tipo = tipo;
    }

    public Evento getEvento() {
        return evento;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public abstract double getPreco();
}
