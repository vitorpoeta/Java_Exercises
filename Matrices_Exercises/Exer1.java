package application;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The Order of Square matrix: ");
		int n = sc.nextInt();
		int negativeCont = 0;
		int [][] mat = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("------Matrix------ ");
		 for(int[] arrayRow : mat){
	            for(int value : arrayRow){
	                System.out.printf("%5d", value);
	            }
	            System.out.println();
	        }
		
		System.out.println("\nMain Diagonal: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j] < 0) {
					negativeCont++;
				}
			}
		}
		System.out.print("\nNegative numbers (quantity): "+negativeCont);
		
		
		
		sc.close();
	}

}
