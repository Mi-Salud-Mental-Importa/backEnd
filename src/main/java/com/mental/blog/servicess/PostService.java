package com.mental.blog.servicess;

import com.mental.blog.payloads.PostDTO;
import com.mental.blog.payloads.PostResponse;

public interface PostService {

	PostDTO createPost(PostDTO postDTO);
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	PostDTO getPostById(Integer postId);

	PostDTO updatePost(PostDTO postDto, Integer postId);

	void deletePost(Integer postId);

}
