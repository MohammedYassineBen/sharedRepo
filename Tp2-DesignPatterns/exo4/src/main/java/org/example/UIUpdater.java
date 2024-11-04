package org.example;

class UIUpdater implements StockObserver {
    @Override
    public void update(Stock stock) {
        System.out.println("UI Updater: Interface utilisateur mise à jour pour " + stock.getName() + " - Quantité: " + stock.getQuantity());
    }
}
