package com.mental.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mental.blog.entities.Comment;


public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
