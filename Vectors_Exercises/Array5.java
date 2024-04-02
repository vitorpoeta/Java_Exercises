import java.util.Locale;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas deseja digitar: ");
		int n = sc.nextInt();
		String []nomeVect = new String[n];
		int [] idadeVect = new int[n];
		double [] alturaVect = new double[n];
		double mediaAltura =0;
		double cont16=0;
		double menosDe16=0;
		for(int i=0;i<n;i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.printf("Nome: ");
			sc.nextLine();
			nomeVect[i] = sc.nextLine();
			System.out.printf("Idade: ");
			idadeVect[i] = sc.nextInt();
			System.out.printf("Altura: ");
			alturaVect[i] = sc.nextDouble();
			mediaAltura+= alturaVect[i];
			if(idadeVect[i]<16) {
				cont16++;
			}
		}
		menosDe16 =  (cont16*100/n);
		mediaAltura = mediaAltura/n;
		System.out.printf("%nAltura média: %.2f", mediaAltura);
		System.out.printf("%nPessoas com menos de 16 anos: %.1f%%n", menosDe16);
		for(int i=0;i<n;i++) {
			if(idadeVect[i]<16) {
				System.out.println(nomeVect[i]);
			}
		}
		sc.close();
	}

}
