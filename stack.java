import java.util.Scanner;

class stack {
	
	static int st[]=new int[20];
	static int top=-1;
	
	static void push(){
		
		Scanner io = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		int num = io.nextInt();
		
		st[++top]=num;
	}
	
	static void pop(){
		
		if(top==-1)
			System.out.println("Underflow");
		
		else 
			top--;
	}
	
	static void display(){
		System.out.print("Stack : ");
		for (int i=0;i<=top;i++)
		System.out.print(st[i] + " ");
	}
		
	
	public static void main(String args[]){

		System.out.print("Enter number of elements:");
		Scanner io=new Scanner(System.in);
		int n = io.nextInt();

		
		for(int i=0;i<n;i++){
			push();
		}
		
		boolean t=true;
		
		while(t){
		
		System.out.println("\n1.Push \n2.Pop \n3.Display \n4.Exit");
		System.out.print("Enter your choice:");
		int ch= io.nextInt();
		
		switch(ch){
		
			case 1 : push();
				 display();
				 break;
				 
			case 2 : pop();
				 display();
				 break;
				 
			case 3 : display();
				 break;
				 
			case 4: System.exit(0);
			
		}}
	}
}
