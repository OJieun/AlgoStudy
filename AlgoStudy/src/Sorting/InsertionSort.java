package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		
		System.out.println("input : " + str);
		String[] strArr = str.split(" ");
		
		int[] arr = new int[strArr.length];
		
		for(int i=0; i< arr.length; i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		sorting(arr);
		printing(arr);
	}

	
	public static void sorting(int[] arr){
		//1번 index부터 시작.
		//i-1번 -> 0번 index 비교해가며 자기자리 찾아가기
		
		for(int keyIdx=1; keyIdx<arr.length; keyIdx++){
			int key = arr[keyIdx];
			int j = keyIdx-1;
			
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j --;
			}
			arr[j+1] = key;
			printing(arr);
			System.out.println();
		}
		
	}
	
	public static void printing(int[] arr){
		System.out.println("output : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}
}
