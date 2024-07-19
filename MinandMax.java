package apjfsa;
public class MinandMax {

	public static void main(String[] args) {
		int arr[]= {40,28,70,30,15};
		int Min=arr[0];
		int Max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(Min>arr[i])
		Min=arr[i];
		
		if(Max<arr[i])
		Max=arr[i];
		
		}
		System.out.println("Minimum Number is:"+Min);
		System.out.println("Maximum Number is"+Max);
	}

}
