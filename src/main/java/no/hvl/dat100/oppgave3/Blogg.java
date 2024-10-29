package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggTabell; // En tabell som lagrer Innlegg-objektene
	private int nesteLedig;


	// TODO: objektvariable 

	public Blogg() {
		innleggTabell = new Innlegg[20];
		nesteLedig = 0;
		
	}
		 

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
		nesteLedig = 0;
		
	}

	public int getAntall() {
		return nesteLedig;
//metoden nesteLedig viser antall innlegg som er lagret i innleggTabell
		 
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
	    for (int i = 0; i < nesteLedig; i++) {
	        if (innleggTabell[i].erLik(innlegg)) {
	            return i; // Returnerer posisjonen hvis vi finner et innlegg med samme id
	        }
	    }
	    return -1; // Returnerer -1 hvis vi ikke finner et match innlegg
	}


	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if(innleggTabell[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggTabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
	    // Sjekker om innlegget allerede finnes
	    for (int i = 0; i < nesteLedig; i++) {
	        if (innleggTabell[i].erLik(innlegg)) {
	            return false; // false hvis et innlegg med samme id allerede finnes
	        }
	    }

	    if (nesteLedig < innleggTabell.length) {
	        innleggTabell[nesteLedig] = innlegg; // Legger til innlegget på neste ledige plass
	        nesteLedig++; // Oppdaterer neste ledige posisjon
	        return true; // true fordi innlegget ble lagt til
	    }
	    
	    return false; // false hvis det ikke var plass i tabellen
	}

	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(nesteLedig).append("\n");
	    
	    for (int i = 0; i < nesteLedig; i++) {
	        sb.append(innleggTabell[i].toString());
	    }
	    return sb.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}