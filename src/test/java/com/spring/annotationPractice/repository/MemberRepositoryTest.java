package com.spring.annotationPractice.repository;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.annotationPractice.config.RootConfig;
import com.spring.annotationPractice.vo.Member;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class MemberRepositoryTest {

	@Inject
	private MemberRepository memberRepository;
	
	@Test
	public void test() {
		Member member = memberRepository.findByid("example");
		System.out.println(member);
	}

}
