package org.example;

class DocumentFactory {
    public static Document createDocument(String type, String title, String author, String content) {
        switch (type.toLowerCase()) {
            case "report":
                return new Report(title, author, content);
            case "contract":
                return new Contract(title, author, content);
            case "invoice":
                return new Invoice(title, author, content);
            default:
                throw new IllegalArgumentException("Type de document inconnu : " + type);
        }
    }
}
