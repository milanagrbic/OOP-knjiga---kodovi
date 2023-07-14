public class Osoba{

	protected String ime;
	
	Osoba(String s){
	
		ime = s;
		
	}
	
	public void setIme(String s){
		ime = s;
	}
	
	public String getIme(){
		return ime;
	}
	
	public void ispis(){
		System.out.println("Ime osobe je: "+ime);
	}

}