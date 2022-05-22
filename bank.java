import java.util.Scanner;

class bank{

	String name;
	int id,bal;

	void setter(){
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter the details:");
		System.out.print("Name:");
		this.name=c.next();
		
		System.out.print("Id:");
		this.id=c.nextInt();
		
		System.out.print("Balance:");
		this.bal=c.nextInt();
	}
	
	void withdraw(){
			
			Scanner w = new Scanner(System.in);
				System.out.print("Enter withdraw Amount:");
				int amt=w.nextInt();
				
				if(this.bal >= amt){
					this.bal-=amt;
					System.out.println("Withdraw Successfull");
				}
				else
					System.out.println("Insuffient Fund!");
			}
	
	void deposit(){
		Scanner w = new Scanner(System.in);
				System.out.print("Enter deposit Amount:");
				int amt=w.nextInt();
				
				this.bal+=amt;
				System.out.println("Deposit Successfull");
				
			}	
	
	void display(){
		
				System.out.print("Name:" + this.name + "\nBal:" + this.bal);
	}
		

	public static void main(String args[]){

		System.out.print("Enter number of customers:");
		Scanner io=new Scanner(System.in);
		int n = io.nextInt();

		 bank o[]=new bank[n];

		for(int i=0;i<n;i++){
			o[i]= new bank();
			o[i].setter();
		}
		
		boolean t=true;
		
		while(t){
		
		System.out.println("\n1.Deposit \n2.Withdraw \n3.Display \n4.Exit");
		System.out.print("Enter your choice:");
		int ch= io.nextInt();
		
		switch(ch){
		
			case 1 : System.out.print("Enter id number:");
				 int c = io.nextInt();
				 
				 for(int i=0;i<n;i++)
					if (o[i].id == c){
				 	    o[i].deposit();}
				 break;
			case 2:  System.out.print("Enter id number:");
				 int x = io.nextInt();
				 
				 for(int i=0;i<n;i++)
					if (o[i].id == x){
				 	    o[i].withdraw();}
				 
				 break;
			
			case 3:  System.out.print("Enter id number:");
				 int z = io.nextInt();
				 
				 for(int i=0;i<n;i++)
					if (o[i].id == z){
				 	    o[i].display();}
			         
				 break;
			case 4:  t=false;
		}
		
	}}
}
		
