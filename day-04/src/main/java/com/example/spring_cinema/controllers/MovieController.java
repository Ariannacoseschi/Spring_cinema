package com.example.spring_cinema.controllers;


import com.example.spring_cinema.models.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/Movies")
public class MovieController {



    @PostMapping
    public ResponseEntity Movie() {
        Reply reply = getMovie().toString();
        return new ResponseEntity(reply, HttpStatus.CREATED);
    }


    @GetMapping(value = "/{Movie}")
    public ResponseEntity<Reply> getMovie(@PathVariable long Movie ){

        Reply reply;

        if(getMovie(long Movie){
            reply = new Reply("Let the Movies Begin");
        }
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<Reply> handleGuess(@RequestBody , @PathVariable long Movie) {
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }








}
