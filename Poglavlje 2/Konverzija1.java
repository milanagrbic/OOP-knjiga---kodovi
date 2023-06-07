public class Konverzija1{
	
	public static void main(String[] args){
		
		int cio = 16777217;
		System.out.println(cio);
		float realan1 = cio; //ovdje ce nastati problem
		System.out.println(realan1);	
		int cio2 = (int)realan1; //provjera da je doslo do gubitka	
		System.out.println(cio2);	
		double realan2 = cio;	//ovdje nema gubitka
		System.out.println(realan2);	
		int cio3 = (int)realan2;	//provjera da nema gubitka
		System.out.println(cio3);
	}
}