package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Review;

public interface RoleRepository extends JpaRepository<Review, Long> {

}
