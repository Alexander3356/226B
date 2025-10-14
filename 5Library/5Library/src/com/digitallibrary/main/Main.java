package com.digitallibrary.main;

import com.digitallibrary.interfaces.Purchasable;
import com.digitallibrary.enums.*;
import com.digitallibrary.model.base.DigitalContent;
import com.digitallibrary.model.content.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * Classe principale per testare il sistema della libreria digitale
 */
public class Main {

    public static void main(String[] args) {
        Set<Purchasable> purchasables = new HashSet<>();
        System.out.println("=== DIGITAL LIBRARY SYSTEM ===");


        // EBooks
        EBook ebook1 = new EBook("EB001", "Java Programming Guide", "John Doe",
                BigDecimal.valueOf(29.99), Genre.TECHNOLOGY, 450, false);
        EBook ebook2 = new EBook("EB002", "Advanced Design Patterns", "Jane Smith",
                BigDecimal.valueOf(29.99), Genre.TECHNOLOGY, 380, true);


        // AudioBooks
        AudioBook audiobook1 = new AudioBook("AB001", "The Art of War", "Sun Tzu",
                BigDecimal.valueOf(19.99), "Morgan Freeman", 520, "English");
        AudioBook audiobook2 = new AudioBook("AB002", "Thinking Fast and Slow", "Daniel Kahneman",
                BigDecimal.valueOf(24.99), "Patrick Egan", 720, "English");

        // Digital Magazines
        DigitalMagazine magazine1 = new DigitalMagazine("DM001", "Tech Today", "Various",
                BigDecimal.valueOf(29.99), 156, LocalDate.now().minusDays(5), "Technology");
        DigitalMagazine magazine2 = new DigitalMagazine("DM002", "Science Weekly", "Editorial Team",
                BigDecimal.valueOf(3.99), 45, LocalDate.now().minusDays(45), "Science");

        // Online Courses
        OnlineCourse course1 = new OnlineCourse("OC001", "Advanced Java Concepts", "Dr. Smith",
                BigDecimal.valueOf(99.99), "Dr. Jane Smith", Difficulty.ADVANCED, 25);
        OnlineCourse course2 = new OnlineCourse("OC002", "Introduction to AI", "Prof. Johnson",
                BigDecimal.valueOf(79.99), "Prof. Mike Johnson", Difficulty.INTERMEDIATE, 15);

        purchasables.add(ebook1);
        purchasables.add(ebook2);
        purchasables.add(audiobook1);
        purchasables.add(audiobook2);
        purchasables.add(magazine1);
        purchasables.add(magazine2);
        purchasables.add(course1);
        purchasables.add(course2);

        for (Purchasable p : purchasables) {
            System.out.println(p.calculatePrice());
            p.applyDiscount(0.1);
            System.out.println(p.getPriceWithTax());
            if (p instanceof AudioBook) {
                System.out.println(((AudioBook)p).getFormattedDuration());
                System.out.println(((AudioBook)p).getNarrator());
            }
        }

    }
}
