package com.example.hotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hotel_name", length = 50)
    private String hotelName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "roomTypes")
    private Integer roomTypes;

    @Column(name = "price")
    private Integer price;

    @Column(name = "total_rooms", nullable = false, columnDefinition = "int default 0")
    private Integer totalRooms;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(Integer roomTypes) {
        this.roomTypes = roomTypes;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Integer totalRooms) {
        this.totalRooms = totalRooms;
    }
}
