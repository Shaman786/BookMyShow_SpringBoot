package com.learning.bookmyshow.services;

import com.learning.bookmyshow.models.Booking;

import java.util.List;

public interface BookingService {
    Booking createBooking(Long userId, Long showId, List<Long> showSeatsIds);
}
