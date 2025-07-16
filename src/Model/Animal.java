package Model;

public abstract class Animal implements Validavel, Relatorio {
    protected String id;
    protected String nome;
    protected String especie;
    protected int idade;
    protected String condicaoSaude;
    protected String temperamento;
    protected String status;

    public Animal(String id, String nome, String especie, int idade, String condicaoSaude, String temperamento, String status) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.condicaoSaude = condicaoSaude;
        this.temperamento = temperamento;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCondicaoSaude() {
        return condicaoSaude;
    }

    public void setCondicaoSaude(String condicaoSaude) {
        this.condicaoSaude = condicaoSaude;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean validar() {
        return this.status.equals("Disponível") &&
                this.condicaoSaude != null && !this.condicaoSaude.isEmpty() &&
                this.temperamento != null && !this.temperamento.isEmpty() &&
                this.nome != null && !this.nome.isEmpty();
    }

    @Override
    public String gerarRelatorio() {
        return String.format(
                "=== RELATÓRIO DO ANIMAL ===\n" +
                        "ID: %s\n" +
                        "Nome: %s\n" +
                        "Espécie: %s\n" +
                        "Idade: %d anos\n" +
                        "Condição de Saúde: %s\n" +
                        "Temperamento: %s\n" +
                        "Status: %s\n" +
                        "==========================",
                id, nome, especie, idade, condicaoSaude, temperamento, status
        );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                ", condicaoSaude='" + condicaoSaude + '\'' +
                ", temperamento='" + temperamento + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}