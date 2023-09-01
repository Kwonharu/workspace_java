package com.javaex.phonebook;

import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		PersonDao personDao = new PersonDao();
		int count = -1;
		
		Scanner scan = new Scanner(System.in);
		
//		List<PersonVo> personList = personDao.personSelect();		
//		for(int i=0; i<personList.size(); i++) {
//			System.out.println(personList.get(i).getPerson_id());
//			System.out.println(personList.get(i).getName());
//			System.out.println(personList.get(i).getHp());
//			System.out.println(personList.get(i).getCompany());
//		}
		
//		List<PersonVo> personSearch = personDao.personSearch("아");
//		for(int i=0; i<personSearch.size(); i++) {
//			System.out.println(personSearch.get(i).getPerson_id()+"."+"\t"
//							   +personSearch.get(i).getName()+"\t"
//							   +personSearch.get(i).getHp()+"\t"
//							   +personSearch.get(i).getCompany());
//		}
		
//		count = personDao.personInsert("김두한", "010-1918-0623", "02-1972-1121");
//		System.out.println(count + " insert");
//		count = personDao.personInsert("심재설", "010-1910-0903", "02-1971-0724");
//		System.out.println(count + " insert");
		
//		count = personDao.personDelete(6);
//		System.out.println(count + " delete");
		
		
//		count = personDao.personUpdate("심영", "010-1910-0903", "02-1971-0724", 7);
//		System.out.println(count + " update");


		System.out.println("**********************************************");
		System.out.println("*	       전화번호 관리 프로그램		     *");
		System.out.println("**********************************************");
		
		String inputNum = null;
		String inputName = null;
		String inputHp = null;
		String inputCompany = null;
		String inputPersonId = null;
		int tempNum = 0;
		
		while(true){
			System.out.println();
			System.out.println("1.리스트	2.등록	3.삭제	4.수정	5.검색	6.종료");
			System.out.println("----------------------------------------------");
			System.out.print(">메뉴번호: ");
			
			inputNum = scan.nextLine();
			
			//select *
    		if("1".equals(inputNum)) {
	    		System.out.println("<1. 리스트>");
	    		List<PersonVo> personList = personDao.personSelect();	
	 
	    		printList(personList);

	    	//insert
	    	}else if("2".equals(inputNum)) {
	    		System.out.println("<2. 등록>");
	    		System.out.print(">이름: ");
	    		inputName = scan.nextLine();
	    		System.out.print(">휴대전화: ");
			    inputHp = scan.nextLine();
			    System.out.print(">회사전화: ");
			    inputCompany = scan.nextLine();
			    
	    		count = personDao.personInsert(inputName, inputHp, inputCompany);
	    		String countString = Integer.toString(count);
	    		if("1".equals(countString) || "0".equals(countString)) {
	    			System.out.println("[등록되었습니다.]");	
	    		}else {
		    		System.out.println("[잘못된 입력입니다.]");
	    		}
	    		
	    	}else if("3".equals(inputNum)) {
	    		System.out.println("<3. 삭제>");
	    		System.out.print(">번호: ");
	    		
	    		//숫자만 받고 싶다
	    		inputPersonId = scan.nextLine();
	    		//입력받은 값이 숫자인지 확인 -> 을 어캐하누 대체 
	    	    try {
	    	    	tempNum = Integer.parseInt(inputPersonId);
	    	    	
					count = personDao.personDelete(tempNum);
					//executeUpdate()
					//- 삭제 성공 시 : 1 반환
					//- 값이 없지만 query는 작동: 0 반환
		    		if(count == 1) {
						System.out.println("[삭제되었습니다.]");
					}
		    		else {
			    		System.out.println("[해당하는 번호가 없습니다.]");
		    		}
	    	      } catch (NumberFormatException e) {
	    	    	  System.out.println("[잘못된 값입니다.]");
	    	      }

	    	}else if("4".equals(inputNum)) {
	    		System.out.println("<4. 수정>");
	    		System.out.print(">이름: ");
	    		inputName = scan.nextLine();
	    		System.out.print(">휴대전화: ");
			    inputHp = scan.nextLine();
			    System.out.print(">회사전화: ");
			    inputCompany = scan.nextLine();
			    System.out.print(">수정할 번호: ");
	    		inputPersonId = scan.nextLine();
	    		
	    		//입력받은 값이 숫자인지 확인 -> 을 어캐하누 대체 
	    	    try {
	    	    	tempNum = Integer.parseInt(inputPersonId);
	    	    	
		    		count = personDao.personUpdate(inputName, inputHp, inputCompany, tempNum);
		    		if(count == 1) {
						System.out.println("[삭제되었습니다.]");
					}
		    		else {
			    		System.out.println("[해당하는 번호가 없습니다.]");
		    		}
	    	      } catch (NumberFormatException e) {
	    	    	  System.out.println("[잘못된 값입니다.]");
	    	      }

	    	//search
	    	}else if("5".equals(inputNum)) {
	    		System.out.println("<5. 검색>");
	    		System.out.print(">이름: ");
	    		inputName = scan.nextLine();
	    		
	    		List<PersonVo> personList = personDao.personSelect(inputName);
	    		if(personList.isEmpty()) {
	    			System.out.println("[읎서요.]");
	    		}else {
	    			printList(personList);
	    		}
	    	}else if("6".equals(inputNum)) {
	    		scan.close();
	    		System.out.println("= = = = = = = = = 프로그램 종료 = = = = = = = = =");
	    		break;
	    	}else {
	    		System.out.println("[잘못된 입력입니다.]");
	    	}

		} //while(!"6".equals(inputNum))
		

		
	}
	
	private static void printList(List<PersonVo> personList) {
		for(int i=0; i<personList.size(); i++) {
			System.out.println(personList.get(i).getPerson_id()+"."+"\t"
							   +personList.get(i).getName()+"\t"
							   +personList.get(i).getHp()+"\t"
							   +personList.get(i).getCompany());
		}
	}
	
}






