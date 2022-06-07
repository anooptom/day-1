import java.io.*;

import java.util.*;

class GCD{

public static void main(String[] args){

Scanner io=new Scanner(System.in);

GCD g=new GCD();

System.out.println("Enter a:");

int a=io.nextInt();

System.out.println("Enter b:");

int b=io.nextInt();

System.out.println("GCD("+a+","+b+")="+g.gcd(a,b));

}


public int gcd(int a,int b){

if(b==0){

return a;

}

else{

return(gcd(b,a%b));

}

}}