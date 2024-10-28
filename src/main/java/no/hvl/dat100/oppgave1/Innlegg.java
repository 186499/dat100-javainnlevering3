package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
    // a)
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    // b) Første konstruktør som setter likes til 0
    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0; 
    }

    // Andre konstruktør likes er parameter med resten
    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    // c) get og setter metoder for bruker og dato, og get-metoder for id og likes
    public int getId() {
        return id;
    }

    public String getBruker() {
        return bruker;
    }

    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getLikes() {
        return likes;
    }

    // d) Metoden doLike som øker likes med 1
    public void doLike() {
        this.likes++;
    }

    // e) toString-metoden for å returnere en tekststreng representasjon
    @Override
    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }

    // f) erlik-metoden som sammenligner id med et annet innlegg
    public boolean erLik(Innlegg innlegg) {
        return this.id == innlegg.getId();
    }
}
