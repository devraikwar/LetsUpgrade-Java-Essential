// Question 3:
// In the main method create an array of objects for three of them get the details and print for all the objects

public class Printall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] ar1=new Employee[3];
		for(int i=0;i<=2;i++) {
			ar1[i]=new Employee();
			ar1[i].getdetails();
		}
	
		for(int i=0;i<=2;i++) {
			ar1[i].displaydetails();
		}	
	}
}
