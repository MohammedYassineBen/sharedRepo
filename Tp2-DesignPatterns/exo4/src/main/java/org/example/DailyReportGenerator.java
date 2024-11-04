package org.example;

class DailyReportGenerator implements StockObserver {
    private List<String> report;

    public DailyReportGenerator() {
        report = new ArrayList<>();
    }

    @Override
    public void update(Stock stock) {
        report.add("Produit: " + stock.getName() + ", Quantité: " + stock.getQuantity());
    }

    public void generateReport() {
        System.out.println("Rapport quotidien des stocks :");
        for (String entry : report) {
            System.out.println(entry);
        }
        report.clear(); // Reset pour le jour suivant
    }
}