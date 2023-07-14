import java.io.*;    
public class InputStream2 {  
	
	public static void main(String[] args) throws IOException {  
		
		InputStream ulaz = new FileInputStream("ulaz.txt");  
		
		DataInputStream strim = new DataInputStream(ulaz); 
		
		byte b = strim.readByte();
		System.out.println(b);
		int br = strim.readInt();
		System.out.println(br);
		short sh = strim.readShort();
		System.out.println(sh);	
	}
}