import java.util.*;
class acess
{
int var=10;
public int publicvar=20;
private int privatevar=30;
protected int protectedvar=40;
void display()
{
System.out.println("default modifier:"+var);
System.out.println("public modifier:"+ publicvar);
System.out.println("private modifer:"+ privatevar);
System.out.println("protected modifer"+protectedvar);
}
}
class accesscontrol
{
public static void main(String args[])
{
acess obj=new acess();
System.out.println("default modifier:"+obj.var);
System.out.println("public modifier:"+obj.publicvar);
//System.out.println("private modifer:"+obj.privatevar);
System.out.println("protected modifer"+obj.protectedvar);
obj.display();
}
}