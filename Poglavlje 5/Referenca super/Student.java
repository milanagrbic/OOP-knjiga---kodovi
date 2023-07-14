public class Student extends Osoba{

	private double prosjek;
	
	Student(String s, double p){
		
		super(s);
		prosjek = p;
		
	}
	
	public void setProsjek(double d){
		prosjek = d;
	}
	
	public double getProsjek(){
		return prosjek;
	}
	
	public void ispis(){
		System.out.println(ime + " ima prosjecnu ocjenu " + getProsjek());
	}

}