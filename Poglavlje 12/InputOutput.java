import java.io.*;    
 public class InputOutput {  
 	
 	public static void main(String[] args) throws IOException {  
 		
 		BufferedReader br = new BufferedReader(new FileReader("ulazna.txt"));
 		BufferedWriter bw = new BufferedWriter(new FileWriter("izlazna.txt"));
 		
 		boolean eof = false;
 		while(!eof)
 		{
 			String line = br.readLine();
 			if(line == null)//kraj datoteke
 			{
 				eof = true;
 				continue;
 			}
 			String[] rijeci = line.split(" ");
 			for(int i = rijeci.length - 1; i >= 0; i--)
 			{
 				bw.write(rijeci[i]);
 				if(i > 0) 
 					bw.write(" ");
 				else
	 				bw.write(".");
 			}
 			bw.newLine();
 		}
 		br.close();
 		bw.close();	
 	}
 }