public class GradTest{
	public static void main (String [] args){
			
		Grad g = new Grad("Banja Luka", 78000);
		System.out.println(g);	
			
		Grad d = new Grad(g);
		System.out.println(d);
	}
}