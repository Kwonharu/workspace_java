package kr.co.himedia.cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승차하다
	public void ride(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber+"번의 버스 승객 수: "+passengerCount+
				"명, 수입: "+money+"원");
	}
}
