package Model;

public class Cao extends Animal {
    private String porte;
    private boolean necessitaPasseio;

    public Cao(String id, String nome, String especie, int idade, String condicaoSaude,
               String temperamento, String status, String porte, boolean necessitaPasseio) {
        super(id, nome, especie, idade, condicaoSaude, temperamento, status);
        this.porte = porte;
        this.necessitaPasseio = necessitaPasseio;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public boolean isNecessitaPasseio() {
        return necessitaPasseio;
    }

    public void setNecessitaPasseio(boolean necessitaPasseio) {
        this.necessitaPasseio = necessitaPasseio;
    }

    @Override
    public String toString() {
        return "Cao{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                ", condicaoSaude='" + condicaoSaude + '\'' +
                ", temperamento='" + temperamento + '\'' +
                ", status='" + status + '\'' +
                ", porte='" + porte + '\'' +
                ", necessitaPasseio=" + necessitaPasseio +
                '}';
    }
}