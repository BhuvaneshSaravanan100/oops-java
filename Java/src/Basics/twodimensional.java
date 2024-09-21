package Basics;

public class twodimensional {
	public static void main(String[] args) {
		int a [][] = new int [3][3];
		a[0][0]=10;
		a[0][1]=45;
		a[0][2]=84;
		a[1][0]=87;
		a[1][1]=57;
		a[1][2]=87;
		a[2][0]=65;
		a[2][1]=47;
		a[2][2]=12;
		
		
		
		for(int[]b:a) {
			for(int c:b) {
				System.out.println(c);
			}
		}        
	}
}       

	
		
		
		
	

