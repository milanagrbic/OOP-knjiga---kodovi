public class PromjenljivBroj{
	static double prosjek(int ... brojevi){
		double rezultat = 0.0;
		for(int x : brojevi)
			rezultat += x;
		rezultat /= brojevi.length;
		return rezultat;
		
	}
	public static void main(String[] args){
		System.out.println(prosjek(4,5,5,5));
		System.out.println(prosjek(1,2,3,4,5,6,7,8,9,10));
	}
}