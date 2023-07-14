class Niz1{  
	
	static int min_indeks(int[]  niz){  
		
		int min = 0;  
		for(int i=1; i < niz.length;i++)  
			if(niz[min] > niz[i])  
				min = i;  
		return min;
	} 	
	public static void main(String args[]){  
		
		int brojevi[] = {125, 20, 4, 57}; 
		String s = "informatika"; 
		char [] slova = new char[s.length()];
		
		for(int i = 0; i < slova.length;i++)
		slova[i] = (char)(s.charAt(i) - 32);
		
		int indeks = min_indeks(brojevi);
		System.out.println("Najmanji element niza brojevi je " + brojevi[indeks]);    
		for (int i = 0; i < slova.length;i++)
			System.out.print(slova[i]);
		System.out.println();
	}  
}