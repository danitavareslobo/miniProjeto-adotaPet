package Model;

public class Adotante implements Validavel, Relatorio {
    private String nome;
    private String cpf;
    private String endereco;
    private String preferencias;
    private boolean ativo;

    public Adotante(String nome, String cpf, String endereco, String preferencias) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.preferencias = preferencias;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean validar() {
        return this.ativo &&
                this.cpf != null && !this.cpf.isEmpty() &&
                this.nome != null && !this.nome.isEmpty() &&
                this.endereco != null && !this.endereco.isEmpty();
    }

    @Override
    public String gerarRelatorio() {
        return String.format(
                "=== RELATÓRIO DO ADOTANTE ===\n" +
                        "Nome: %s\n" +
                        "CPF: %s\n" +
                        "Endereço: %s\n" +
                        "Preferências: %s\n" +
                        "Status: %s\n" +
                        "=============================",
                nome, cpf, endereco, preferencias, (ativo ? "Ativo" : "Inativo")
        );
    }

    @Override
    public String toString() {
        return "Adotante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", preferencias='" + preferencias + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}