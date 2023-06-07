import java.time.LocalDate;

class MetodeLocalDate{
	public static void main(String[] args) {
		
		LocalDate datum = LocalDate.parse("2019-08-15");
		
		/*Ispravan mjesec se desio 3 mjeseca ranije*/
		LocalDate pom = datum.minusMonths(3);
		
		/*Dan treba da bude posljednji dan u mjesecu, a godina 2022*/
		LocalDate noviDatum = (pom.withDayOfMonth(pom.lengthOfMonth())).withYear(2022);
		
		System.out.println(noviDatum);
	}
}