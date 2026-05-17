import java.util.*;
class twoDarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter k,l values");
int k=sc.nextInt();
int l=sc.nextInt(); 
int a[][]=new int[k][l];
System.out.println("enter array elaments:");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
a[i][j]=sc.nextInt();
}
System.out.println("array elaments are:");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
System.out.println(" "+a[i][j]);
}
}
}
