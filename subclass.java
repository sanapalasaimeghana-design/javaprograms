class person
{
String name="meghana";
}
class student extends person
{
int rollnum=100;
void display()
{
System.out.println("name:"+name);
System.out.println("roll no:"+rollnum);
}
}
class subclass
{
public static void main(String args[])
{
student obj=new student();
obj.display();
}
}
