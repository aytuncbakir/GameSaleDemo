package services;

import entities.Member;

public class MemberServiceImpl implements MemberService{

	
	private MemberCheckService memberCheckService;
	
	public MemberServiceImpl(MemberCheckService memberCheckService) {
		this.memberCheckService = memberCheckService;
	}
	

	@Override
	public void save(Member member) {
		if(memberCheckService.checkIfRealPerson(member)) {
			System.out.println(member.getFirstName()+" is saved as a member ");
		}else {
			System.out.println(member.getFirstName()+" is not saved ");
		}
		
	}

	@Override
	public void update(Member member) {
		String name = member.getFirstName();
		member.setFirstName("Mahoni");
		System.out.println(name + " is updated as " +member.getFirstName());
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirstName()+" is deleted ");
		
	}

	
}
