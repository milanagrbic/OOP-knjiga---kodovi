public class Direktor extends Zaposlen{
	
	private double bonus;
	
	public Direktor(String ime, String prezime, String telefon, String brojOsiguranja, double cijenaRada){
		super(ime, prezime, telefon, brojOsiguranja, cijenaRada);
		bonus = 0;
	}
	
	public void dodajBonus(double bonus){
		this.bonus = bonus;
	}
	
	public  double plati(){
		double plata = super.plati() + bonus;
		bonus = 0;
		return plata;
	}
}