package Part2;

import java.util.Scanner;

public class Q2_InserElementInArray {

	
	private static void insertElement(int[] arr, int index, int element) {

        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0, j = 0; i <= newArr.length-1; i++, j++) {
            if (i == index) {
                newArr[i] = element;
                j--; // Decrement j to skip an iteration and leave the current element as default 0
            } else {
                newArr[i] = arr[j];
            }
        }
        
        for(int a: newArr) {
        	System.out.print(a+ " ");
        }
    }
	
	public static void main(String[] args) {
		
		
		int[] arr = {0,1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Give position where you want to insert element");
		int index = sc.nextInt();
		System.out.println("Input element you want to insert");
		int element = sc.nextInt();
		
		insertElement(arr,index,element);

	}


}
