package com.akifbatur.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akifbatur.blog.entity.Category;
import com.akifbatur.blog.repository.CategoryRepository;
import com.akifbatur.blog.service.CategoryService;

/**
 * @author Akif Batur
 * 
 * Service implementation class for Service: CategoryService
 * 
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	@Transactional
	public void saveCategory(Category category) 
	{
		categoryRepository.saveCategory(category);
	}
}