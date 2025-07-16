package Model;

import java.util.Date;

public class Adocao {
    private String id;
    private Adotante adotante;
    private Animal animalAdotado;
    private Date data;
    private boolean termoAssinado;

    public Adocao(String id, Adotante adotante, Animal animalAdotado, Date data) {
        this.id = id;
        this.adotante = adotante;
        this.animalAdotado = animalAdotado;
        this.data = data;
        this.termoAssinado = false;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public Animal getAnimalAdotado() {
        return animalAdotado;
    }

    public void setAnimalAdotado(Animal animalAdotado) {
        this.animalAdotado = animalAdotado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isTermoAssinado() {
        return termoAssinado;
    }

    public void setTermoAssinado(boolean termoAssinado) {
        this.termoAssinado = termoAssinado;
    }

    @Override
    public String toString() {
        return "Adocao{" +
                "id='" + id + '\'' +
                ", adotante=" + adotante.getNome() +
                ", animalAdotado=" + animalAdotado.getNome() +
                ", data=" + data +
                ", termoAssinado=" + termoAssinado +
                '}';
    }
}