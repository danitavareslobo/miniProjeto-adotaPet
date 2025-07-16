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
            scanner.nextLine();

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
            scanner.nextLine();
        }

        return true;
    }

    private static void menuGestaoAdotantes() {
        boolean voltarMenu = false;

        while (!voltarMenu) {
            System.out.println("\n========== GESTÃO DE ADOTANTES ==========");
            System.out.println("[1] Adicionar Perfil Adotante");
            System.out.println("[2] Edição de Perfil Adotante");
            System.out.println("[3] Desabilitar/Habilitar Adotante");
            System.out.println("[4] Listar Todos Adotantes");
            System.out.println("[5] Voltar ao Menu Principal");
            System.out.println("=========================================");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarAdotante();
                        break;
                    case 2:
                        editarAdotante();
                        break;
                    case 3:
                        habilitarDesabilitarAdotante();
                        break;
                    case 4:
                        listarAdotantes();
                        break;
                    case 5:
                        voltarMenu = true;
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine();
            }
        }
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

    private static void adicionarAdotante() {
        System.out.println("\n=== ADICIONAR NOVO ADOTANTE ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        // Verificar se CPF já existe
        for (Adotante adotante : adotantes) {
            if (adotante.getCpf().equals(cpf)) {
                System.out.println("ERRO: CPF já cadastrado!");
                return;
            }
        }

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Preferências: ");
        String preferencias = scanner.nextLine();

        Adotante novoAdotante = new Adotante(nome, cpf, endereco, preferencias);
        adotantes.add(novoAdotante);

        System.out.println("✓ Adotante cadastrado com sucesso!");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void editarAdotante() {
        System.out.println("\n=== EDITAR PERFIL ADOTANTE ===");

        if (adotantes.isEmpty()) {
            System.out.println("Nenhum adotante cadastrado!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        System.out.print("Digite o CPF do adotante a ser editado: ");
        String cpf = scanner.nextLine();

        Adotante adotanteEncontrado = null;
        for (Adotante adotante : adotantes) {
            if (adotante.getCpf().equals(cpf)) {
                adotanteEncontrado = adotante;
                break;
            }
        }

        if (adotanteEncontrado == null) {
            System.out.println("Adotante não encontrado!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        System.out.println("Adotante encontrado: " + adotanteEncontrado.getNome());
        System.out.println("Deixe em branco para manter o valor atual.");

        System.out.print("Novo nome [" + adotanteEncontrado.getNome() + "]: ");
        String novoNome = scanner.nextLine();
        if (!novoNome.trim().isEmpty()) {
            adotanteEncontrado.setNome(novoNome);
        }

        System.out.print("Novo endereço [" + adotanteEncontrado.getEndereco() + "]: ");
        String novoEndereco = scanner.nextLine();
        if (!novoEndereco.trim().isEmpty()) {
            adotanteEncontrado.setEndereco(novoEndereco);
        }

        System.out.print("Novas preferências [" + adotanteEncontrado.getPreferencias() + "]: ");
        String novasPreferencias = scanner.nextLine();
        if (!novasPreferencias.trim().isEmpty()) {
            adotanteEncontrado.setPreferencias(novasPreferencias);
        }

        System.out.println("✓ Dados atualizados com sucesso!");
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void habilitarDesabilitarAdotante() {
        System.out.println("\n=== HABILITAR/DESABILITAR ADOTANTE ===");

        if (adotantes.isEmpty()) {
            System.out.println("Nenhum adotante cadastrado!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }
2
        System.out.print("Digite o CPF do adotante: ");
        String cpf = scanner.nextLine();

        Adotante adotanteEncontrado = null;
        for (Adotante adotante : adotantes) {
            if (adotante.getCpf().equals(cpf)) {
                adotanteEncontrado = adotante;
                break;
            }
        }

        if (adotanteEncontrado == null) {
            System.out.println("Adotante não encontrado!");
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            return;
        }

        String statusAtual = adotanteEncontrado.isAtivo() ? "ATIVO" : "INATIVO";
        System.out.println("Adotante: " + adotanteEncontrado.getNome() + " - Status atual: " + statusAtual);

        adotanteEncontrado.setAtivo(!adotanteEncontrado.isAtivo());
        String novoStatus = adotanteEncontrado.isAtivo() ? "ATIVO" : "INATIVO";

        System.out.println("✓ Status alterado para: " + novoStatus);
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    private static void listarAdotantes() {
        System.out.println("\n=== LISTA DE TODOS OS ADOTANTES ===");

        if (adotantes.isEmpty()) {
            System.out.println("Nenhum adotante cadastrado!");
        } else {
            for (int i = 0; i < adotantes.size(); i++) {
                System.out.println("\n--- Adotante " + (i + 1) + " ---");
                System.out.println(adotantes.get(i).gerarRelatorio());
            }
        }

        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}