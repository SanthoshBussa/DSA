package algorithms;
import java.util.Arrays;
public class Sortings {
	
	public static void main(String[] args) {
		int arr[] = {5, 2,-1, 0, 3 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	 
	public static void bubbleSort(int[] a) {
		for(int i =0; i<a.length; i++) {
			boolean swap = false;
			for(int j = 0; j<a.length-1-i; j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) return;
		}
	}
	
	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length; i++) {
			int minEleInd = i;
			boolean swap = false;
			for(int j = i+1; j<a.length; j++) {
				if(a[j]<a[minEleInd]) {
					int temp = a[minEleInd];
					a[minEleInd] = a[j];
					a[j] = temp;
					swap = true;
				}
			}
			if(!swap) return;
		}
	}
	
	public static void insertionSort(int[] a) {
		for(int i = 1; i<a.length; i++) {
			int j = i-1;
			int key = a[i];
			while(j>=0 && key < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
}