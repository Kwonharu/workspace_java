package kr.co.himedia.stream04.travel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import kr.co.himedia.stream04.model.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		Consumer consumerS = new Consumer("수아", 20, 100);
		Consumer consumerM = new Consumer("미미르", 22, 100);
		Consumer consumerA = new Consumer("아린", 18, 50);
		
		List<Consumer> consumerList = new ArrayList<Consumer>();
		consumerList.add(consumerS);
		consumerList.add(consumerM);
		consumerList.add(consumerA);
		
		//고객 명단 출력
		System.out.println("==고객 명단 순서대로 출력==");
		consumerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		
		//여향 총 비용을 계산하시오.(총 비용은 250만 원 입니다.)
		//int sum = consumerList.stream().map(p -> p.getPrice()).reduce(0, Integer::sum);
		int sum = consumerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 비용 : "+sum+"만 원");
		
		//고객 중 20세 이상인 사람의 이름을 정렬하여 출력하시오.
		consumerList.stream()
					.filter(a -> a.getAge() >= 20)
					.map(a -> a.getName())
					.sorted()
					.forEach(n -> System.out.println(n));
		
	}
}







