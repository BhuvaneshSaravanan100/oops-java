package polymoriphsm;
//same class
//same method

public class methodoverloading {
	private void studdet(String name,int a) {
		System.out.println("student name:"+name +"\n"+"stud age"+a);
	}
	private void studdet(int age,String d){
		System.out.println("studentid"+age+"\n"+"stud name"+d);
	}
	//different arguments
	public static void main(String[] args){
		methodoverloading a= new methodoverloading();
		a.studdet("bhuvi",2021);
		a.studdet(21,"viswa");
		   
	

}
	}
   