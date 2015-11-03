package com.akifbatur.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akifbatur.blog.entity.Role;
import com.akifbatur.blog.repository.RoleRepository;
import com.akifbatur.blog.service.RoleService;

/**
 * @author Akif Batur
 * 
 * Service implementation class for Service: RoleService
 * 
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	@Transactional
	public void saveRole(Role role) 
	{
		roleRepository.saveRole(role);
	}
}