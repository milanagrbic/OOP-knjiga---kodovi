public class PromjenaParametara{
	
	public void promjena(double d1, RealniBroj d2, RealniBroj d3){
		
		System.out.println("Prije promjene vrijednosti:");
		System.out.println("d1\td2\td3\t");
		System.out.println(d1 + "\t" + d2 + "\t" + d3);
	
		d1 = 1.23;
		d2.setVrijednost(2.34);
		d3 = new RealniBroj(3.45);
		
		System.out.println("Nakon promjene vrijednosti:");
		System.out.println("d1\td2\td3\t");
		System.out.println(d1 + "\t" + d2 + "\t" + d3);		
	}
}