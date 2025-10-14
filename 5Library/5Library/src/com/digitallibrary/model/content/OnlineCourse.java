package com.digitallibrary.model.content;

import com.digitallibrary.model.base.DigitalContent;
import com.digitallibrary.enums.Difficulty;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Rappresenta un corso online
 * Classe final - non può essere ereditata
 */
public final class OnlineCourse extends DigitalContent {
    private final String instructor;
    private final Difficulty difficulty;
    private final int estimatedHours;

    public OnlineCourse(String id, String title, String author, BigDecimal basePrice,
                        String instructor, Difficulty difficulty, int estimatedHours) {
        super(id, title, author, basePrice);
        this.instructor = instructor != null ? instructor.trim() : "Unknown Instructor";
        this.difficulty = difficulty != null ? difficulty : Difficulty.BEGINNER;
        this.estimatedHours = Math.max(1, estimatedHours);
    }

    @Override
    public String getContentType() {
        return "Online Course";
    }

    @Override
    public String getDescription() {
        return String.format("%s - Instructor: %s, Level: %s, Duration: %dh%s",
                getTitle(), instructor, difficulty, estimatedHours,
                getCertificationEligible() ? " (Certificate Available)" : "");
    }

    /**
     * Verifica se il corso è idoneo per la certificazione (>10 ore)
     */
    public boolean getCertificationEligible() {
        return estimatedHours > 10;
    }

    /**
     * Calcola il prezzo per ora del corso
     */
    public BigDecimal getPricePerHour() {
        return calculatePrice().divide(BigDecimal.valueOf(estimatedHours), RoundingMode.HALF_UP) ;
    }

    // Getters
    public String getInstructor() { return instructor; }
    public Difficulty getDifficulty() { return difficulty; }
    public int getEstimatedHours() { return estimatedHours; }
}