package LetsUpgradeAssignments;
  class Employee {
	String name;
	int age;
	String city;
	public void display() {
		System.out.println("Name of the Employee is "+name+"\n"+"Age of the Employee is "+age+"\n"+"City of the Employee is "+city);
	}
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Akshi";
		e.age=25;
		e.city="Delhi";
        e.display();      
        Employee e1=new Employee();
        e1.name="Ashish";
		e1.age=30;
		e1.city="Noida";
		e1.display();
		
		
		

	}

}
