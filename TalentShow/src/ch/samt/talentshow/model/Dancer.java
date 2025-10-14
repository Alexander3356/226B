package ch.samt.talentshow.model;
import ch.samt.talentshow.enumerator.Categoria;
import ch.samt.talentshow.enumerator.Livello;

public class Dancer extends Partecipante {

    public Dancer(String nome, int eta, Categoria categoria, Livello livello) {
        super(nome, eta, categoria, livello);
    }

    public void Esecuzione(){
        System.out.println(this.nome + " balla sulle musiche dello Schiaccianoci");
    }

    @Override
    public void Valutazione() {
        super.Valutazione();
        System.out.println(valore + 4.5);
    }

}
