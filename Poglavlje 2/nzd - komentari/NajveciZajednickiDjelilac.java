	import java.io.*;
/**
* <strong>Najveci zajednicki djelilac</strong><br>
*
*
* Program je jednostavan i sluzi za racunanje 
* najveceg zajednickog djelioca
* dva broja
* <p>
* <b>Vazno:</b> U dokumentaciji se neki dijelovi mogu posebno naglasiti html tagovima
*
* @author  Milana i Dragan
* @version 1.0
* @since   2022-03-13
*/
public class NajveciZajednickiDjelilac {
	/**
	* Metoda racuna nzd od dva broja. Zasnovana je na 
	* iterativnom smanjivanju argumenata dok se 
	* ne dodje do situacije da su argumenti jednaki
	* @param a Prvi parametar metode
	* @param b Drugi parametar metode
	* @return int Vraca se nzd za date brojeve
	*/
	public int nzd(int a, int b) {	
		while (a != b) {
			if(a > b)
			a = a - b;
			else
			b = b - a;
		}
		return a;
	}
	/**
	* Ovo je main metoda
	* @param args Ne koriste se u ovom programu
	* @exception IOException Izuzetak je tipa IOExpception.
	* @see IOException
	*/
	public static void main(String args[]) throws IOException {
		NajveciZajednickiDjelilac obj = new NajveciZajednickiDjelilac();	
		int rezultat = obj.nzd(16, 24);
		System.out.println("NZD od 16 i 24 je " + rezultat);
	}
}