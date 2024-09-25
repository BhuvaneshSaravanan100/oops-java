package Basics;
import java.util.ArrayList;
import java.util.List;
import java.util.List();
public class lstclass {
	public static void main(String[] args) {
		List a =new ArrayList();
		a.add(10);
		a.add(true);
		a.add("bhuvi");
		a.add(10);
		a.add(10.5);
		int aa=a.size();
		System.out.println(aa);
		boolean bb=a.contains(true);
		System.out.println(bb);
		Object cc=a.get(5);
		System.out.println(cc);
		System.out.println(a);
		
		
		//for (int i=0;i<a.size();i++)
			//System.out.println(a.get(i));
	}
	

}
