import java.util.Scanner;
public class Doctor extends Employee{
    private	int no_of_surgery_conducted;
    private	String speciality;
    Scanner sc=new Scanner(System.in);
        void getdetails1() {
            System.out.println("Enter speciality ");
            this.speciality=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter no of operations conducted");
            this.no_of_surgery_conducted=sc.nextInt();
        
        }
        void displaydetails1() {
            System.out.println("No. of surgery :"+this.no_of_surgery_conducted);
            System.out.println("Speciality:"+this.speciality);
        
        }
    }
