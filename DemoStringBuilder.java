package apjfsa;

public class DemoStringBuilder {
//main method
	public static void main(String[] args) {
		// Creating a StringBuilder object
		StringBuilder strb=new StringBuilder("Hello world");
		System.out.println(strb);
		 // Getting the length of the StringBuilder
		System.out.println(strb.length());
		 // Finding the index of the first occurrence of "o
		System.out.println(strb.indexOf("o"));
		 // Converting StringBuilder to String
		String s=strb.toString();
		System.out.println(s);
		 // Creating a new StringBuffer object
		StringBuffer strb1=new StringBuffer(strb);
		System.out.println(strb1);
	}

}
