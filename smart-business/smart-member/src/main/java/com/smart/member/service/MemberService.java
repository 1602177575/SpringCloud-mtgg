package com.smart.member.service;

public interface MemberService {
    String getVerifyCode(String phone);

    String login(String phone, String code);
}
