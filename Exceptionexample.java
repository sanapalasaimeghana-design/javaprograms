import java.util.*;
class InvalidAgeException extends Exception
{
InvalidAgeException(String message)
{
super(message);
} 
}
class Exceptionexample
{
static void checkAge(int age) throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("error:not eligible for vote");
}
else
{
System.out.println("eligible for vote");
}
}
public static void main(String args[])
{
try{
Scanner sc=new Scanner(System.in);
System.out.println("enter a,b values");
int a=sc.nextInt();
int b=sc.nextInt();
int c=a/b;
System.out.println("result:"+c);
int age=sc.nextInt();
checkAge(age);
}
catch(ArithmeticException e)
{
System.out.println("error:ArithmeticException"+e.getMessage());
}
catch(InvalidAgeException e)
{
System.out.println("error:InvalidAgeException"+e.getMessage());
}
catch(Exception e)
{
System.out.println("error:genaral error");
}
finally
{
System.out.println("error:genaral error");
}
}
}
