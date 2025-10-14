package com.digitallibrary.model.content;

import com.digitallibrary.model.base.DigitalContent;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Rappresenta una rivista digitale
 */
public class DigitalMagazine extends DigitalContent {
    private final int issueNumber;
    private final LocalDate publicationDate;
    private final String category;

    public DigitalMagazine(String id, String title, String author, BigDecimal basePrice,
                           int issueNumber, LocalDate publicationDate, String category) {
        super(id, title, author, basePrice);
        this.issueNumber = Math.max(1, issueNumber);
        this.publicationDate = publicationDate != null ? publicationDate : LocalDate.now();
        this.category = category != null ? category.trim() : "General";
    }

    @Override
    public String getContentType() {
        return "Digital Magazine";
    }

    @Override
    public String getDescription() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM yyyy");
        return String.format("%s - Issue #%d (%s), Category: %s",
                getTitle(), issueNumber, publicationDate.format(formatter), category);
    }

    /**
     * Verifica se la rivista è stata pubblicata negli ultimi 30 giorni
     */
    public boolean isRecentIssue() {
        return publicationDate.isAfter(LocalDate.now().minusDays(30));
    }

    @Override
    public BigDecimal calculatePrice() {
        BigDecimal price = super.calculatePrice();
        // +10% se è un numero recente
        if (isRecentIssue()) {
            price = price.multiply(BigDecimal.valueOf(1.10));
        }
        System.out.println("Calculate price è polimorfico, binding con DigitalMagazin,  il preyyo è " + price);
        return price;
    }

    /**
     * Calcola l'età della pubblicazione in giorni
     */
    public long getDaysOld() {
        return LocalDate.now().toEpochDay() - publicationDate.toEpochDay();
    }

    // Getters
    public int getIssueNumber() { return issueNumber; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public String getCategory() { return category; }
}