public class Palindrom1{
	public static void main(String[] args){			
		int n = 2356532;
		int m = n;
		int broj = 0; // formiranje broja sa obrnutim zapisom cifara
		while(m > 0){			
			broj = 10 * broj + m % 10;
			m /= 10;
		}
		if(broj == n)
			System.out.print("Broj " + n + " jeste palindrom.");
		else
			System.out.print("Broj " + n + " nije palindrom.");	
	}
}