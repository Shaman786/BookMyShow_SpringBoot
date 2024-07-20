package com.learning.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel { // Ticket
    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> showSeats;

    private int amount;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
}
