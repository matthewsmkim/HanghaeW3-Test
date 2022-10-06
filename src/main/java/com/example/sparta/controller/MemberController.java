package com.example.sparta.controller;

import com.example.sparta.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor       // 생성자 요청 받는 것...
@RestController
public class MemberController {

    private final MemberService memberService;


    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     *
     * @param id
     */
    @GetMapping("/member/{id}")
    public Optional<Member> getMemberInfo(@PathVariable Long id) {
        return memberService.findMember(id);
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public String getMemberList() {
        List<Member> member = memberService.findAllMember();
        return memberService.findAllMember().toString();

    }

}
