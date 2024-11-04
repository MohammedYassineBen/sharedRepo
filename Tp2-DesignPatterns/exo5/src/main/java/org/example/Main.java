package org.example;

public class Main {
    public static void main(String[] args) {
        // Création de documents avec DocumentFactory
        Document report = DocumentFactory.createDocument("report", "Rapport Annuel", "Alice", "Contenu du rapport annuel.");
        Document contract = DocumentFactory.createDocument("contract", "Contrat de Vente", "Bob", "Contenu du contrat de vente.");
        Document invoice = DocumentFactory.createDocument("invoice", "Facture #12345", "Charlie", "Contenu de la facture.");

        // Affichage des documents créés
        System.out.println("Documents créés:");
        System.out.println("Report - Titre: " + report.getTitle() + ", Auteur: " + report.getAuthor() + ", Contenu: " + report.getContent());
        System.out.println("Contract - Titre: " + contract.getTitle() + ", Auteur: " + contract.getAuthor() + ", Contenu: " + contract.getContent());
        System.out.println("Invoice - Titre: " + invoice.getTitle() + ", Auteur: " + invoice.getAuthor() + ", Contenu: " + invoice.getContent());

        // Clonage des documents
        Document clonedReport = report.clone();
        Document clonedContract = contract.clone();

        // Modification du contenu du clone pour vérifier l'indépendance
        clonedReport.setContent("Contenu du rapport annuel (cloné)");
        clonedContract.setContent("Contenu du contrat de vente (cloné)");

        // Affichage des documents clonés et originaux
        System.out.println("\nDocuments clonés:");
        System.out.println("Cloned Report - Titre: " + clonedReport.getTitle() + ", Auteur: " + clonedReport.getAuthor() + ", Contenu: " + clonedReport.getContent());
        System.out.println("Cloned Contract - Titre: " + clonedContract.getTitle() + ", Auteur: " + clonedContract.getAuthor() + ", Contenu: " + clonedContract.getContent());

        System.out.println("\nDocuments originaux (après clonage):");
        System.out.println("Original Report - Titre: " + report.getTitle() + ", Auteur: " + report.getAuthor() + ", Contenu: " + report.getContent());
        System.out.println("Original Contract - Titre: " + contract.getTitle() + ", Auteur: " + contract.getAuthor() + ", Contenu: " + contract.getContent());
    }
}
