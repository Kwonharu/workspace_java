package kr.co.himedia.stretegy;

/*
 * 고객 센터에 전화 상담원들
 * 전화가 대기열에 저장
 * 
 * 상담원 지정 전 대기 상태
 * 배분 정책 3가지
 * 
 *  - 상담원 순서대로 배분 (RoundRobin)
 *  - 대기가 짧은 상담원 먼저 배분하기 (LeastJob)
 *  - 우선순위가 높은(숙련도가 높은) 상담원에게 먼저 배분 (PriorityAllocation)
 *  
 *  interface 정의 후 정책 구현
 */

public interface Scheduler {
	
	void getNextCall();
	void sendCallToAgent();
	
}
