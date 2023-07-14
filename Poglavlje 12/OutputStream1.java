import java.io.*;    
public class OutputStream1 {  
	
	public static void main(String[] args) throws IOException {  
		
		OutputStream izlaz = new FileOutputStream("izlaz1.txt");  
		
		for (byte b = 65; b <= 90; b++)
			izlaz.write(b);
		izlaz.close();	
	}
}