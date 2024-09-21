package polymoriphsm;

public class methodover {
 
		private void empdata(String name) {
			System.out.println("emp name is"+name);
			this.empdata(10);
			this.empdata('a');
			
		}
		private void empdata(int age) {
			System.out.println("emp age is"+age);
		}
		public static void main(String[] args){
			methodover a=new methodover();
			a.empdata("bhuvi");
			
			
		}
	}
	  
}
