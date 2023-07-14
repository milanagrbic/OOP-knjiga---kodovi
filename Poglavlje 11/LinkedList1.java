import java.util.*;  
public class LinkedList1{  
	public static void main(String args[]){  
		LinkedList<String> ll = new LinkedList<String>();  
		System.out.println("Pocetna lista: " + ll);  
		ll.add("Marko");  
		ll.add("Milica");  
		ll.add("Milan");  
		System.out.println("Poslije primjene add(E e) metode: "+ll);  
		//Dodavanje elementa na specificnu pozitiju          
		ll.add(1, "Aleksandar");  
		System.out.println("Poslije primjene add(int index, E element) metode: " + ll);  
		LinkedList<String> ll2=new LinkedList<String>();  
		ll2.add("Vukasin");  
		ll2.add("Sara");  
		//Dodavanje elemenata druge liste u listu
		ll.addAll(ll2);  
		System.out.println("Poslije primjene addAll(Collection<? extends E> c) metode: " + ll);  
		LinkedList<String> ll3 = new LinkedList<String>();  
		ll3.add("Bogdan");  
		ll3.add("Dimitrije");  
		//Dodavanje elemenata druge liste na specificnu poziciju  
		ll.addAll(1, ll3);  
		System.out.println("Poslije primjene addAll(int index, Collection<? extends E> c) metode: " + ll);  
		//Dodavanje elementa na pocetnu poziciju 
		ll.addFirst("Ilija");  
		System.out.println("Poslije primjene addFirst(E e) metode: " + ll);  
		//Dodavanje elementa na posljednju poziciju 
		ll.addLast("Djura");  
		System.out.println("Poslije primjene addLast(E e) metode: " + ll);  
		
	}  
}