package org.example;

abstract class Document implements Cloneable {
    private String title;
    private String author;
    private String content;

    public Document(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Getter et Setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Méthode clone() pour permettre le clonage
    @Override
    public abstract Document clone();
}

// Sous-classe Report
class Report extends Document {
    public Report(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public Document clone() {
        return new DocumentFactory(getTitle(), getAuthor(), getContent());
    }
}

// Sous-classe Contract
class Contract extends Document {
    public Contract(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public Document clone() {
        return new Contract(getTitle(), getAuthor(), getContent());
    }
}

// Sous-classe Invoice
class Invoice extends Document {
    public Invoice(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public Document clone() {
        return new Invoice(getTitle(), getAuthor(), getContent());
    }
}
