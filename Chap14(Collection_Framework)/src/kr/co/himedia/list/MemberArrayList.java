package kr.co.himedia.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {	//멤버 ID를 매개변수로 삭제 여부를 리턴
//		//해당 ID를 가진 맴버를 ArrayList에서 삭제
//		for(int i = 0; i<arrayList.size(); i++){	// 해당 ID를 가진 멤버를 ArrayList에서 찾음
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				//해당 멤버 삭제
//				arrayList.remove(i);
//				return true;
//			}
//		}
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId+"가 존재하지 않는다.");
		return false;
	}
	
	
	public void showAllMembers() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
