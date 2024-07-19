package apjfsa;

public class BubbleSort {

	public static void main(String[] args) {
		 int arr[]= {1,5,3,8,9};
		 int i,j;
		 for(i=0;i<arr.length;i++) {
			 for(j=0;j<arr.length-i-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
				 }
			 }
		 } 
		 System.out.println("sorted array");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
	}
}
