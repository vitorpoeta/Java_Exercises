package entities;


public class ClienteEx2 {
  String nome;
  String email;

  public ClienteEx2(String n, String e) {

    this.nome = n;

    this.email = e;
  }
@Override
  public String toString() {
    return "Nome: " + this.nome + "\nEmail: " + this.email;
  }
}
