package com.androcpp.ecommerce.model;

import java.time.LocalDateTime;

public class Payment {

    private int paymentId;
    private int userId;
    private float moneyPaid;
    private LocalDateTime paymentDate;

    public Payment(int paymentId, int userId, float moneyPaid, LocalDateTime paymentDate) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.moneyPaid = moneyPaid;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(float moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
