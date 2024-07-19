package com.collection;

public class Student implements Comparable<Student> {
	 int Studentid;
	    String Studentname;
	     String StudentQualification;
	     public static void main(String[] args) {
	 	}
	 		    public Student(int id, String name, String course) {
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
