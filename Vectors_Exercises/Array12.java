import java.util.Locale;
import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos irá digitar: ");
		int n = sc.nextInt();
		String [] nome = new String[n];
		double [] nota1 = new double[n];
		double [] nota2 = new double[n];
		double media;
		for(int i=0;i<n;i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"° aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();

		}
		System.out.println("Alunos aprovados: ");
		for(int i=0;i<n;i++) {
			media = (nota1[i]+nota2[i])/2;
			
			if(media>=6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}

}
