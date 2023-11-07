package com.example.mall;

import java.util.Random;

public class PaymentProcessor {
    public boolean processPayment(Customer customer, double totalAmount) {
        // Simulate payment processing
        Random random = new Random();
        boolean paymentSuccessful = random.nextBoolean();
        String error = "Error: Try again";

        if (paymentSuccessful) {
            return true;
        } else {
            return false;
        }

    }
}

class Purchase {

    private double totalAmount;

    public Purchase(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    public double getTotalAmount() {
        return totalAmount;
    }
}

class Customer {
    // Customer-related information can be added here
    // For example, customer account information
    private String email;

    public Customer(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

