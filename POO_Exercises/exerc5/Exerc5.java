package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Client5;

public class Exerc5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client5 client;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new Client5(number, holder, initialDeposit);
		}
		else {
			client = new Client5(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(client);
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		client.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(client);
		
		sc.close();
	}

}
