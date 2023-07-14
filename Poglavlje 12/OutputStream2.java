import java.io.*;    
public class OutputStream2{  
	
	public static void main(String[] args) throws IOException {  
		
		OutputStream izlaz = new FileOutputStream("izlaz2.txt");  
		DataOutputStream strim = new DataOutputStream(izlaz);
		
		strim.writeShort(19777);
		strim.writeInt(1313230674);
		izlaz.close();	
	}
}