package com.mental.blog.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mental.blog.entities.Comment;
import com.mental.blog.entities.Post;
import com.mental.blog.exceptions.ResourceNotFoundException;
import com.mental.blog.payloads.CommentDTO;
import com.mental.blog.repositories.CommentRepo;
import com.mental.blog.repositories.PostRepo;
import com.mental.blog.servicess.CommentService;
import org.modelmapper.ModelMapper;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDTO createComment(CommentDTO commentDTO, Integer postId) {
		Post post=this.postRepo.findById(postId)
				.orElseThrow(()->new ResourceNotFoundException("Post","post id",postId));
		
		Comment comment=this.modelMapper.map(commentDTO, Comment.class);
		comment.setPost(post);
		Comment savedComment=this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment, CommentDTO.class);
	}

}
