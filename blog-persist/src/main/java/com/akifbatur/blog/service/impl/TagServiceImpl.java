package com.akifbatur.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akifbatur.blog.entity.Tag;
import com.akifbatur.blog.repository.TagRepository;
import com.akifbatur.blog.service.TagService;

/**
 * @author Akif Batur
 * 
 * Service implementation class for Service: TagService
 * 
 */
@Service("tagService")
public class TagServiceImpl implements TagService 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);

	@Autowired
	private TagRepository tagRepository;
	
	@Override
	@Transactional
	public void saveTag(Tag tag) 
	{
		tagRepository.saveTag(tag);
	}
}