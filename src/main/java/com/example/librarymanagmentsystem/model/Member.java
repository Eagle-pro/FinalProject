package com.example.librarymanagmentsystem.model;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Member extends User {
    private LocalDate membershipStartDate;

    public Member() {
        super();
    }

    public Member(String name, String email, String password, LocalDate membershipStartDate) {
        super();
        setName(name);
        setEmail(email);
        setPassword(password);
        setRole(Role.USER);
        this.membershipStartDate = membershipStartDate;
    }

    public LocalDate getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(LocalDate membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }
}