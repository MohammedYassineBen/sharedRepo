package org.example;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Ordinateur Portable", 20);

        EmailNotifier emailNotifier = new EmailNotifier();
        UIUpdater uiUpdater = new UIUpdater();
        DailyReportGenerator dailyReport = new DailyReportGenerator();

        stock.addObserver(emailNotifier);
        stock.addObserver(uiUpdater);
        stock.addObserver(dailyReport);

        // Simulation de changements de quantité
        System.out.println("Modification de la quantité à 8");
        stock.setQuantity(8); // Déclenche une notification de stock bas
        System.out.println("Modification de la quantité à 15");
        stock.setQuantity(15); // Mise à jour de l'interface utilisateur sans notification de stock bas

        // Génération du rapport quotidien
        dailyReport.generateReport();
    }
}
