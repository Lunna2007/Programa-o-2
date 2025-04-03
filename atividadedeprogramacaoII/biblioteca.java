package atividadedeprogramacaoII;

import java.util.ArrayList;
import java.util.Scanner;

public class biblioteca {
    private ArrayList<livro> livros = new ArrayList<>();
    public void adicionarLivro(livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void consultarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (livro livro : livros) {
                livro.exibirDetalhes();
            }
        }
    }

    public void apagarLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        biblioteca biblioteca = new biblioteca();
        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1- Adicionar livro");
            System.out.println("2- Consultar livros");
            System.out.println("3- Apagar livro");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.adicionarLivro(new livro(titulo, autor, ano));
                    break;

                case 2:
                    biblioteca.consultarLivros();
                    break;

                case 3:
                    System.out.print("Digite o título do livro a apagar: ");
                    String tituloApagar = scanner.nextLine();
                    biblioteca.apagarLivro(tituloApagar);
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}