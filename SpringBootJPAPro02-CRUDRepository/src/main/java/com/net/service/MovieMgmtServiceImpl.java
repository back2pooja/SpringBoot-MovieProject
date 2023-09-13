package com.net.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.Movie;
import com.net.repo.IMovieRepo;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {
	@Autowired
	private IMovieRepo movieRepo;
	
	public String registerMovie(Movie movie) {
		
		System.out.println("InMemory Proxy class name:: "+movieRepo.getClass()+"......."+Arrays.toString(movieRepo.getClass().getInterfaces()));
		System.out.println("Before saving movie:: "+movie);
		Movie movie1= movieRepo.save(movie);
		System.out.println("After saving movie:: "+movie1);
		return "Movie is registered with the id Value:: "+movie1.getMid();
		
	}
	
	

}
