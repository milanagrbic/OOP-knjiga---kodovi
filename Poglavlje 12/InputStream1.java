import java.io.*;    
public class InputStream1{  
	
	public static void main(String[] args) throws IOException {  
		
		InputStream ulaz = new FileInputStream("ulaz.txt");  
		
		int brojac = ulaz.available();  
		byte[] niz = new byte[brojac];  
		ulaz.read(niz);  
		for (byte b : niz) {   
			System.out.print(b + " ");  
		}  	
	}
}