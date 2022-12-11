package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String text;
	private Long movideId;
	private Long userId;
	
	public ReviewDTO() {		
	}

	public ReviewDTO(Long id, String text, Long movideId, Long userId) {		
		this.id = id;
		this.text = text;
		this.movideId = movideId;
		this.userId = userId;
	}
	
	public ReviewDTO(Review entity) {
		id = entity.getId();
		text = entity.getText();
		movideId = entity.getMovie().getId();
		userId = entity.getUser().getId();		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovideId() {
		return movideId;
	}

	public void setMovideId(Long movideId) {
		this.movideId = movideId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
