package apjfsa;

public class Methodoverloading {
	//Method to calculate the area of a square

	void area(int a) {
		int area=a*a;
		System.out.println("area of Square:"+area);
	}
	//Method to calculate the area of a rectangle

    void area(int l,int b) {
	int  area=l*b;
	System.out.println("area of rectangle:"+area);
	
    }
    
     
public static void main(String args[]) {
	Methodoverloading method=new Methodoverloading();
	method.area(5); //calculate area of a square
	method.area(8,5); //calculate area of a rectangle
}

}
