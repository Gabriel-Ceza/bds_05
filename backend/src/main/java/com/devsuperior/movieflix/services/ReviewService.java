package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.repositories.UserRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository repositoty;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MovieRepository movieRepository;
	
	
	public ReviewDTO postReview(ReviewDTO dto) {	
		Review entity = new Review();
		User user = userRepository.getOne(dto.getUserId());
		Movie movie = movieRepository.getOne(dto.getMovideId());		
		
		entity.setText(dto.getText());
		entity.setUser(user);
		entity.setMovie(movie);
		entity =repositoty.save(entity);
		return new ReviewDTO(entity);
	}
}
