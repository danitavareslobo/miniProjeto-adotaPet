import Model.Adocao;
import Model.Adotante;
import Model.Cao;
import Model.Gato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Adotante adotante = new Adotante("João Silva", "123.456.789-00", "Rua das Flores, 123", "Prefere cães pequenos");
        Cao cao = new Cao("001", "Rex", "Cão", 3, "Saudável", "Dócil", "Disponível", "Pequeno", true);
        Gato gato = new Gato("002", "Mimi", "Gato", 2, "Saudável", "Independente", "Disponível", false);

        System.out.println("=== TESTE DE VALIDAÇÃO ===");
        System.out.println("Adotante válido: " + adotante.validar());
        System.out.println("Cão válido: " + cao.validar());
        System.out.println("Gato válido: " + gato.validar());

        System.out.println("\n=== TESTE DE RELATÓRIOS ===");
        System.out.println(adotante.gerarRelatorio());
        System.out.println("\n" + cao.gerarRelatorio());
        System.out.println("\n" + gato.gerarRelatorio());
    }
}