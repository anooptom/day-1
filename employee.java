import java.util.Scanner;

class employee{

	int id,salary;
	String name;

	void read(){

		Scanner i =new Scanner (System.in);

		System.out.println("Enter details of  Employees:");
		System.out.print("Name:");
		this.name = i.next();

		System.out.print("Id:");
		this.id = i.nextInt();

		System.out.print("Salary:");
		this.salary = i.nextInt();
	}

	void display(){

		System.out.println(this.name + "            " + this.id + "            " + this.salary);
	}

	public static void main(String args[]){

		System.out.print("Enter Number of Employes:");
		Scanner io=new Scanner (System.in);
		int n = io.nextInt();

		employee e[]=new employee[n];

		for(int i=0;i<n;i++){
			e[i] = new employee();
			e[i].read();
		}

		System.out.println("Details of All employees: \n");
		System.out.println("Emp Id          Name          Salary");

		for(int i=0;i<n;i++)
			e[i].display();

	}
}

