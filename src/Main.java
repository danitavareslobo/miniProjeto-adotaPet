import Model.*;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Adotante> adotantes = new ArrayList<>();
    private static List<Animal> animais = new ArrayList<>();
    private static List<Adocao> adocoes = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTÃO DE ADOÇÕES - ONG PROTEÇÃO ANIMAL ===");

        boolean continuar = true;
        while (continuar) {
            continuar = exibirMenuPrincipal();
        }

        System.out.println("Sistema encerrado. Obrigado!");
        scanner.close();
    }

    private static boolean exibirMenuPrincipal() {
        System.out.println("\n========== MENU PRINCIPAL ==========");
        System.out.println("[1] Gestão de Adotantes");
        System.out.println("[2] Gestão de Animais");
        System.out.println("[3] Gestão de Adoções");
        System.out.println("[4] Sair");
        System.out.println("====================================");
        System.out.print("Escolha uma opção: ");

        try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    menuGestaoAdotantes();
                    break;
                case 2:
                    menuGestaoAnimais();
                    break;
                case 3:
                    menuGestaoAdocoes();
                    break;
                case 4:
                    return false;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
            scanner.nextLine(); // Limpar o buffer
        }

        return true;
    }

    private static void menuGestaoAdotantes() {
        System.out.println("\n=== GESTÃO DE ADOTANTES ===");
        System.out.println("Funcionalidade será implementada no próximo exercício.");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void menuGestaoAnimais() {
        System.out.println("\n=== GESTÃO DE ANIMAIS ===");
        System.out.println("Funcionalidade será implementada no exercício 6.");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void menuGestaoAdocoes() {
        System.out.println("\n=== GESTÃO DE ADOÇÕES ===");
        System.out.println("Funcionalidade será implementada no exercício 7.");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }
}