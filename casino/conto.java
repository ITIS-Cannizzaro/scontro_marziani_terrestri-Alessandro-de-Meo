package casino;
import java.util.Scanner;

public class conto {
	double importoG;
	double importoC;
	public conto () {
		this.importoG=1000.0;
		this.importoC=100000.0;
	}
	public void scommessa (int n, double somma ) {
		int r;
		String ss;
		do {
			r=(int)(Math.random()*6);
			double win=somma*5;
			if (r==n) {
				importoG=importoG+win;
				importoC=importoC-win;
				System.out.println("HAI VINTO!!!");
			}
			else  {
				importoG=importoG-somma;
				importoC=importoC+somma;
				System.out.println("Hai perso");
			}
			System.out.println("Importo Giocatore: "+importoG+"Importo Banco: "+importoC);
			System.out.println("Digitare 'si' per continuare, digitare altro per terminare la scommessa");
			Scanner s = new Scanner(System.in);
			ss = s.nextLine();
			if 	((ss.equals("si")) && (importoG>0)) {
				}
			else {
				break;
			}
		} while ((somma<importoG) && ((somma/5)<importoC));
		System.out.println("Il gioco è terminato");
	}
}
