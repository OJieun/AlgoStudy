package Sorting;

import java.util.Scanner;

public class SelectionSort2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr;
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		
		System.out.println("input : " + inputStr);
		
		strArr = inputStr.split(" ");
		
		int[] arr = new int[strArr.length];
		for(int i=0; i<strArr.length; i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		System.out.println();
		sorting(arr);
		printing(arr);
		
	}

	
	public static void sorting(int[] arr){
		
		for(int i=0; i<arr.length; i++){
			int minIdx = i;
			
			for(int j=i+1; j<arr.length; j++){
				if (arr[j]<arr[minIdx]){
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp; 
		}
		
	}
	
	public static void printing(int[] arr){
		System.out.println("output : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}
}
