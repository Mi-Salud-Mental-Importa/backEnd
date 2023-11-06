package com.mental.blog.payloads;

import java.util.Date;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
@NoArgsConstructor
public class PostDTO {

	private Integer postId;
	private String title;
	private String content;
	private Date addedDate;
	private Set<CommentDTO> comments=new HashSet<>();
	
}
