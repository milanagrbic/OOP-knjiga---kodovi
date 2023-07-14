public class Grad{
		
	private String naziv;
	private int postanskiBroj;
	private String drzava;
		
	public String toString(){
		String s = postanskiBroj + " " + naziv + ", " +drzava;
		return s;	
	}
}