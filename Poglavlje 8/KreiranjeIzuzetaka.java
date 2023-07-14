import java.util.Scanner;

public class KreiranjeIzuzetaka{
	
	public static void main(String[]args) throws IzuzetakVanOpsega{
		final double MIN = -1, MAX = 1;
		Scanner sken = new Scanner(System.in);
		IzuzetakVanOpsega problem =
		new IzuzetakVanOpsega("Unesena vrijednost je van opsega.");
		System.out.print("Unesite realni broj iz intervala [" + MIN +
		", " + MAX + "]: ");
		double broj = sken.nextDouble();
		
		if (broj < MIN || broj > MAX)
			throw problem;
		System.out.println("Unesena je vrijednost: "+broj); 
	}	
}