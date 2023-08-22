package kr.co.himedia.membership;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerA = new Customer(201705, "아린");
		Customer customerM = new Customer(201702, "미미르");
		Customer customerS = new GoldCustomer(201703, "수아");
		Customer customerY = new GoldCustomer(201909, "유화");
		Customer customerYe = new VIPCustomer(201909, "연화", 777);
		
		customerList.add(customerA);
		customerList.add(customerM);
		customerList.add(customerS);
		customerList.add(customerY);
		customerList.add(customerYe);
		
		System.out.println("=====고객 정보 출력=====");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		int price = 10000;
		System.out.println("=====할인율 계산 출력=====");
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 지불하신 금액은 "+cost+"원 입니다.");
		}
		
		System.out.println("=====적립 포인트=====");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName()+"님의 포인트: "+customer.bonusPoint);
		}
	}
}




