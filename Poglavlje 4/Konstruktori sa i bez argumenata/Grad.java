public class Grad{
	
	private String naziv;
	private int postanskiBroj;
	private String drzava;
	
	public Grad(){}
	
	public Grad(String n, int b, String d){
		naziv = n;
		postanskiBroj = b;
		drzava = d;	
	}	
	public String toString(){
		String s = postanskiBroj + " " + naziv + ", " + drzava;
		return s;	
	}
}