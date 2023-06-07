public class MjerenjeVremena{
	
	static long faktorijelI(long n){ //iterativna definicija
		long rez = 1;
		for(long i = 1; i <= n; i++)
			rez *= i;
		return rez;
	}
	
	static long faktorijelR(long n){//rekurzivna definicija
		if(n == 1)
			return 1;
		else
			return n * faktorijelR(n-1);
	}
	
	public static void main(String[]args){
		long pocetak1 = System.nanoTime();//pocetak 
		long r1 = faktorijelI(10);//poziv iterativne definicije funkcije
		long kraj1 = System.nanoTime();// kraj
		long vrijeme1 = kraj1 - pocetak1; //proteklo vrijeme je jednako razlici pocetka i kraja
		System.out.println("Rezultat dobijen iterativnom definicijom je: " + r1);
		System.out.println("Vrijeme potrebno za izracunavanje iterativnim postupkom je " + vrijeme1);
		
		long pocetak2 = System.nanoTime();//pocetak 
		long r2 = faktorijelR(10);//poziv rekurzivne definicije funkcije
		long kraj2 = System.nanoTime();// kraj
		long vrijeme2 = kraj2 - pocetak2; //proteklo vrijeme je jednako razlici pocetka i kraja
		System.out.println("Rezultat dobijen rekurzivnom definicijom je: " + r2);
		System.out.println("Vrijeme potrebno za izracunavanje rekurzivnim postupkom je " + vrijeme2);
		
		if(vrijeme1 < vrijeme2)
			System.out.println("Brza je iterativna definicija.");
		else if(vrijeme1 == vrijeme2)
				System.out.println("Racunanje faktorijela traje jednako.");
			else
				System.out.println("Brza je rekurzivna definicija.");
	}
}