package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING CONVERTE UM OBJETO DA SUBCLASSE PARA SUPERCLASSE
		//UMA BUSINESSACCOUNT É UMA ACCOUNT POR ISSO DEU CERTO.
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING CONVERTE UM OBJETO DA SUPERCLASSE PARA SUBCLASSE
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
	
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc2 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc2;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			*/
		
		Account cc1 = new Account(1000, "João", 1000.0);
		cc1.withdraw(200);
		System.out.println(cc1.getBalance());
		
		Account cc2 = new SavingsAccount(1001, "Robinho", 1000.0, 0.0 );
		cc2.withdraw(200.0);
		System.out.println(cc2.getBalance());
		
		Account cc3 = new BusinessAccount(1002, "Ronaldo", 1000.0, 0.0);
		cc3.withdraw(200);
		System.out.println(cc3.getBalance());
		
		}
		
	}


