public class Artikal{
	
	String naziv;
	float cijena;
	
	public static void main(String [] args){
		//deklaracija i inicijalizacija objekta klase Artikl
		
		Artikal a = new Artikal();
		//upotreba dot operatora za inicijalizaciju atributa
		a.naziv = "Banane"; 
		a.cijena = 1;
		
		Artikal b = a; //b i a su alijasi
		
		System.out.println(a); 
		
		boolean jednakiAB = a.equals(b);
		if(jednakiAB)
			System.out.println("Objekti a i b su jednaki");
		else
			System.out.println("Objekti a i b nisu jednaki");
		
		Artikal c = new Artikal();
		c.naziv = "Banane";
		c.cijena = 1;
		
		boolean jednakiAC = a.equals(c);
		if(jednakiAC)
			System.out.println("Objekti a i c su jednaki");
		else
			System.out.println("Objekti a i c nisu jednaki");
	}
}