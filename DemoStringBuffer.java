package apjfsa;

public class DemoStringBuffer {
//main method
	public static void main(String[] args) {
		StringBuffer strbuff=new StringBuffer("Anudip");
		System.out.println(strbuff);
        strbuff.append("Foundation");
        System.out.println(strbuff);
     // Reversing the content of the StringBuffer
        System.out.println(strbuff.reverse());
        // Getting the character at index 3
       System.out.println(strbuff.charAt(3));
       // Finding the index of the first occurrence of "s"
       System.out.println(strbuff.indexOf("s"));
       // Getting the capacity of the StringBuffer
       System.out.println(strbuff.capacity());
    // Creating a new StringBuffer object
       StringBuffer strb=new StringBuffer("Advance program  on java fullstack using Angular");
       // Getting the capacity of the new StringBuffer
       System.out.println(strb.capacity());
       // Deleting the character at index 14 from the StringBuffer
        strb.deleteCharAt(14);
        System.out.println(strb);
        // Comparing the two StringBuffers 
        System.out.println(strb.compareTo(strbuff));
	}

}
