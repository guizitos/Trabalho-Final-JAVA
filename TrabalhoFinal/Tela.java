
import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de gerenciamento de disciplinas do IFPI!");
        System.out.println("Por favor, escolha o seu tipo de login:");
        System.out.println("1. Coordenador");
        System.out.println("2. Professor");
        System.out.println("3. Aluno");
        // Adicione mais opções conforme necessário

        int opcao = scanner.nextInt();
        Pessoa usuario;

        switch (opcao) {
            case 1:
                usuario = autenticarCoordenador();
                break;
            case 2:
                usuario = autenticarProfessor();
                break;
            case 3:
                usuario = autenticarAluno();
                break;
            // Adicione mais casos conforme necessário
            default:
                System.out.println("Opção inválida!");
                return;
        }

        if (usuario != null) {
            System.out.println("Autenticação bem-sucedida!");
            // Navegue para a tela específica do usuário
        } else {
            System.out.println("Falha na autenticação!");
        }
    }

	private static Coordenador autenticarCoordenador() {
        // Implemente a lógica de autenticação do coordenador aqui
        return null;
    }

    private static Professor autenticarProfessor() {
        // Implemente a lógica de autenticação do professor aqui
        return null;
    }

    private static Aluno autenticarAluno() {
        // Implemente a lógica de autenticação do aluno aqui
        return null;
    }

	}

