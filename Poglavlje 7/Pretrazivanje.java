public class Pretrazivanje{
		
	public static boolean linearnaPretraga (Comparable [] niz, Comparable x){
			
		for(int i = 0; i < niz.length; i++)
			if(niz[i].compareTo(x) == 0)
				return true;
			
		return false;		
	}
		
	public static boolean binarnaPretraga (Comparable [] niz, Comparable x){
			
		int min = 0, max = niz.length - 1, sredina = 0;
		boolean pronadjen = false;	
			
		while (!pronadjen && min <= max){
			sredina = (min+max) / 2;
			if (niz[sredina].compareTo(x) == 0)
				pronadjen = true;
			else
				if (x.compareTo(niz[sredina]) < 0)
					max = sredina - 1;
				else
					min = sredina + 1;
		}
		return pronadjen;
			
	}
}