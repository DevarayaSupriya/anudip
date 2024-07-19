package apjfsa;

public class StudentMarks {

	public static void main(String[] args) {
		//assingning value
		int[] Marks= {50,50,20,80,55,90};
		int passedSubjects=0;
		int failedSubjects=0;
		int passingMarks=35;
		//accessing array elements
		for(int Mark:Marks) {
			if (Mark>=passingMarks) {
				passedSubjects++;
				
			}
			else {
				failedSubjects++;
			}
		}
		System.out.println("Number of subjects passed:"+passedSubjects);
		System.out.println("Number of subjects failed:"+failedSubjects);
		
	}
	}



