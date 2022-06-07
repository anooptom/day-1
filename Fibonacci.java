import java.util.Scanner;

class Fibonacci
{
	static int recFib(int x)
	{	if (x>=0)
		{
			if (x==1||x==0)
				return 0;
			else if(x==2)
				return 1;
			else
				return recFib(x-1)+recFib(x-2);
		}
		else
			return -1;
	}
	
	static int nFib(int x)
	{	if(x==1)
			return 0;
		else if(x==2)
			return 1;
		else
		{	
			int prev1=0;
			int prev2=1;
			int res=0;
	
			for (int i=1;i<=x-2;i++)
			{	res=prev1+prev2;
				prev1=prev2;
				prev2=res;
			}
			
			return res;
		}
			
	}
	

	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int n=io.nextInt();
		int res=recFib(n);
		int nres=nFib(n);
		
		System.out.println(n+"th Fibonacci number is: ");
		System.out.println("By Reccursive Function:" + res );
		System.out.println("By Non Recursive Function: " + nres);
	}
}