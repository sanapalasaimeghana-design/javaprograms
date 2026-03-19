import java.util.*;
class oneDarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[3];
System.out.println("enter array elaments:");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("array elaments are:");
for(int i=0;i<a.length;i++)
{
System.out.println(" "+a[i]);
}
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("sum:"+sum);
{
double avg=(sum/a.length);
System.out.println("avg:"+avg);
}
}
}

