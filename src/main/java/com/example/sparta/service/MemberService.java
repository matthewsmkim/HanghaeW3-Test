package com.example.sparta.service;

import com.example.sparta.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Optional<Member> findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    public List<Member> findAllMember() {
        return memberRepository.findAllMember();
    }





}
