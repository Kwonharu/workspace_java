package kr.co.himedia.membership;

public class CostomerTest {
	public static void main(String[] args) {
		Customer customerM = new Customer();
		customerM.setCustomerName("미미르");
		customerM.setCustomerId(20170222);
		customerM.bonusPoint = 1000;
		System.out.println(customerM.showInfo());
		
		System.out.println();
		
		Customer customerA = new Customer(20170501, "아린");
		customerA.bonusPoint = 10000;
		System.out.println(customerA.showInfo());
		
		System.out.println();
		
		VIPCustomer customerS = new VIPCustomer();
		customerS.setCustomerName("수아");
		customerS.setCustomerId(20170314);
		customerS.bonusPoint = 100000;
		System.out.println(customerS.showInfo());
		
		VIPCustomer customerSe = new VIPCustomer(20170000, "세은");
		customerSe.bonusPoint = 60000;
		System.out.println(customerSe.showInfo());
		
		System.out.println();
		
		Customer customerY = new VIPCustomer(20190925, "유화");
		customerY.bonusPoint = 20000;
		System.out.println(customerY.showInfo());
		
		System.out.println();
		
		Customer customerYe = new VIPCustomer(20190925, "연화");
		customerYe.bonusPoint = 999999999;	 //int 최대: 2147483647
		int price = customerYe.calcPrice(10000);
		System.out.println(customerYe.showInfo() + ". 지불 금액: " + price + "원");
	}
}





