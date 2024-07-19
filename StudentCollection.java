package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


  public class Student1 implements Comparable<Student> {
	 int Studentid;
	    String Studentname;
	     String StudentQualification;
	     public static void main(String[] args) {
	 	}
	 		    public Student1(int id, String name, String course) {
	 		        this.Studentid = id;
	 		        this.Studentname = name;
	 		        this.StudentQualification = course;
	 		    }

		
		    @Override
			public String toString() {
				return "Student [Studentid=" + Studentid + ", Studentname=" + Studentname + ", StudentQualification="
						+ StudentQualification + "]";
			}
		    
@Override
public int compareTo(Student o) {
	if(this.Studentname.compareTo(o.Studentname)<0)
	return -1;
	else if(this.Studentname.compareTo(o.Studentname)>0)
		return 1;
	else
		return 0;
}
	}


public class StudentCollection {

	


	public static void main(String[] args) {
List<Student>list=new ArrayList<Student>();
//Adding students to the list
list.add(new Student(134,"amar","Bsc"));
list.add(new Student(116, "yavar","Bcom"));
list.add(new Student(123,"supriya","Btech"));
list.add(new Student(169,"ziya","BE"));
Student s=new Student(411,"veena","BCA");
list.add(s);
for(Student s1:list) {
	System.out.println(s1);

}
// Sorting students based on their names
Collections.sort(list);
for(Student s1:list) {
	// Printing students after sorting
	System.out.println(s1);

}
	}

}
