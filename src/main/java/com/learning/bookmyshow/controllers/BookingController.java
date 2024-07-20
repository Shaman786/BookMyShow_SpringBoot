package com.learning.bookmyshow.controllers;

import com.learning.bookmyshow.dtos.CreateBookingRequestDto;
import com.learning.bookmyshow.dtos.CreateBookingResponseDto;
import com.learning.bookmyshow.dtos.ResponseStatus;
import com.learning.bookmyshow.models.Booking;
import com.learning.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingResponseDto createBooking(CreateBookingRequestDto requestDto) {
        CreateBookingResponseDto responseDto = new CreateBookingResponseDto();

        try {
            Booking booking = bookingService.createBooking(
                    requestDto.getUserId(),
                    requestDto.getShowId(),
                    requestDto.getShowSeatIds()
            );
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setBooking(booking);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
