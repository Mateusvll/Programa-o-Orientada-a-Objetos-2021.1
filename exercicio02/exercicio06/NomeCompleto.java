package exercicio06;

public class NomeCompleto {
    private String nomeProprio;
    private String nomeMeio;
    private String nomeFamilia;

    public NomeCompleto(String nomeProprio, String nomeMeio, String nomeFamilia) {
        this.nomeProprio = nomeProprio;
        this.nomeMeio = nomeMeio;
        this.nomeFamilia = nomeFamilia;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    public void setNomeFamilia(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }

    public String rubrica() {
        return this.getNomeProprio().toLowerCase().charAt(0) + "" +
                this.getNomeMeio().toLowerCase().charAt(0) + "" +
                this.getNomeFamilia().toLowerCase().charAt(0);
    }

    public String assinatura() {
        return this.getNomeProprio().toUpperCase().charAt(0) + "." +
                this.getNomeMeio().toUpperCase().charAt(0) + "." +
                this.getNomeFamilia();

    }

}
