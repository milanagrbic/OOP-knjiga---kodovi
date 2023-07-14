class Klonirana implements Cloneable {
	public int i;
	public String s;
	
	
	public Klonirana(int i, String s)
	{
		this.i = i;
		this.s = s;
	}
	
	
	//@Override clone() metode
	protected Object clone()
	throws CloneNotSupportedException
	{
		return super.clone();//poziva se clone() metoda nadklase, u ovom slucaju klase Object
	}
}

public class KloniranaTest {
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		Klonirana a = new Klonirana(20, "MojaKlasa");
		
		
		//  clone() vraca Object pa je potrebno kastovanje
		Klonirana b = (Klonirana)a.clone();
		
		System.out.println(b.i);
		System.out.println(b.s);
		
		
	}
}