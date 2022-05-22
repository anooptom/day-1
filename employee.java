import java.util.Scanner;

class employee{

int id,salary;
String name;

public static void main(String args[]){

System.out.print("Enter Number of Employes:");
Scanner io=new Scanner (System.in);
int n = io.nextInt();

employee e[]=new employee[n];

for(int i=0;i<n;i++){
e[i] = new employee();

System.out.println("Enter details of "+(i+1) +" Employee:");
System.out.print("Name:");
e[i].name = io.next();

System.out.print("Id:");
e[i].id = io.nextInt();

System.out.print("Salary:");
e[i].salary = io.nextInt();
}

System.out.println("Details of All employees: \n");
System.out.println("Emp Id          Name          Salary");
for(int i=0;i<n;i++)
System.out.println(e[i].name + "            " + e[i].id + "            " + e[i].salary);

}
}

