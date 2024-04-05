package entities;

import java.util.Scanner;



import java.util.Scanner;

public class BibliotecaEx3 {
    private String[] livros;
    private String[] usuarios;
    private int numLivros;
    private int numUsuarios;
    private static final int TAMANHO_MAXIMO = 100;
    private Scanner scanner;

    public BibliotecaEx3() {
        this.livros = new String[TAMANHO_MAXIMO];
        this.usuarios = new String[TAMANHO_MAXIMO];
        this.numLivros = 0;
        this.numUsuarios = 0;
        this.scanner = new Scanner(System.in);
    }

    // Método para adicionar livros
    public void adicionarLivro() {
        System.out.println("Digite o nome do livro: ");
        String livro = scanner.nextLine();
        if (numLivros < TAMANHO_MAXIMO) {
            livros[numLivros] = livro;
            numLivros++;
            System.out.println("Livro \"" + livro + "\" adicionado à biblioteca.");
        } else {
            System.out.println("A capacidade máxima de livros foi atingida.");
        }
    }

    // Método para adicionar usuários
    public void adicionarUsuario() {
        System.out.println("Digite o nome do usuário: ");
        String usuario = scanner.nextLine();
        if (numUsuarios < TAMANHO_MAXIMO) {
            usuarios[numUsuarios] = usuario;
            numUsuarios++;
            System.out.println("Usuário \"" + usuario + "\" adicionado à biblioteca.");
        } else {
            System.out.println("A capacidade máxima de usuários foi atingida.");
        }
    }

    // Método para mostrar informações sobre a biblioteca
    public void mostrarInformacoes() {
        System.out.println("Número total de livros na biblioteca: " + numLivros);
        System.out.println("Número total de usuários na biblioteca: " + numUsuarios);
        
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < numLivros; i++) {
            System.out.println("- " + livros[i]);
        }
        
        System.out.println("Usuários na biblioteca:");
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("- " + usuarios[i]);
        }
    }
}


	

