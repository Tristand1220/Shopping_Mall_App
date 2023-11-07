package com.example.mall;



import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private List<Item> items;

    public Wishlist() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    // Function to move an item from the shopping cart to the wishlist
    public void moveToWishlist(Item item, List<Item> wishlist) {
        if (items.contains(item)) {
            items.remove(item);
            ShoppingCart.addItem(item);
        }
    }
}

