abstract class caliculate
{
abstract double disply();
}
class circle
{
int radies;
circle(int r)
{
radies=r;
}
double disply()
{
return 3.14*3.14*radies;
}
}
class rectangle
{
int length;
int weidth;
rectangle(int l,int w)
{
length=l;
weidth=w;
}
double disply()
{
return length*weidth;
}
}
class abstractexample
{
public static void main(String args[])
{
circle c1=new circle(3);
rectangle r1=new rectangle(3,4);
System.out.println(c1.disply());
System.out.println(r1.disply());
}
}