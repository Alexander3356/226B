package com.digitallibrary.model.content;

import com.digitallibrary.model.base.DigitalContent;
import com.digitallibrary.enums.Genre;

import java.math.BigDecimal;

/**
 * Rappresenta un libro elettronico
 */
public class EBook extends DigitalContent {
    private final Genre genre;
    private final int pageCount;
    private final boolean isIllustrated;

    public EBook(String id, String title, String author, BigDecimal basePrice,
                 Genre genre, int pageCount, boolean isIllustrated) {
        super(id, title, author, basePrice);
        this.genre = genre != null ? genre : Genre.FICTION;
        this.pageCount = Math.max(1, pageCount);
        this.isIllustrated = isIllustrated;
    }

    @Override
    public String getContentType() {
        return "EBook";
    }

    @Override
    public String getDescription() {
        return String.format("%s - %s genre, %d pages%s",
                getTitle(), genre, pageCount, isIllustrated ? " (Illustrated)" : "");
    }

    /**
     * Calcola il tempo di lettura stimato in minuti
     * Stima: 250 parole per pagina, 200 parole per minuto
     */
    public int getReadingTime() {
        return (pageCount * 250) / 200;
    }

    /**
     * Restituisce il tempo di lettura formattato
     */
    public String getFormattedReadingTime() {
        int minutes = getReadingTime();
        if (minutes < 60) {
            return minutes + " minutes";
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return String.format("%dh %dm", hours, remainingMinutes);
        }
    }

    // Getters
    public Genre getGenre() { return genre; }
    public int getPageCount() { return pageCount; }
    public boolean isIllustrated() { return isIllustrated; }
}