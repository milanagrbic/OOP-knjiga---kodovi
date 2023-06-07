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
	
	public Grad(String n, int b){
		this(n,b,"BiH");
	}
	
	public Grad(Grad grad){
		this.naziv = grad.naziv;
		this.postanskiBroj = grad.postanskiBroj;
		this.drzava = grad.drzava;
	}
	
	public String toString(){
		String s = postanskiBroj + " " + naziv + ", " + drzava;
		return s;	
	}
}