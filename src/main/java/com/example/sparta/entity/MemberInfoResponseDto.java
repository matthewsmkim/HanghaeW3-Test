package com.example.sparta.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.lang.reflect.Member;

@Getter
@NoArgsConstructor
public class MemberInfoResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public MemberInfoResponseDto(Member member) {

        this.id = getId();
        this.name = getName();
        this.email = getEmail();
        this.pw = getPw();

    }
}
