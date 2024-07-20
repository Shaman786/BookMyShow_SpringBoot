package com.learning.bookmyshow.dtos;

import com.learning.bookmyshow.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingResponseDto {
    private Booking booking;
    private ResponseStatus responseStatus;
}
