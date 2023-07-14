import java.io.Serializable;

public class StudentSer implements Serializable{
	
	private String brojIndeksa;
	private String ime;
	private String prezime;
	private double prosjek;
	
	public StudentSer(){
		this ("","","",0.0);
	}
	
	public StudentSer(String broj, String i, String p, double pr){
		brojIndeksa = broj;
		ime = i;
		prezime = p;
		prosjek = pr;
	}	
	public void setBrojIndeksa(String s){
		brojIndeksa = s;
	}	
	public String getBrojIndeksa(){
		return brojIndeksa;
	}	
	public void setIme(String s){
		ime = s;
	}	
	public String getIme(){
		return ime;
	}	
	public void setPrezime(String s){
		prezime = s;
	}	
	public String getPrezime(){
		return prezime;
	}	
	public void setProsjek(double d){
		prosjek = d;
	}	
	public double getProsjek(){
		return prosjek;
	}	
}