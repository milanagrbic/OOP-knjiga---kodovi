import java.text.NumberFormat;

public class MetodeNumberFormat{
	public static void main(String[] args) {
		
		double cijena = 105.67;
		double popust = 0.3; //popust od 30%
		
		double novaCijena = cijena - cijena * popust;
		
		/*objekti klase NumberFormat potrebni za korektno prikazivanje
		*valute i procenta*/       
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.println("Cijena proizvoda prije popusta: " + fmt1.format(cijena));
		System.out.println("Cijena proizvoda nakon popusta od: " + fmt2.format(popust) + " je " + fmt1.format(novaCijena));
	}
}