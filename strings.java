package Basics;

public class strings {
	public static void main(String[] args) {
		String name="BHUVI";
		String name2="bhuvi";
		char a=name.charAt(2);
		System.out.println(a);
		
		int b=name.indexOf("s");
		System.out.println(b);
		
		int c=name.lastIndexOf("n");
		System.out.println(c);
		
		int d=name.length();
		System.out.println(d);
		
		boolean e=name.isEmpty();
		System.out.println(e);
		
		boolean f=name.contains("df");
		System.out.println(f);
		
		String g = name.trim();
		System.out.println(g);
		
		String h = name.toUpperCase();
		System.out.println(h);
		
		String i = name.toLowerCase();
		System.out.println(i);
		
		boolean j = name.startsWith("He");
		System.out.println(j);
		
		boolean k = name.endsWith("an");
		System.out.println(k);
		
		boolean l= name.equals(name2);
		System.out.println(l);
		
		boolean m = name.equalsIgnoreCase(name2);
		System.out.println(m);
		
		String n= name.replaceAll("BHUVI", "bhuviii");
		System.out.println(n);
		
		String O= name.replace("I", "O");
		System.out.println(O);
		
		String p=name.substring(2);
		System.out.println(p);
		
		String q=name.substring(1, 3);
		System.out.println(q);
		
		int s=name.compareTo(name2);
		System.out.println(s);
		
		
		
		
	}

}
