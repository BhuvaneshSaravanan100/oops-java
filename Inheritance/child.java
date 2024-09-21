//create package
package Inherutance1;
//craete class

public class child extends parent{
	//create method
	private void childid() {
		System.out.println("child id is9874562");    
		
	}
	private void childname() {
		System.out.println("childname is bhuvi");
		
	}
	public static void main (String[]args) {
		child a=new child();
		a.parname();
		a.parid();
		a.childid();
		a.childname();
		a.grandid();
		a.grandname();
		
	}

}
