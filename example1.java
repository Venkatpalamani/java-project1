//----------- java class problems -----------


/*package javaproblems; // -------------------------------------------->1st prblm
interface BankAccount {
	
	void deposit(double amount);
	
	void withdraw(double amount);
	
 }

class SavingsAccount implements BankAccount {

	public void deposit() {
		System.out.println("amount deposited sucessfully in SavingsAccount");
	}
	public void withdraw() {
		System.out.println("amount deposited sucessfully in SavingsAccount");
	}
}

public class example1 {
	public void deposit() {
		System.out.println("amount deposited sucessfully in CheckingAccount");
	}
	public void withdraw() {
		System.out.println("amount deposited sucessfully in CheckingAccount");
	}
	public static void main(String[] args) {
		example1 E = new example1();
		SavingsAccount B = new SavingsAccount();
		B.deposit();
		B.withdraw();
		E.withdraw();
		E.deposit();
		
	}
}*/



/*package javaproblems; // -------------------------------------------------->3rd prblm
interface Calculator {
	
	public void  add();
	
	public void  subtract();
	
	public void  multiply();
	
	public void divide();
}
class example1 implements Calculator{

	@Override
	public void add() {
		
		System.out.println("numbers added in simplecalculator class");
	}

	@Override
	public void subtract() {
		
		System.out.println("numbers subtracted in simplecalculator class");
	}

	@Override
	public void multiply() {
		
		System.out.println("numbers multiplyed in simplecalculator class");
		
	}

	@Override
	public void divide() {
		
		System.out.println("numbers divided in simplecalculator class");
	}
	public static void main(String[] args) {
		example1 c = new example1();
		c.add();
		c.divide();
		c.multiply();
		c.subtract();
		
	}
	
	}*/


/*package javaproblems; //----------------------------------------- 2dn prblm
public interface Playable {
	
	public void play();
	
	public void pause();
	
}
class MusicPlayer implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("music played in musicplayer");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("music paused in musicplayer");
	}
	
}
public class example1 implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("music played in example");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("music paused in example");
	}
	
	public static void main(String[] args) {
		example1 s = new example1();
		MusicPlayer m = new MusicPlayer();
		s.pause();
		s.play();
		m.pause();
		m.play();
	}
	
}*/
