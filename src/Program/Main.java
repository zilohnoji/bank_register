package Program;

import java.util.Scanner;
import java.util.Locale;
import Entities.Register;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char choiceDeposit;
		String nameAcc;
		int codeAcc;
		double depositAcc = 0;
		double withdraw;

		System.out.print("Enter code of account: ");
		codeAcc = sc.nextInt();
		sc.nextLine();

		System.out.print("Name of account: ");
		nameAcc = sc.nextLine();

		System.out.print("You want a deposit inital?(y/n) ");
		choiceDeposit = sc.next().charAt(0);

		Register instance = new Register(codeAcc, depositAcc);

		if (choiceDeposit == 'y') {
			System.out.print("Digit initial deposit value: ");
			depositAcc = sc.nextDouble();
			instance.setDepositInitial(depositAcc);
		}

		instance.setName(nameAcc);

		System.out.printf("\nUpdate data:\nAccount %d, Holder: %s, Balance $ %.2f", instance.getCode(), instance.getName(),
				instance.getBalance());

		System.out.print("\nEnter deposit value: ");
		depositAcc = sc.nextDouble();
		instance.setDepositBefore(depositAcc);

		System.out.printf("\nUpdate data:\nAccount %d, Holder: %s, Balance $ %.2f", instance.getCode(), instance.getName(),
				instance.getBalance());

		System.out.print("\nEnter withdraw value: ");
		withdraw = sc.nextDouble();
		instance.setBalance(withdraw);

		System.out.printf("\nUpdate data:\nAccount %d, Holder: %s, Balance $ %.2f", instance.getCode(), instance.getName(),
				instance.getBalance());
		
		sc.close();
	}
}
