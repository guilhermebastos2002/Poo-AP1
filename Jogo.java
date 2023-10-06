public class Jogo extends Evento {
    private String esporte;
    private String equipeCasa;
    private String equipeVisitante;
    private double percentualDescontoTorcedor;

    public Jogo(String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio, String esporte, String equipeCasa, String equipeVisitante, double percentualDescontoTorcedor) {
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.esporte = esporte;
        this.equipeCasa = equipeCasa;
        this.equipeVisitante = equipeVisitante;
        this.percentualDescontoTorcedor = percentualDescontoTorcedor;
    }

    public String getEsporte() {
        return esporte;
    }

    public String getEquipeCasa() {
        return equipeCasa;
    }

    public String getEquipeVisitante() {
        return equipeVisitante;
    }

    public double getPercentualDescontoTorcedor() {
        return percentualDescontoTorcedor;
    }

    @Override
    public boolean venderIngresso(TipoIngresso tipo, int quantidade) {
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

