package apjfsa;
//class declaration
public class DuplicateValue {
//main-function
	public static void main(String[] args) {
		//assingning values
		int [] array= {1,2,3,4,5,2,3,1,5};
		int count=0;
		//accesing array elements
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if (array[i]==array[j]) {
					
					
					System.out.println(array[j]);
					count++;
					if (count>1) {
						System.out.println(array[i]+"is repeated"+ count +"times");
					}
					
				}
			}
		
			
		}
		System.out.println(count);
		
		
	}

}
