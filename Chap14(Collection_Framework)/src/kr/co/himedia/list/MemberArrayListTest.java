package kr.co.himedia.list;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberS = new Member(0314, "수아");
		Member memberA = new Member(0501, "아린");
		Member memberM = new Member(0222, "미미르");
		Member memberSe = new Member(0101, "세은");
		
		memberArrayList.addMember(memberS);
		memberArrayList.addMember(memberA);
		memberArrayList.addMember(memberM);
		memberArrayList.addMember(memberSe);
		
		memberArrayList.showAllMembers();
		
		System.out.println();
		
		memberArrayList.removeMember(0101);
		memberArrayList.showAllMembers();
	}
}
