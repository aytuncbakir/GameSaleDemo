package services;

import entities.Member;

public interface MemberService {

	public void save(Member member);
	public void update(Member member);
	public void delete(Member member);
	
}
