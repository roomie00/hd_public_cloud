package com.roomie.db_connect_spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
    @Transactional
    @Override
    public Member saveMember(MemberDto memberDto) {
        Member member = Member.builder()
                .id(memberDto.getId())
                .name(memberDto.getName())
                .build();

        memberRepository.save(member);

        return member;
    }
}
