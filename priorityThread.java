class Mythread extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName()+"thread is running using thread extends"+Thread.currentThread().getPriority());
}
}
class priorityThread
{
public static void main(String args[])
{
  Mythread obj1=new  Mythread();
  Mythread obj2=new  Mythread();
  obj1.start();
  obj2.start();
}
}