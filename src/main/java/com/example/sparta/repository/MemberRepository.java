package com.example.sparta.repository;

import com.example.sparta.entity.MemberInfoResponseDto;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    MemberInfoResponseDto save(MemberInfoResponseDto member);

    Optional<Member> findById(long memberId);
    Optional<Member> findByName(String name);
    List<Member> findAllMember();
}
