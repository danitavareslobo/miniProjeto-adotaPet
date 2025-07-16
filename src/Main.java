import Model.Adocao;
import Model.Adotante;
import Model.Cao;
import Model.Gato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Adotante adotante = new Adotante("João Silva", "123.456.789-00", "Rua das Flores, 123", "Prefere cães pequenos");
        Cao cao = new Cao("001", "Rex", "Cão", 3, "Saudável", "Dócil", "Disponível", "Pequeno", true);
        Adocao adocao = new Adocao("A001", adotante, cao, new Date());

        System.out.println(adotante);
        System.out.println(adocao);
    }
}