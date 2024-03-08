package com.example.hotelapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "hotel")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Hotel {
    @Id
//    @Column(name = "hotelID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelID;

//    @Column(name = "hotel-name")
    @NotBlank
    private String hotelName;

//    @Column(name = "hotel-location")
    @NotBlank
    private String hotelLocation;


//    @Column(name = "reviews-in-stars")
    private Integer reviewsInStars;

//    @Column(name = "total_rooms")
    private int totalRooms;

//    @Column(name = "total_rooms")
    private int availableRooms;


    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    public Long getHotelId() {
        return hotelID;
    }

    public void setHotelId(Long hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public Integer getReviewsInStars() {
        return reviewsInStars;
    }

    public void setReviewsInStars(Integer reviewsInStars) {
        this.reviewsInStars = reviewsInStars;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
