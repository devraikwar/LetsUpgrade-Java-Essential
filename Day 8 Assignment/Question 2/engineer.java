// Question 2:
// Create three child classes one for the doctor, one for an engineer, and one for pilots and include
// their different operations in respective classes.

import java.util.Scanner;
public class Engineer extends Employee{
    private	String Stream;
    private int no_of_projects_workedon;
    Scanner sc=new Scanner(System.in);
    void getdetails1() {
        System.out.println("Enter no of projects worked on ");
        this.no_of_projects_workedon=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Stream");
        this.Stream=sc.nextLine();
    
    }
    void displaydetails1() {
        System.out.println("-------------------------------");
        System.out.println(" Stream :"+this.Stream);
        System.out.println(" No of projects worked on :"+this.no_of_projects_workedon);
        System.out.println("-------------------------------");
    }
    }
