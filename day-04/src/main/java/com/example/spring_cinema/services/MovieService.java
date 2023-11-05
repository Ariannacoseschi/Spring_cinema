package com.example.spring_cinema.services;

import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String getNewMovie(){
        return movieRepository.getNewMovie();

    }


}
