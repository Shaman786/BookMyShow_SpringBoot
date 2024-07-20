package com.learning.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String name;
    private int rowNum;
    private int colNum;

    @ManyToOne
    private SeatType seatType;
}
