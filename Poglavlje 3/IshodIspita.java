//Enumerativne vrijednosti za ishod ispita

public enum IshodIspita{
	
	deset ("Polozio: odlican-izuzetan (10)"),
	devet ("Polozio: odlican (9)"),
	osam ("Polozio: vrlo dobar (8)"),
	sedam ("Polozio: dobar (7)"),
	sest ("Polozio: zadovoljava (6)"),
	NP ("Nije polozio"),
	NI ("Nije izasao"),
	O ("Odustao");
	
	private String poruka;
	
	/*Konstruktor koji svakoj vrijednosti
	 *pridruzuje odgovarajucu poruku*/
	
	IshodIspita (String s){
		poruka = s;
	}
	
	/*Metoda koja vraca poruku za datu vrijednost*/
	public String getPoruka(){
		return poruka;
	}
}
