import java.io.*;
import java.util.*;
class Overload{
public static void display(int num){
System.out.println("Entered integer : "+num);
}
public static void display(String c){
System.out.println("Entered string : "+c);
}
public static void display(float num){
System.out.println("Entered float : "+num);
}
}
class Overload_2{
public static void main(String args[]){
Scanner io=new Scanner(System.in);
Overload o=new Overload();
System.out.println("Enter integer : ");
int num=io.nextInt();
o.display(num);
System.out.println("Enter string : ");
String c=io.next();
o.display(c);
System.out.println("Enter float : ");
float num1=io.nextFloat();
o.display(num1);
}
}