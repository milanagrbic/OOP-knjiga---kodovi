public class Zaposlen extends Radnik{
	
	protected String brojOsiguranja;
	protected double cijenaRada;
	
	public Zaposlen(String ime, String prezime, String telefon, String brojOsiguranja, double cijenaRada){
		super(ime, prezime, telefon);
		this.brojOsiguranja = brojOsiguranja;
		this.cijenaRada = cijenaRada;
	}
	
	public String toString(){		
		String rez = super.toString();
		rez += "\n Broj osiguranja: " + brojOsiguranja;
		return rez;
	}
	
	public  double plati(){
		return cijenaRada;
	}
}