package kr.co.himedia.map02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member){
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId+" 읎서요");
		return false;
	}
	
	public void showAllMembers() {
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Member value = hashMap.get(key);
			System.out.println(value);
		}
		System.out.println();
	}
	
}



