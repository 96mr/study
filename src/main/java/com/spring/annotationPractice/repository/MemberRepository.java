package com.spring.annotationPractice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.annotationPractice.vo.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
	public Member findByid(String id);
	public List<Member> findAll();
}
