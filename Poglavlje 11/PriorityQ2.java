import java.util.*;

public class PriorityQ2 {
	public static void main(String[] args){
		
		PriorityQueue<Tacka> red = new 	PriorityQueue<Tacka>(5, new TackaComparator());
		
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka();
		Tacka t3 = new Tacka();
		Tacka t4 = new Tacka();
		t1.setX(3);
		t1.setY(4);
		t2.setX(10);
		t2.setY(15);
		t3.setX(1);
		t3.setY(1);
		t4.setX(-40);
		t4.setY(11);
		red.add(t1);
		red.add(t2);
		red.add(t3);
		red.add(t4);
		
		System.out.println("Ispis tacaka iz reda sa prioritetom");
		while (!red.isEmpty()) {
			System.out.println(red.poll());
		}
	}
}

class TackaComparator implements Comparator<Tacka>{
	
	// nadjacavanje metode compare() interfejsa Comparator
	public int compare(Tacka t1, Tacka t2) {
		if (t1.getX() < t2.getX())
			return -1;
		else if (t1.getX() > t2.getX())
			return 1;
		return 0;
	}
}