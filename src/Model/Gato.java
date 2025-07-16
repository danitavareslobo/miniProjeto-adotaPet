package Model;

public class Gato extends Animal {
    private boolean conviveComOutrosGatos;

    public Gato(String id, String nome, String especie, int idade, String condicaoSaude,
                String temperamento, String status, boolean conviveComOutrosGatos) {
        super(id, nome, especie, idade, condicaoSaude, temperamento, status);
        this.conviveComOutrosGatos = conviveComOutrosGatos;
    }

    // Getters e Setters específicos
    public boolean isConviveComOutrosGatos() {
        return conviveComOutrosGatos;
    }

    public void setConviveComOutrosGatos(boolean conviveComOutrosGatos) {
        this.conviveComOutrosGatos = conviveComOutrosGatos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                ", condicaoSaude='" + condicaoSaude + '\'' +
                ", temperamento='" + temperamento + '\'' +
                ", status='" + status + '\'' +
                ", conviveComOutrosGatos=" + conviveComOutrosGatos +
                '}';
    }
}