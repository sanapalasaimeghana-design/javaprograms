import java.util.*;
class recursivittiretivefact
{
 double resursivefact(int n)
 {
  if(n==1 || n==0)
{
  return 1;
}
  else
{
  return n*resursivefact(n-1);
}
 }

double ittiretivefact(int m)
 {
   if(m==1||m==0)
  {
   return 1;
  }
   else
   { 
    int fact=1;
    for(int i=1;i<=m;i++)
    {
     fact=fact*i;
    }
return fact;
   }
}
public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
System.out.println("enter o value");
int o=sc.nextInt();
recursivittiretivefact obj=new recursivittiretivefact();
//recursivfact obj=new recursivfact();
//ittiretivefact obj=new ittiretivefact();
System.out.println("resursivefact:"+obj.resursivefact(o));
System.out.println("ittiretivefact:"+obj.ittiretivefact(o));
 }
}



