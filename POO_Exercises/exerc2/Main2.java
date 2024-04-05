package application;
import entities.ClienteEx2;
import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Primeiro cliente: ");
    System.out.println("Nome: ");
    String n = sc.nextLine();
    System.out.println("Email: ");
    String e = sc.nextLine();
    ClienteEx2 c1 = new ClienteEx2(n, e);

    System.out.println("Segundo cliente: ");
    System.out.println("Nome: ");
    n = sc.nextLine();
    System.out.println("Email: ");
    e = sc.nextLine();
    ClienteEx2 c2 = new ClienteEx2(n, e);

    // mostrar o cadastro na tela
    System.out.println("== Cadastro ==");

    System.out.println("1-\n"+c1);
    System.out.println("2-\n"+c2);

  }
}