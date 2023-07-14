public class Nastavnik extends Osoba{

	private String fakultet;
	
	Nastavnik(String s, String f){
		
		super(s);
		fakultet = f;
		
	}
	
	public void setFakultet(String f){
		fakultet = f;
	}
	
	public String getFakultet(){
		return fakultet;
	}
	
	public void ispis(){
		System.out.println("Nastavnik " + ime + " je zaposlen na " + getFakultet());
	}
}