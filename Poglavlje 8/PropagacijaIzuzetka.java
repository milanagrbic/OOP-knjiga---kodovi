public class PropagacijaIzuzetka{
	
	public static int kolicnik(int brojilac, int imenilac){
		return brojilac / imenilac;
	}
	
	public static void metoda1(){
		System.out.println("Metoda1: pocetak");
		int rez = kolicnik(10,0);
		System.out.println("Rezultat = "+ rez);
		System.out.println("Metoda1: kraj");
	}
	
	public static void metoda2(){
		System.out.println("Metoda2: pocetak");
		try{
			metoda1();
		}
		catch(ArithmeticException izuzetak)
		{
			System.out.println();
			System.out.println("Do izuzetka je doslo zbog: " +
			izuzetak.getMessage());
			System.out.println();
			System.out.println("Trag sa steka:");
			izuzetak.printStackTrace();
			System.out.println();
		}
		System.out.println("Metoda2: kraj");
	}
	
	public static void main(String[]args){
		metoda2();				
	}
}