package com.roomie.db_connect_spring;

import java.util.List;

public interface MemberService {
    public List<Member> getMembers();
    public Member saveMember(MemberDto memberDto);
}
