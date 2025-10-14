package ch.samt.talentshow;

import ch.samt.talentshow.enumerator.Categoria;
import ch.samt.talentshow.enumerator.Livello;
import ch.samt.talentshow.model.Dancer;
import ch.samt.talentshow.model.Magician;
import ch.samt.talentshow.model.Singer;

public class Main {
    public static void main(String[] args) {

        Livello beginner = Livello.BEGINNER;
        Livello intermediate = Livello.INTERMEDIATE;
        Livello professional = Livello.PROFESSIONAL;
        Categoria singer = Categoria.SINGER;
        Categoria dancer = Categoria.DANCER;
        Categoria magician = Categoria.MAGICIAN;


        Singer cantante = new Singer("Anna", 22, singer, professional);
        Dancer ballerino = new Dancer("Gianni", 19,dancer,  intermediate);
        Magician mago = new Magician("Charlie", 25, magician, beginner);
        Singer cantante2 = new Singer("Diana", 30, singer, intermediate);
        Dancer ballerino2 = new Dancer("Marco", 21, dancer, professional);

        cantante.Presentazione();
        cantante.Esecuzione();
        cantante.Valutazione();
        System.out.println("---------");
        ballerino.Presentazione();
        ballerino.Esecuzione();
        ballerino.Valutazione();
        System.out.println("---------");
        mago.Presentazione();
        mago.Esecuzione();
        mago.Valutazione();
        System.out.println("---------");
        cantante2.Presentazione();
        cantante2.Esecuzione();
        cantante2.Valutazione();
        System.out.println("---------");
        ballerino2.Presentazione();
        ballerino2.Esecuzione();
        ballerino2.Valutazione();
        System.out.println("---------");


    }
}