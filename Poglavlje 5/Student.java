public class Student extends Osoba{

	private double prosjek = 8.5;
	
	public void setProsjek(double d){
		prosjek = d;
	}
	
	public double getProsjek(){
		return prosjek;
	}
	
	public void ispis(){
		System.out.println(getIme()+" ima prosjecnu ocjenu "+getProsjek());
	}

}