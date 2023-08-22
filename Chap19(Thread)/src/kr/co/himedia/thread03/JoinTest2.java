package kr.co.himedia.thread03;

/*
 * 1부터 50, 51부터 100까지의 합을 구하는 두 개 Thread를 생성하라
 */

public class JoinTest2 extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest2(int start, int end) {
		//super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		int i;
		for(i = start; i<=end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread()+" start");
		
		JoinTest2 jt1 = new JoinTest2(1, 50);
		JoinTest2 jt2 = new JoinTest2(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();		//main 스레드는 not Runnable 상태가 됨
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int sum = jt1.total + jt2.total;
		
		System.out.println("jt1.total : "+jt1.total);
		System.out.println("jt2.total : "+jt2.total);
		System.out.println("total sum : "+sum);
		
		System.out.println(Thread.currentThread()+" end");
		
	}
	
}






