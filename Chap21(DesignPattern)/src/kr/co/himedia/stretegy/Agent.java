package kr.co.himedia.stretegy;

public class Agent implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화좀 갖다주시오.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
	}

}
