/*
Questions 1:
Create a class employee. Inside that class create three variable name,age,city. Also create a function to
display the three variables. In the main function create two objects and call the function using it.
Output:
The name is Saurab
The age is 23
The city is chennai */


class Employee{
    int age;
    String name,city;
	public void display() {
		System.out.println("The name is "+name);
		System.out.println("\nThe age is "+age);
		System.out.println("\nThe city is "+city);
	}
}
public class Assignment1 {
    public static void main(String[] args){
    Employee obj1 = new Employee();
    Employee obj2 = new Employee();
    obj1.name="DEV RAIKWAR";
    obj1.age=20;
    obj1.city="Gwalior MP";
    obj1.display();
    }
}
