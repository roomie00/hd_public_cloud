package com.roomie.db_connect_spring;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/members")
    public ResponseEntity<List<Member>> viewUserInfo(){
        List<Member> members = memberService.getMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @PostMapping("/members")
    public ResponseEntity<HttpStatus> makeMember(@RequestBody @Valid MemberDto memberDto){
        memberService.saveMember(memberDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
