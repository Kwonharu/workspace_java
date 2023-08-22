package kr.co.himedia.set02;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet mHashSet = new MemberHashSet();
		
		Member memberS = new Member(314, "수아");
		Member memberA = new Member(501, "아린");
		Member memberM = new Member(222, "미미르");
		Member memberSe = new Member(101, "세은");
		
		mHashSet.addMember(memberS);
		mHashSet.addMember(memberA);
		mHashSet.addMember(memberM);
		mHashSet.addMember(memberSe);
		mHashSet.showAllMembers();
		
		Member memberY = new Member(101, "연화");
		mHashSet.addMember(memberY);
		mHashSet.showAllMembers();
	}
}
