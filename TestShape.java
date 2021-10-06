import java.io.*;
import java.util.*;

class shape
{
int a,b;
void peri(int a,int b)
{
int r=2*(a+b);
System.out.println("Perimeter of rectangle = "+r);
}
void peri(int a)
{
int s=4*a;
System.out.println("Perimeter of square = "+s);
}
void cir(int a)
{
double c=2*3.14*a;
System.out.println("Circumference of circle = "+c);
}
}

public class TestShape
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
shape ob=new shape();
System.out.println("Enter the length and breadth of rectangle : ");
a=sc.nextInt();
b=sc.nextInt();
ob.peri(a,b);
System.out.println("Enter the side of square : ");
a=sc.nextInt();
ob.peri(a);
System.out.println("Enter the area of circle : ");
a=sc.nextInt();
ob.cir(a);
}
}
