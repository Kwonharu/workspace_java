package kr.co.himedia.set03;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet mTreeSet = new MemberTreeSet();
		
		Member memberS = new Member(314, "수아");
		Member memberA = new Member(501, "아린");
		Member memberM = new Member(222, "미미르");
		Member memberSe = new Member(101, "세은");
		Member memberSe2 = new Member(101, "세은");
		
		mTreeSet.addMember(memberS);
		mTreeSet.addMember(memberA);
		mTreeSet.addMember(memberM);
		mTreeSet.addMember(memberSe);
		mTreeSet.showAllMembers();
		
	}
}
