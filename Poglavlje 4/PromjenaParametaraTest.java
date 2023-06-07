public class PromjenaParametaraTest{
	
	public static void main (String [] args){
		
		PromjenaParametara pp = new PromjenaParametara();
		
		double a1 = 1.11;
		RealniBroj a2 = new RealniBroj(2.22);
		RealniBroj a3 = new RealniBroj(3.33);
		
		System.out.println("Prije poziva metode za promjenu vrijednosti:");
		System.out.println("a1\ta2\ta3\t");
		System.out.println(a1 + "\t" + a2 + "\t" + a3);
		
		pp.promjena(a1,a2,a3);
		
		System.out.println("Nakon poziva metode za promjenu vrijednosti:");
		System.out.println("a1\ta2\ta3\t");
		System.out.println(a1 + "\t" + a2 + "\t" + a3);		
	}
}