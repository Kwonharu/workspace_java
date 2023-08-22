package kr.co.himedia.stretegy;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 직원에게 배정합니다.");
		
	}

}
