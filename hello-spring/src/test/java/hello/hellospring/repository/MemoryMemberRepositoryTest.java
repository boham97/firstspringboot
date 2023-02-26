package hello.hellospring.repository;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

class MemoryMemberRepositoryTest {
	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("Spring");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get();
		Assertions.assertThat(member).isEqualTo(result);
		
	}
}
