package Sorting;

public class HeapSort {

	private int[] heap;
	private int size;
	
	private int leftChild(int pos){
		return 2*pos;
	}
	private int rightChild(int pos){
		return  2*pos+1;
	}
	private boolean isLeaf(int pos){
		if(pos>=size/2 && pos<=size){
			return true;
		}
		return false;
	}
	private void swap(int pos1, int pos2){
		int temp = heap[pos1];
		heap[pos1] = heap[pos2];
		heap[pos2] = temp;
	}
	
	private void maxHeapify(int pos){
		if(!isLeaf(pos)){
			if(leftChild(pos) <= size && heap[pos]<heap[leftChild(pos)]){ //왼쪽 자식이 더 큰 경우,
				swap(pos, leftChild(pos));
				maxHeapify(leftChild(pos));
				printHeap();
			}
			if(rightChild(pos) <= size && heap[pos]<heap[rightChild(pos)]){//우측 자식이 더 큰 경우
				swap(pos, rightChild(pos));
				maxHeapify(rightChild(pos));
				printHeap();
			}
		}
	}
	private void buildMaxHeap(){
		for(int pos=heap.length/2; pos>0; pos--){
			maxHeapify(pos-1);
		}
	}
	
	private void Sorting(){
		for(int i= size; i>0; i--){
			swap(0, size-1);
			size --;
			buildMaxHeap();
		}
	}
	
	//생성자
	public HeapSort(int[] arr){
		this.heap = arr;
		this.size = arr.length;
	}
	public static void main(String[] args) {
		int[] arr = {4, 1, 8, 2, 10, 9 , 3, 5};
		HeapSort heap = new HeapSort(arr);

		System.out.println("---------------------MaxHeap 만들기 -------------------");
		heap.buildMaxHeap();

		System.out.println("----------------정렬 시작-------------------");
		heap.Sorting();
	}
	
	private void printHeap(){
		for (int i=0; i<heap.length; i++) {
			System.out.print(heap[i] + ", ");
		}
		System.out.println();
	}

}
