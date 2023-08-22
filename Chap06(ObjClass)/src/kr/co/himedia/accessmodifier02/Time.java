package kr.co.himedia.accessmodifier02;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	//getter()
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		//예외처리 코드
		if(hour < 0 || hour > 23) {
			System.out.println("여기가 군대야? 엎드려");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("여기가 군대야? 엎드려");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("여기가 군대야? 엎드려");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() +"시 "+
				this.getMinute()+"분 "+
				this.getSecond()+"초";
	}
	
}

