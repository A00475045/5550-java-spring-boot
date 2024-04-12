package com.example.hotelapp.controller;

import com.example.hotelapp.model.Booking;
import com.example.hotelapp.model.Hotel;
import com.example.hotelapp.model.User;
import com.example.hotelapp.repository.BookingRepository;
import com.example.hotelapp.repository.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")

public class BookingsController {

    BookingRepository bookingRepository;

    public BookingsController(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @GetMapping("/bookhotel")
    public String sayHello() {
        return "Hello World";
    }

    @PostMapping("/add-bookings")
    public List<Booking> createUsers(@Valid @RequestBody List<Booking> bookings) {
        return bookingRepository.saveAll(bookings);
    }

}
