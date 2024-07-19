package apjfsa;

public class Demostring {

	public static void main(String[] args) {
		//string declaration using literal
		String name="Supriya";
		System.out.println(name);
		//defining string using constructor
		String college= new String("Avanthi Pg");
		System.out.println(college);
		//defining string using character array
		char[] courseName= {'M','C','A'};
		String course1=new String(courseName);
		System.out.println(course1);
		String courseName1="mca foundation";
		course1.concat("Foundation");
		System.out.println(college);
		//method finding the string at given position
		System.out.println(name.charAt(3));
		//method finding the  index of string
		System.out.println(name.indexOf('a'));
		System.out.println(college.indexOf('A'));
		//method finding the string length
		System.out.println(college.length());
		//method finding the string contains same string or not
		System.out.println(college.contains(name));
	
	
		
	}

}
