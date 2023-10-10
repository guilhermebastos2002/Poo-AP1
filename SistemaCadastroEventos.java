import java.util.ArrayList;
import java.util.List;

public class SistemaCadastroEventos {
    private List<Evento> eventos;

    public SistemaCadastroEventos() {
        eventos = new ArrayList<>();
    }

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
    }

    public Evento getEvento(int numeroEvento) {
        if (numeroEvento >= 1 && numeroEvento <= eventos.size()) {
            return eventos.get(numeroEvento - 1);
        } else {
            return null;
        }
    }

    public List<Evento> listarEventos() {
        return eventos;
    }
}