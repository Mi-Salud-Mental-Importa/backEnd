package com.mental.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mental.blog.entities.Post;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
}
