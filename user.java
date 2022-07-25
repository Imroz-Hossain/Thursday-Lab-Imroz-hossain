package oopsdemo;
//super/parent/base
class User {
	
	int id;
	String name,address;
	public void setdata(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Id: "+this.id);
		System.out.println("name: "+this.name);
	    System.out.println("Address: "+this.address);	
	}
	 class Employee extends User
	 {
		 double Salary;
		 String designation;
		 
		 public void setData(int id,String name,String address,double Salary,String desingnation)
		 {
			 super.setdata(id, name, address);
			 this.Salary=Salary;
			 this.designation=designation;
			 
		 }
		 public void display()
		 {
			 super.display();
			 System.out.println("Salary: "+this.Salary);
			 System.out.println("designation: "+this.designation);
		 }
		 public class SingleInheritanceDemo
		 {
			 public static void main(String[] args) {
			 Employee emp=new Employee();
			emp.setData(103, "imroz","Hooghly", 25000, "SE");
			 emp.display();
		// emp.setdata(102, "zidan","chuchurah" );
		// emp.display();
			 }
		 }
	 }
}
			 
		 
	 


		

	

	 

