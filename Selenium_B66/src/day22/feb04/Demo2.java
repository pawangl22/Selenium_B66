package day22.feb04;

import java.util.Scanner;

/*Encapsulation
 * 
 * 
 */

class Account {
	int balance = 1000;

	public void printBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the pin");
		int pin = sc.nextInt();
		sc.close();

		if (pin == 123) {
			System.out.println("You A/C balance is:" + balance);
		} else {
			System.out.println("Invalid Pin");
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {

		Account a1 = new Account();
		a1.printBalance();

	}

}
