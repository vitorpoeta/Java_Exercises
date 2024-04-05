package application;
import java.util.Scanner;

import entities.BibliotecaEx3;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BibliotecaEx3 biblioteca = new BibliotecaEx3();
        System.out.println("Digite o numero de clientes e livros que será adicionado:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
        	 biblioteca.adicionarLivro();
             biblioteca.adicionarUsuario();
        }
        biblioteca.mostrarInformacoes();
    }
		
	}


