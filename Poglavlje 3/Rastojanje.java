import java.util.Scanner;

public class Rastojanje{
	public static void main(String[]args){
		
		Scanner sken = new Scanner(System.in);
		
		//koordinate prve tacke A
		double xA, yA;
		System.out.println("Unesite koordinate tacke A:");
		xA = sken.nextDouble();
		yA = sken.nextDouble();
		
		//koordinate druge tacke B
		double xB, yB;
		System.out.println("Unesite koordinate tacke B:");
		xB = sken.nextDouble();
		yB = sken.nextDouble();
		
		double rastojanje = Math.sqrt(Math.pow(xA-xB,2) + Math.pow(yA-yB,2));
		
		System.out.println("A=(" + xA + "," + yA + ")");
		System.out.println("B=(" + xB + "," + yB + ")");
		System.out.printf("d(A,B) = %.2f\n",rastojanje);
	}
}