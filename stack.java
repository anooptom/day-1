import java.util.Scanner;

class stack {
	
	static int st[],top=-1;
	
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
		
		for (int i=0;i<top;i++)
		System.out.print("Stack : " + st[i]);
	}
		
	
	public static void main(String args[]){

		System.out.print("Enter number of elements:");
		Scanner io=new Scanner(System.in);
		int n = io.nextInt();

		stack o =new stack();
		
		for(int i=0;i<n;i++){
			o.push();
		}
		
		boolean t=true;
		
		while(t){
		
		System.out.println("\n1.Push \n2.Pop \n3.Display \n4.Exit");
		System.out.print("Enter your choice:");
		int ch= io.nextInt();
		
		switch(ch){
		
			case 1 : o.push();
				 o.display();
				 break;
				 
			case 2 : o.pop();
				 o.display();
				 break;
				 
			case 3 : o.display();
				 break;
				 
			case 4: System.exit(0);
			
		}}
	}
}
