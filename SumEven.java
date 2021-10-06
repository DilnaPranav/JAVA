import java.io.*;
import java.util.*;
public class SumEven
{
public static void main(String arg[])
{
int x,a,n,sum=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of digits : ");
n=sc.nextInt();
System.out.println("Enter the Number : ");
x=sc.nextInt();
for(i=0;i<n;i++)
{
a=x%10;
if(a%2==0)
{
sum=sum+a;
}
x=x/10;
}
System.out.println("sum of even digits in the number is : "+sum);
}
}
