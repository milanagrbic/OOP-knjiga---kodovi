import java.util.*;

public class PriorityQ1 {
	public static void main(String[] args)
	{
		
		PriorityQueue<Integer> red = new PriorityQueue<Integer>();
		
		// Dodavanje elemenata
		red.add(20);
		red.add(124);
		red.add(230);
		red.add(35);
		red.add(145);
		red.add(50);
		
		System.out.println("Elementi reda sa prioritetom su: " + red);
		
	}
}