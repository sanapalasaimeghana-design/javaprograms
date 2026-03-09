import java.util.*;
class primeno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
int n=sc.nextInt();
{
if(n<2)
System.out.println("no primeno");
else
{
for(int i=2;i<n;i++)
{if(isprime(i))
System.out.println("  "+ i);
}
}
}
}
public static Boolean isprime(int n)
{
if(n<2)
return false;
for(int i=2;i<=Math.sqrt(n);i++)
{
if(n%i==0)
return false;
}
return true;
}
}





