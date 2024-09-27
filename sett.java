package Basics;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sett {
	public static void main(String[] args) {
		HashSet  a= new HashSet();
		a.add(10);
		a.add(true);
		a.add("bhuvi");
		a.add(10);
		a.add(10.5);
		System.out.println(a);
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------   HASHSET");
		
		LinkedHashSet  ab= new LinkedHashSet ();
	    ab.add(100);    
		ab.add(false);
		ab.add("bhuviiiiiiiiiii");
		ab.add(100);
		ab.add(10.7885);
		System.out.println(ab);
		
		
		System.out.println("------------------------------------------------------------------------------------------------------------LINKED HASHSET ");
		
		TreeSet  ac= new TreeSet ();
	    ac.add(10);    
		ac.add(54);
		ac.add(548);
		ac.add(4587);
		ac.add(10248769);
		System.out.println(ac);
		
		
   
		System.out.println("-------------------------------------------------------------------------------------------------------------TREE SET ");
		
		
		for(Object b:a) {
			System.out.println(b);
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------------HASH SET ITERRATE ");
		
		for(Object b:ab) {
			System.out.println(b);
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------LINKED HASH SET ITERRATE ");
		
		for(Object b:ac) {
			System.out.println(b);
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------TREE MAP SET ITERRATE ");
		
		
		
	
		
	}

}
