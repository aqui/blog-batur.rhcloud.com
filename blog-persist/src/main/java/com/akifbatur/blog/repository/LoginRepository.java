package com.akifbatur.blog.repository;

import com.akifbatur.blog.entity.User;

/**
 * @author Akif Batur
 * 
 * Repository interface for Repository: RoleRepositoryImpl
 * 
 */
public interface LoginRepository
{
    public User getUserByUsername(String username);
}