package com.digitallibrary.model.content;

import com.digitallibrary.model.base.DigitalContent;

import java.math.BigDecimal;

/**
 * Rappresenta un audiolibro
 */
public class AudioBook extends DigitalContent {
    private final String narrator;
    private final int duration; // in minuti
    private final String language;

    public AudioBook(String id, String title, String author, BigDecimal basePrice,
                     String narrator, int duration, String language) {
        super(id, title, author, basePrice);
        this.narrator = narrator != null ? narrator.trim() : "Unknown Narrator";
        this.duration = Math.max(1, duration);
        this.language = language != null ? language.trim() : "Unknown";
    }

    @Override
    public String getContentType() {
        return "AudioBook";
    }

    @Override
    public String getDescription() {
        return String.format("%s - Narrated by %s (%s), Duration: %s",
                getTitle(), narrator, language, getFormattedDuration());
    }

    /**
     * Restituisce la durata formattata in formato HH:MM
     */
    public String getFormattedDuration() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return String.format("%d:%02d", hours, minutes);
    }

    @Override
    public BigDecimal calculatePrice() {
        BigDecimal price = super.calculatePrice();
        // +20% se durata > 8 ore (480 minuti)
        if (duration > 480) {
            price = price.multiply(new BigDecimal("1.20"));
        }
        System.out.println("Calculate price è polimorfico, in  questo caso il binding è con l'oggetto AudioBook ed il prezzo è " + price);
        return price;
    }

    /**
     * Verifica se l'audiolibro è considerato "lungo" (>8 ore)
     */
    public boolean isLongFormat() {
        return duration > 480;
    }

    // Getters
    public String getNarrator() { return narrator; }
    public int getDuration() { return duration; }
    public String getLanguage() { return language; }
}