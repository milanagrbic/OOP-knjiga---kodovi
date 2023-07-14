import java.util.Scanner;
public class TackeRastojanje{
	static Scanner sken = new Scanner(System.in);
	static double rastojanje(Tacka t1, Tacka t2)
	{
		return Math.sqrt(Math.pow(t1.getX() - t2.getX(),2) + Math.pow(t1.getY() - t2.getY(),2));
	}
	static double minimalno(Tacka[] niz){
		double min = rastojanje(niz[0],niz[1]);
		for(int i = 0; i < niz.length-1; i++)
			for(int j = i+1; j < niz.length; j++)
			{
				double r = rastojanje(niz[i],niz[j]);
				if(r < min)
					min = r;
			}
		return min;
	}
	static void unos(Tacka[] niz){
			
		for(int i = 0; i < niz.length; i++)
		{
			System.out.print("Unesi x koordinatu " + i + ". tacke:");
			int x = sken.nextInt();
			System.out.print("Unesi y koordinatu " + i + ". tacke:");
			int y = sken.nextInt();
			Tacka t = new Tacka();
			t.setX(x);
			t.setY(y);
			niz[i] = t;
		}
	}
	public static void main(String[] args){
			
		System.out.print("Unesi broj tacaka:");
		int n = sken.nextInt();
				
		Tacka[] niz = new Tacka[n];	
		unos(niz);
		double rezultat = minimalno(niz);
		System.out.println("Najkrace rastojanje je: " + rezultat);
	}
}