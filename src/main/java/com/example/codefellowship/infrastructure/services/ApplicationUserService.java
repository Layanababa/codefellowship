package com.example.codefellowship.infrastructure.services;

import com.example.codefellowship.domain.ApplicationUser;

import java.util.List;

public interface ApplicationUserService {
    List<ApplicationUser> findAllUsers();
}