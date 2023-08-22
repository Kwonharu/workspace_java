package kr.co.himedia.map02;

public class MemberHashMapTest {
	public static void main(String[] args) {
		
		MemberHashMap mHashMap = new MemberHashMap();
		
		Member memberS = new Member(314, "수아");
		Member memberA = new Member(501, "아린");
		Member memberM = new Member(222, "미미르");
		Member memberSe = new Member(101, "세은");
		Member memberSe2 = new Member(101, "연화");
		//key값이 같으면 나중에 추가한 요소가 적용됨
		
		mHashMap.addMember(memberS);
		mHashMap.addMember(memberA);
		mHashMap.addMember(memberM);
		mHashMap.addMember(memberSe);
		mHashMap.addMember(memberSe2);
		
		mHashMap.removeMember(101);
		
		mHashMap.showAllMembers();
	}
}
