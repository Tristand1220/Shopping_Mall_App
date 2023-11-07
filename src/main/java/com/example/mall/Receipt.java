package com.example.mall;

public class Receipt {
    public void Isprocessed(String customerEmail, Purchase purchase) {
        // Gather information required for the receipt
        String receiptContent = receipt(purchase);

        // Send the receipt to the customer's email address
        delivered(customerEmail, "Receipt for Your Purchase", receiptContent);
    }

    private String receipt(Purchase purchase) {
        // Generate the content of the receipt based on the purchase
        // You can format it as needed, including purchase details, costs, etc.
        String receiptContent = "Receipt for Your Purchase:\n";
        receiptContent += "Total Amount: $" + purchase.getTotalAmount() + "\n";
        // Add more details as needed

        return receiptContent;
    }

    private void delivered(String toEmail, String subject, String content) {
        // Simulate sending an email; you can replace this with actual email sending logic
        System.out.println("Sending an email to: " + toEmail);
        System.out.println("Subject: " + subject);
        System.out.println("Content: \n" + content);
    }
}
