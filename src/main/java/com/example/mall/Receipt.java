package com.example.mall;

public class Receipt {
    private string itemName;
    private int itemQuantity;
    private int itemPrice; 
    private int totalPrice;
   
    // Constructor
    public Receipt(string itemName, int itemQuantity, int itemPrice, int totalPrice ) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        this.totalPrice = totalPrice;
    }

    public String getitemName() {
        return itemName;
    }

    public void setitemName( string itemName) {
        this.itemName = itemName; 
    }

    public int getitemQuantity() {
        return itemQuantity;
    }
  
    public void setitemQuantity(int itemQuantity) {
      this.itemQuantity = itemQuantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getItemPrice() {
      return itemPrice;
    }
  
    public void setItemPrice(int itemPrice) {
      this.itemPrice = itemPrice;
    }
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
}
