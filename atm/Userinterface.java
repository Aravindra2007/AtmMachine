package atm;

import java.util.Scanner;

public class Userinterface {
	
	private static int status;
	public static void main(String[] args) {
		Atmoperationimpliment implement = new Atmoperationimpliment();
		Scanner in = new Scanner(System.in);
		int atmnum = 123456;
		int atmpin = 123;
		System.out.println(" WELCOME TO ATM MACHINE ");
		System.out.println(" ENTER THE ATM NUMBER : ");
		int atmnum2 = in.nextInt();
		System.out.println(" ENTER THE ATM PIN : ");
		int atmpin2 = in.nextInt();
		if(atmnum==atmnum2&&atmpin==atmpin2) {
			while(true) {
			System.out.println(" 1.viewbalance \n 2.withdraw amount \n 3.deposit amount \n 4.ministatement \n 5.Exit ");
			System.out.println(" enter the option U want : ");
			int option = in.nextInt();
			if(option==1) {
				implement.viewbalance();
			}else if(option==2) {
				System.out.println(" Enter the amount to withdraw ");
				double withdrawamount = in.nextDouble();
				implement.withdrawamount(withdrawamount);
			}else if (option==3) {
				System.out.println(" enter the amount to Deposit ");
				double depositamount = in.nextDouble();
				implement.depositamount(depositamount);
			}else if(option==4) {
				implement.ministatement();
			}else if(option==5) {
				System.out.println(" Take your Card  \n Thanking You  ");
				System.exit(status);
			}
			}
		}else {
			System.out.println(" ATM NUMBER OR ATM PIN IS INCORRECTED ");
			System.out.println(" PLZ TRY AGAIN 😊");
		}
		
	}

}
