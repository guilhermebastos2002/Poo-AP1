public class Show extends Evento {
    private String artista;
    private String generoMusica;
    private String localizacaoIngresso;

 public Show(String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio, String artista, String generoMusica) {
        super(nome, data, local, ingressosInteira, ingressosMeia, precoCheio);
        this.artista = artista;
        this.generoMusica = generoMusica; 
    }


    public String getArtista() {
        return artista;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    @Override
    public boolean venderIngresso(TipoIngresso tipo, int quantidade) {
        
        throw new UnsupportedOperationException("Unimplemented method 'venderIngresso'");
    }
}
