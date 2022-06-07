import java.io.*;
import java.util.*;
class Fact{
public static void main(String[] args){
Scanner io=new Scanner(System.in);
Fact f=new Fact();
System.out.println("Enter n:");
int n=io.nextInt();
int s=f.fact(n);
System.out.println("Factorial is:"+s);
}

public int fact(int n){
if(n>1){
return(n*fact(n-1));
}
else{
return 1;
}}}