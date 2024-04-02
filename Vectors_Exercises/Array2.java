import java.util.Locale;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int n = sc.nextInt();
		double vect[] = new double[n];
		String vectName[] = new String[n];
		for(int i=0;i<n;i++) {
			vectName[i] = sc.next();
			vect[i] = sc.nextDouble();
			sum+= vect[i];
		}
		double avg = sum/n;
		System.out.println("Average "+avg);
		sc.close();
	}

}
