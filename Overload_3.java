import java.io.*;
import java.util.*;
class Overload_1{
public static void display(float l,float b){
System.out.println("Area of rectangle : "+l*b);
}
public static void display(double s){
System.out.println("Area of square : "+s*s);
}
public static void display(double h,double b){
System.out.println("Area of triangle : "+0.5*b*h);
}
}
class Overload_3{
public static void main(String args[]){
Scanner io=new Scanner(System.in);
Overload_1 obj=new Overload_1();
System.out.println("Enter length of rectangle : ");
float l=io.nextFloat();
System.out.println("Enter breadth of rectangle : ");
float b=io.nextFloat();
obj.display(l,b);
System.out.println("Enter side of square : ");
double side=io.nextDouble();
obj.display(side);
System.out.println("Enter height of triangle : ");
double h=io.nextDouble();
System.out.println("Enter base of triangle : ");
double b1=io.nextDouble();
obj.display(h,b1);
}
}