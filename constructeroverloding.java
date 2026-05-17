import java.util.*;
class constructeroverloding
{
int age;
String name;
constructeroverloding()
{
age=0;
name="abc";
}
constructeroverloding(int a)
{
age=a;
}
constructeroverloding(int a,String n)
{
age=a;
name=n;
}
void display()
{
System.out.println("age:"+age+"name:"+name);
}
public static void main(String args[])
{
constructeroverloding obj=new constructeroverloding(19,"meghana");
obj.display();
}
}