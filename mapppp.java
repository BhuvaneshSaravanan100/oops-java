package Basics;



import java.util.*;







public class mapppp {

      public static void main(String[] args) {

    	  

    	// HashMap--random order  

	    Map<String,Integer> m = new HashMap<>();

		 m.put("bhuvi",1);

		 m.put("Kamarj",2);

		 m.put("dhiwakar",3);

		 m.put("kavi",4);

		 m.put("arul",5);

		

		System.out.println(m);

		

		System.out.println("-------------------------");

    	

    	// LinkedHashMap--insertion order

        Map<String,Integer> m1 = new LinkedHashMap<>();

   		 m1.put("bhuvi",1);

  		 m1.put("kamarj",2);

  		 m1.put("dhiwakar",3);

  		 m1.put("kavi",4);

  		 m1.put("arul",5);

  		

  		System.out.println(m1); 

  		

  		System.out.println("--------------------------");

    	  

    	 // TreeMap--ascending order

    	 Map<String,Integer> m2 = new TreeMap<>();

    	  m2.put("bhuvi",1);

    	  m2.put("Kamarj",2);

    	  m2.put("dhiwakar",3);

    	  m2.put("kavi",4);

    	  m2.put("Arul",5);

    		

        System.out.println(m2);

        

        System.out.println("---------------------------");

  		

        //Hashtable--random order

        Map<String,Integer> m3 = new Hashtable<>();

  	      m3.put("bhuvi",1);

  	      m3.put("Kamaraj",2);

  	      m3.put("dihwakar",3);

  	      m3.put("kavi",4);

  	      m3.put("Arun",5);

  		

        System.out.println(m3); 

        

        System.out.println("----------------------------");

		

		//Methods of Map

		int size = m1.size();

		System.out.println(size);

		

		boolean containsKey = m1.containsKey("bhuvi");

		System.out.println(containsKey);

		

		boolean containsValue = m1.containsValue(0);

		System.out.println(containsValue);

		

		m1.remove("arul");

		System.out.println(m1);

		

		Set<String> keySet = m1.keySet();

		System.out.println(keySet);

		

		Collection<Integer> values = m1.values();

		System.out.println(values);

		

		System.out.println("-----------------------------");

		

		Set<Entry<String, Integer>> entrySet = m1.entrySet();

		for(Entry<String,Integer> e:entrySet) {

			System.out.println(e);

			System.out.println(e.getKey());

			System.out.println(e.getValue());

		}

		

	}

}



