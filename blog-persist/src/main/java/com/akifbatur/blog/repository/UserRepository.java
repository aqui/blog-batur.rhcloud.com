package com.akifbatur.blog.repository;

import com.akifbatur.blog.entity.User;

/**
 * @author Akif Batur
 * 
 * Repository interface for Repository: UserRepositoryImpl
 * 
 */
public interface UserRepository
{
    public void saveUser(User user);
}
