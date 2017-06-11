package Sorting;


public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {5,7,3,2,1};
				
		for(int i=0; i<inputArr.length-1; i++){
			//정렬된 앞 부분
			System.out.println("------------  "+(i+1)+"번째 LOOP --------------");
			int min = inputArr[i];
			int keyPosition = i;
			System.out.println("시작최소값 : " + min);
			
			for(int j=i+1; j<inputArr.length; j++){
				//key를 찾는 부분(minimum값)
				
				if(inputArr[j] < min) {
					min = inputArr[j]; //최소값 최신버전 업데이트
					keyPosition = j;
					System.out.println("현 최소값 : " + min);
				}

			}
			//key값 찾은 후 자리바꾸기
			System.out.println(i+1 +"번째("+inputArr[i]+")와 "+(keyPosition+1)+"번째("+inputArr[keyPosition]+") 자리바꿈");
			
			int temp = inputArr[i];
			inputArr[i] = inputArr[keyPosition];
			inputArr[keyPosition] = temp;
			
			System.out.println("");
			
			for(int k=0; k<inputArr.length; k++){
				System.out.print(inputArr[k] + ", ");
				
			}
			System.out.println("\n");
		}
		
		System.out.println("-------------정렬 결과 출력 ------------");
		for(int i=0; i<inputArr.length; i++){
			System.out.print(inputArr[i] + ", ");
			
		}
	}

}
