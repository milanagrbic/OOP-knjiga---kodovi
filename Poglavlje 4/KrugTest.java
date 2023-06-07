import java.util.Scanner;

public class KrugTest{
	public static void main(String [] args){
		
		Scanner sken = new Scanner(System.in);
		
		double p;
		Krug krug;
		
		System.out.println("Unesite poluprecnik kruga ");
		
		while((p = sken.nextDouble()) > 0){
			
			krug = new Krug(p);
			System.out.println(krug);
			System.out.println("Unesite poluprecnik sljedeceg kruga ");		
			
		}
		System.out.println("Ukupan broj unesenih krugova je  " + Krug.getBroj() + ".");
	}
}