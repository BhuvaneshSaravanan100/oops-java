package Basics;

public class array {
	public static void main(String[] args) {
		String a [][] = new String [3][3];
		a[0][0]="bhuvi";
		a[0][1]="kamaraj";
		a[0][2]="jaiko";
		a[1][0]="hinata";
		a[1][1]="naruto";
		a[1][2]="kakashi";
		a[2][0]="madara";
		a[2][1]="rin";
		a[2][2]="tobi";
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			System.out.println(a[i][j]);
			
		}
	}

}
	}
