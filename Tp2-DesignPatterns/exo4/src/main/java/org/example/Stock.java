package org.example;

import java.util.ArrayList;
import java.util.List;

class Stock {
    private String name;
    private int quantity;
    private List<StockObserver> observers;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.observers = new ArrayList<>();
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers();
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(this);
        }
    }
}
