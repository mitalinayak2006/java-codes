class Counter{
static int count=0;
int id;
static{
System.out.println("static block:counter class loaded");
}
Counter(){
count++;
id=count;
}
static void display(){
System.out.println("Total objects created:"+count);
}
static class Helper{
void msg(){
System.out.println("Hello from static nested class");
     }
   }
}
public class Ass10program4{
public static void main (String args[]){
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();

System.out.println("c1 id="+c1.id);
System.out.println("c3 id="+c3.id);
Counter.display();
Counter.Helper h1=new Counter.Helper();
h1.msg();
}
}
