package com.learning.bookmyshow.services;

import com.learning.bookmyshow.models.Show;
import com.learning.bookmyshow.models.ShowSeat;
import com.learning.bookmyshow.models.ShowSeatType;
import com.learning.bookmyshow.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculationService {
    private final ShowSeatTypeRepository showSeatRepository;

    public PriceCalculationService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatRepository = showSeatTypeRepository;
    }

    public int calculateAmount(List<ShowSeat> showSeats) {
        Show show = showSeats.get(0).getShow();

        List<ShowSeatType> showSeatTypes = showSeatRepository.findAllByShow(show);

        int amount = 0;
        for (ShowSeat showSeat : showSeats) {
            for (ShowSeatType showSeatType : showSeatTypes) {
                if (showSeat.getSeat().getSeatType().equals((showSeatType.getSeatType()))) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }
        return amount;
    }
}
