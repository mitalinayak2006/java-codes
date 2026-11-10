import java.lang.*;
import java.util.Scanner;
public class Ass4program1
{
public static void main(String scp[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter coefficient a:");
double a=sc.nextDouble();
System.out.print("Enter coefficient b:");
double b=sc.nextDouble();
System.out.print("Enter coefficient c:");
double c=sc.nextDouble();
if(a==0){
System.out.println("\n it is not a quadratic equation:");
}else{
double D=(b*b)-(4*a*c);
if(D>0)
{
double r1=(-b+Math.sqrt(D))/(2*a);
double r2=(-b-Math.sqrt(D))/(2*a);
System.out.println("\n the equation have Real and Distinct roots:");
System.out.printf("1st Root=%.2f\n",r1);
System.out.printf("2nd Root=%.2f\n",r2);
}else{
double realp=-b/(2*a);
double imgp=Math.sqrt(-D)/(2*a);
System.out.printf("1st Root=%.2f+%.2fi\n",realp,imgp);
System.out.printf("2nd Root=%.2f-%.2fi\n",realp,imgp);
}
}
sc.close();
}
}