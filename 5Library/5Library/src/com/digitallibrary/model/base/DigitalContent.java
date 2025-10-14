package com.digitallibrary.model.base;

import com.digitallibrary.interfaces.Purchasable;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Classe astratta base per tutti i contenuti digitali
 */
public abstract class DigitalContent implements Purchasable {
    protected final String id;
    protected final String title;
    protected final String author;
    protected final BigDecimal basePrice;
    private double currentDiscount = 0.0;

    protected DigitalContent(String id, String title, String author, BigDecimal basePrice) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (basePrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Base price cannot be negative");
        }

        this.id = id.trim();
        this.title = title.trim();
        this.author = author != null ? author.trim() : "Unknown";
        this.basePrice = basePrice;
    }

    // Metodi astratti da implementare nelle sottoclassi
    public abstract String getContentType();
    public abstract String getDescription();


    // Implementazione di Purchasable
    @Override
    public BigDecimal calculatePrice() {
        BigDecimal price = basePrice.multiply(BigDecimal.valueOf(1).subtract(BigDecimal.valueOf(currentDiscount)));
        System.out.println("CalculatePrice è polimorfico ed ereditato da DigitalContent. Il preyyo è " + price);
        return price;
    }

    @Override
    public final void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 1) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 1");
        }
        this.currentDiscount = percentage;
        System.out.println("applyDiscount is inherited from abstract class. Current discount is" + this.currentDiscount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DigitalContent that = (DigitalContent) obj;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    // Getters
    public final String getId() { return id; }
    public final String getTitle() { return title; }
    public final String getAuthor() { return author; }
    public final BigDecimal getBasePrice() { return basePrice; }
    public final double getCurrentDiscount() { return currentDiscount; }

    @Override
    public String toString() {
        return String.format("%s: %s by %s (€%.2f)", getContentType(), title, author, calculatePrice());
    }
}