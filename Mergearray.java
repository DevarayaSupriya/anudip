package apjfsa;

public class Mergearray {

	public static void main(String[] args) {
		int arr1[]= {9,4,6,3};
		int arr2[]= {2,5,7,1};
		int s=arr1.length;
		int p=arr2.length;
		int M=s+p;
		int i,j;
		int arr3[]=new int[M];
		
		for(i=0;i<s;i++) {
			arr3[i]=arr1[i];
			}
		for(j=0;j<p;j++) {
			arr3[s+j]=arr2[j];
		}
		System.out.println("merged Array:");
		for(i=0;i<M;i++) {
			System.out.println(arr3[i]+"");
		}
		
		
				}

}
