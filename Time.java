import java.io.*;
import java.util.*;

class Time
{
int hour,minute,second;
String post;

Time(int h,int min,int s,String p)  
{
hour=h;
minute=min;
second=s;
post=p;
}

Time(int h,int min,String p,int s)  
{
   hour=h;
   minute=min;
   second=s;
   post=" ";
}


public static void main(String args[])
{
   int hr,sec,m;
   String po;
   Scanner io=new Scanner(System.in);
   System.out.println("Enter the hour:");
   hr=io.nextInt();
   System.out.println("Enter minute:");
   m=io.nextInt();
   System.out.println("Enter second:");
   sec=io.nextInt();
   System.out.println("Enter the post:");
   po=io.next();
   Time t1=new Time(hr,m,sec,po);
   System.out.println("12hr format "+t1.hour+" : "+t1.minute+" : "+t1.second+" : "+t1.post);
   Time t2=new Time(hr,m,po,sec);
   
   if(po.equals("pm"))
   {
   t2.hour=t2.hour+12;
   }
   System.out.println("24hr format "+t2.hour+" : "+t2.minute+" : "+t2.second);
   }
}
