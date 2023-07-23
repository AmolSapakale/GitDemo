package Part4;

import java.util.Scanner;

public class Q4_ReadMatrixFromConsole {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total rows");
		int rows = sc.nextInt();
		System.out.println("Enter total columns");
		int columns = sc.nextInt();
		
		int[][] arr  = new int[rows][columns];
		
		System.out.println("Enter all " + rows*columns + " elements");
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<columns;j++) {
				int element = sc.nextInt();
				arr[i][j]=element;
		}
	}
		//Print matrix
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+ " ");
		}
			System.out.println();
		}
	}
}
