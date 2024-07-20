package com.learning.bookmyshow.models;

import jakarta.persistence.Embeddable;

@Embeddable
public enum PaymentMode {
    UPI, CREDIT_CARD, DEBIT_CARD, NET_BANKING
}