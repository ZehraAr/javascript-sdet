
public class EncapsulationClass {

	public static void main(String[] args) {
		Car porsche=new Car();
		porsche.setModel("911");//if we put Cayenne instead of 911 it will give invalid
		String model=porsche.getModel();
		System.out.println(model);
		
		
		BankAccount mikeAccount=new BankAccount();
		mikeAccount.setAccountNumber("5555555");
		mikeAccount.setAccountBalance(2.5);
		mikeAccount.setName("Mike");
		
		mikeAccount.withdrawal(100.0);
		
		mikeAccount.deposit(150.000);
		mikeAccount.withdrawal(50.0);
		
		System.out.println(mikeAccount.getName());
		
		
		

	}

}
