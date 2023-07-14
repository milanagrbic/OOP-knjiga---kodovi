abstract public class Radnik{
	
	protected String ime;
	protected String prezime;
	protected String telefon;
	
	public Radnik(String ime, String prezime, String telefon){
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
	}
	
	public String toString(){
		String rez = "Ime i prezime: " + ime + " " + prezime + ", broj telefona: " + telefon;
		return rez;
	}
	
	public abstract double plati();
}