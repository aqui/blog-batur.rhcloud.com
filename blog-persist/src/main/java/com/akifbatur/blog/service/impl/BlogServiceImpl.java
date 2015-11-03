package com.akifbatur.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akifbatur.blog.entity.Blog;
import com.akifbatur.blog.repository.BlogRepository;
import com.akifbatur.blog.service.BlogService;

/**
 * @author Akif Batur
 * 
 * Service implementation class for Service: BlogService
 * 
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

	@Autowired
	private BlogRepository blogRepository;
	
	@Override
	@Transactional
	public void saveBlog(Blog blog) 
	{
		blogRepository.saveBlog(blog);
	}
}