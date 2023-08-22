package kr.co.himedia.cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승차하다
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"호선 승객 수: "+passengerCount+
				"명, 수입: "+money+"원");
	}
}
