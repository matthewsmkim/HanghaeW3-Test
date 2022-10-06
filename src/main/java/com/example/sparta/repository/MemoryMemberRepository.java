package com.example.sparta.repository;

import com.example.sparta.entity.MemberInfoResponseDto;

import java.lang.reflect.Member;
import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public MemberInfoResponseDto save(MemberInfoResponseDto member) {
        store.put(member.getId(), (Member) member);
        return member;
    }


    @Override
    public Optional<Member> findById(long memberId) {
        return Optional.ofNullable(store.get(memberId));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAllMember() {
        return new ArrayList<>(store.values());
    }
}
