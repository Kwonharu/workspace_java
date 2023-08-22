package kr.co.himedia.thread04;


class Bank{
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	//예금하다
	public void deposit(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	
	//인출하다
	public void withdraw(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
		
	}
	
}

class Sua extends Thread{
	@Override
	public void run() {
		System.out.println("입금 시작");
		SynchronizationTest.myBank.deposit(3000);
		System.out.println("3000원 입금 : "+SynchronizationTest.myBank.getMoney());
	}
}

class Arin extends Thread{
	@Override
	public void run() {
		System.out.println("출금 시작");
		SynchronizationTest.myBank.withdraw(1000);
		System.out.println("1000원 출금 : "+SynchronizationTest.myBank.getMoney());
	}
}

public class SynchronizationTest {
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		Sua threadSua = new Sua();
		threadSua.start();
		
		Arin threadArin = new Arin();
		threadArin.start();
	}
}





