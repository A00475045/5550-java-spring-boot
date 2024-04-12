package com.example.hotelapp.controller;

import com.example.hotelapp.model.Hotel;
import com.example.hotelapp.repository.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class HotelsController {

    @Autowired
    HotelsRepository hotelRepository;

    @GetMapping("/all-hotels")
    public List<Hotel> getAllHotels() {
        System.out.println("--> " + hotelRepository.findAll());
        return hotelRepository.findAll();
    }

    @PostMapping("/add-hotel")
    public Hotel createHotel(@Valid @RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
