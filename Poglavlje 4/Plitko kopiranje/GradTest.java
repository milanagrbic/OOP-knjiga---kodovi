public class GradTest{
	
	public static void main (String [] args){
		
		Grad g = new Grad("Banja Luka", 78000);
		Grad d = new Grad(g);
		
		System.out.println("Ispis informacija o gradovima prije promjene:");
		System.out.println(g);	
		System.out.println(d);
		
		System.out.println("Ispis informacija o gradovima poslije promjene:");
		g.setst(3000);
		System.out.println(g);
		System.out.println(d);
	}
}