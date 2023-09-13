package com.net.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.net.entity.Movie;
import com.net.service.IMovieMgmtService;


@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	public IMovieMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		Movie movie  = new Movie();
		movie.setMname("RRR");
		movie.setRating(4.5f);
		movie.setYear("2022");
		
		try {
			System.out.println(service.registerMovie(movie));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
