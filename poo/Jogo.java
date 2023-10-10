public class Jogo extends Evento {
    private String esporte;
    private String equipeCasa;
    private String equipeVisitante;
    private String percentualDescontoTorcedor;
    public Jogo(String nome, String data, String local, String ingressosInteira, String ingressosMeia, String precoCheio , String esporte, String equipeCasa, String equipeVisitante, String percentualDescontoTorcedor) {
        super(nome, data, local, ingressosInteira, ingressosMeia,precoCheio, percentualDescontoTorcedor);
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

    public String getPercentualDescontoTorcedor() {
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
