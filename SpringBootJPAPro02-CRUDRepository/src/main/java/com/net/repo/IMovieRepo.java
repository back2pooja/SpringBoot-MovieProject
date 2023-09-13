package com.net.repo;

import org.springframework.data.repository.CrudRepository;

import com.net.entity.Movie;

public interface IMovieRepo extends CrudRepository<Movie,Integer>{
	

}
