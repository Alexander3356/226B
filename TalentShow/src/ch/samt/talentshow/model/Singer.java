package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Categoria;
import ch.samt.talentshow.enumerator.Livello;

public class Singer extends Partecipante{

    public Singer(String nome, int eta, Categoria categoria, Livello livello) {
        super(nome, eta, categoria, livello);
    }

    public void Esecuzione(){
        System.out.println(this.nome + " canta 'O mia bela Madunina.'");
    }

    @Override
    public void Valutazione() {
        super.Valutazione();
        System.out.println(valore + 5);
    }
}
