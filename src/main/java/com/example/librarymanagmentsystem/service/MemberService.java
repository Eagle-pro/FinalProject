package com.example.librarymanagmentsystem.service;

import com.example.librarymanagmentsystem.model.Member;
import com.example.librarymanagmentsystem.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public com.example.librarymanagmentsystem.model.Member save(com.example.librarymanagmentsystem.model.Member member) {
        return memberRepository.save(member);
    }

    public com.example.librarymanagmentsystem.model.Member findById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }
}
