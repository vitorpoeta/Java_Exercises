import java.util.Locale;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double sum = 0;
		double[] vect = new double[n];
		for(int i=0;i<n;i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.println("total: "+sum);
		double avg = sum/n;
		
		System.out.printf("media avg: %.2f\n"+avg);
		
		sc.close();
	}

}
