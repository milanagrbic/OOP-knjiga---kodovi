public class ZaposlenPoSatu extends Zaposlen{
	
	private int brojSati;
	
	public ZaposlenPoSatu(String ime, String prezime, String telefon, String brojOsiguranja, double cijenaRada){
		super(ime, prezime, telefon, brojOsiguranja, cijenaRada);
		brojSati = 0;
	}
	
	public void dodajSate(int sati){
		brojSati += sati;
	}
	
	public  double plati(){
		double plata = cijenaRada * brojSati;
		brojSati = 0;
		return plata;
	}
	
	public String toString(){
		String rez = super.toString();
		rez += "\nTrenutno sati: " + brojSati;
		return rez;
	}
}