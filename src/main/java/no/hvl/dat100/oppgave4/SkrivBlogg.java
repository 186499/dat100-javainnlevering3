package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException; //fanger denne typen feil eksplisitt
import java.io.IOException; //fanger andre mulige IO-relaterte feil
import java.io.PrintWriter;
import java.io.FileWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		// lager sti for filen
		String fullFilSti = mappe + "/" + filnavn; // lager sti for filen
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(fullFilSti))) {
            // skrive antall innlegg
            writer.println(samling.getAntall());
		
		 writer.print(samling.toString());
		 
		 return true; //hvis ingen feil
		} catch (FileNotFoundException e) {
            e.printStackTrace(); // feilmelding for fil ikke funnet
            return false; // hvis filen ikke funnet
		} catch (IOException e) {
            e.printStackTrace(); // feilmelding for andre IO-feil
            return false; // hvis andre IO-feil oppstår 
		}
	}
}
