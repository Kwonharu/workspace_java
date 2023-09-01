package com.javaex.phonebook;

import java.util.List;
import java.util.Scanner;

public class Main {
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
		int inputPersonId = 0;
		
		while(!"6".equals(inputCompany)){
			System.out.println();
			System.out.println("1.리스트	2.등록	3.삭제	4.수정	5.검색	6.종료");
			System.out.println("----------------------------------------------");
			System.out.print(">메뉴번호: ");
			
			inputNum = scan.nextLine();
			
    		if("1".equals(inputNum)) {
	    		System.out.println("<1. 리스트>");
	    		List<PersonVo> personList = personDao.personSelect();	
	 
	    		for(int i=0; i<personList.size(); i++) {
	    			System.out.println(personList.get(i).getPerson_id()+"."+"\t"
	    							   +personList.get(i).getName()+"\t"
	    							   +personList.get(i).getHp()+"\t"
	    							   +personList.get(i).getCompany());
	    		}

	    	}else if("2".equals(inputNum)) {
	    		System.out.println("<2. 등록>");
	    		System.out.print(">이름: ");
	    		inputName = scan.nextLine();
	    		System.out.print(">휴대전화: ");
			    inputHp = scan.nextLine();
			    System.out.print(">회사전화: ");
			    inputCompany = scan.nextLine();
			    
	    		count = personDao.personInsert(inputName, inputHp, inputCompany);
	    		if(count != -1) {
	    			System.out.println("[등록되었습니다.]");	
	    		}
	    	}else if("3".equals(inputNum)) {
	    		System.out.println("<3. 삭제>");
	    		System.out.print(">번호: ");
	    		inputPersonId = scan.nextInt();
				scan.nextLine();
				
				count = personDao.personDelete(inputPersonId);
				if(count != -1) {
					System.out.println("[삭제되었습니다.]");
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
			    inputPersonId = scan.nextInt();
				scan.nextLine();
				
	    		count = personDao.personUpdate(inputName, inputHp, inputCompany, inputPersonId);
	    		if(count != -1) {
					System.out.println("[수정되었습니다.]");
				}
				
	    	}else if("5".equals(inputNum)) {
	    		System.out.println("<5. 검색>");
	    		System.out.print(">이름: ");
	    		inputName = scan.nextLine();
	    		
	    		List<PersonVo> personSearch = personDao.personSearch(inputName);
	    		if(personSearch.isEmpty()) {
	    			System.out.println("[읎서요.]");
	    		}else {
		    		for(int i=0; i<personSearch.size(); i++) {
		    			System.out.println(personSearch.get(i).getPerson_id()+"."+"\t"
		    							   +personSearch.get(i).getName()+"\t"
		    							   +personSearch.get(i).getHp()+"\t"
		    							   +personSearch.get(i).getCompany());
		    		}
	    		}
	    	}else {
	    		System.out.println("[잘못된 입력입니다.]");
	    	}

		} //while(!"6".equals(inputNum))
		
		scan.close();
		System.out.println("= = = = = = = = = 프로그램 종료 = = = = = = = = =");
		
	}
	
}






