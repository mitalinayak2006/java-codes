import java.util.*;
class As3program3{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
double e,cost=0;
System.out.print("enter electricity consumption:");
e=sc.nextDouble();
sc.close();
if (e<=100)cost=3*e;
else if (e<=500)
cost=(100*3)+(e-100)*4;
else
cost=(100*3)+(400*4)+(e-500)*6;
System.out.println("total electricity cost:RS"+cost);
}
}