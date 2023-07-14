import java.util.*;

class Graf{
	
	HashMap<Integer, TreeSet<Integer>> graf;
	int v;
	
	
	public Graf(int n)
	{
		
		v = n;
		graf = new HashMap<Integer, TreeSet<Integer>>();
		for(int i = 0; i < v; i++)
		{
			graf.put(i, new TreeSet<Integer>());
		}
	}
	
	public void dodajGranu(int u, int w)
	{
		
		//dodavanje grane od u do w
		graf.get(u).add(w);
		
		// dodavanje grane od w do u
		graf.get(w).add(u);
	}
	
	public void ispisGrafa()//ispis grafa
	{
		for(int i = 0; i < v; i++)
		{
			System.out.println("Lista susjeda cvora: " + i);
			Iterator set = graf.get(i).iterator();
			
			while (set.hasNext())
			System.out.print(set.next() + " ");
			
			System.out.println();
		}
	}
	
	// metoda koja ispituje da li su dva cvora susjedi
	public void traziGranu(int u, int w)
	{
		Iterator set = graf.get(u).iterator();
		
		if (graf.get(u).contains(w))
			System.out.println("Postoji grana od cvora " + u + " do cvora " + w + ".");
		else
			System.out.println("Ne postoji grana od cvora " + u + " do cvora " + w + ".");
		
	}
	
}

public class Graf1{
	public static void main(String[] args)
	{
		// Kreiranje jednostavnog grafa
		
		Graf graf = new Graf(5);
		
		graf.dodajGranu(0, 1);
		graf.dodajGranu(0, 4);
		graf.dodajGranu(1, 2);
		graf.dodajGranu(1, 3);
		graf.dodajGranu(1, 4);
		graf.dodajGranu(2, 3);
		graf.dodajGranu(3, 4);
		
		// ispis grafa
		graf.ispisGrafa();
		
		// ispitivanje da li je grana prisutna u grafu
		graf.traziGranu(2, 1);
		graf.traziGranu(0, 3);
	}
}