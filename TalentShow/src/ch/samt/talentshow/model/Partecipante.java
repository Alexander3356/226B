package ch.samt.talentshow.model;

import ch.samt.talentshow.enumerator.Categoria;
import ch.samt.talentshow.enumerator.Livello;

import java.util.Objects;

public abstract class Partecipante {


    protected String nome;
    protected int eta;
    protected Categoria categoria;
    protected Livello livello;

    public Partecipante(String nome, int eta, Categoria categoria, Livello livello) {
        this.nome = nome;
        this.eta = eta;
        this.categoria = categoria;
        this.livello = livello;
    }

    public void Presentazione(){
        System.out.println(this.nome + " " + this.eta + " anni, sale sul palco");
    }

    public double valore = 0;

    public void Valutazione(){

        System.out.print(this.nome + " (" + this.categoria + ", " + this.livello + ") -> Punteggio: " );
        if (this.livello.equals(Livello.PROFESSIONAL)) {
            valore = 4.5;
        } else if(this.livello.equals(Livello.INTERMEDIATE)) {
            valore = 3.0;
        } else if(this.livello.equals(Livello.BEGINNER)) {
            valore = 1.5;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Livello getLivello() {
        return livello;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partecipante that = (Partecipante) o;
        return eta == that.eta && Objects.equals(nome, that.nome) && Objects.equals(categoria, that.categoria) && Objects.equals(livello, that.livello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eta, categoria, livello);
    }

    @Override
    public String toString() {
        return "Partecipante{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", categoria='" + categoria + '\'' +
                ", livello='" + livello + '\'' +
                '}';
    }
}
