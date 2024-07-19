package apjfsa;

public class SorttingArray {

	public static void main(String[] args) {
		int arr[]= {15,48,39,42,20,90};
		int i=0;
		int j=0;
		
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length -i-1;j++) {
				if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				}
			}
			
		}
		
			
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
	}
}
