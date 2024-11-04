package org.example;

class EmailNotifier implements StockObserver {
    @Override
    public void update(Stock stock) {
        if (stock.getQuantity() < 10) { // Suppose qu'un stock bas est inférieur à 10
            System.out.println("Email Notifier: Stock bas pour " + stock.getName() + " - Quantité: " + stock.getQuantity());
        }
    }
}
