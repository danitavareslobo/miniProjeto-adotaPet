import Model.Cao;
import Model.Gato;

public class Main {
    public static void main(String[] args) {
        Cao cao = new Cao("001", "Rex", "Cão", 3, "Saudável", "Dócil", "Disponível", "Grande", true);
        Gato gato = new Gato("002", "Mimi", "Gato", 2, "Saudável", "Independente", "Disponível", false);

        System.out.println(cao);
        System.out.println(gato);
    }
}