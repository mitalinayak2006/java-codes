import java.lang.*;
import java.util.Scanner;
public class Ass4program4
{
public static void main(String scp[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter first number:");
double num1=sc.nextDouble();
System.out.print("Enter second number:");
double num2=sc.nextDouble();
System.out.print("Enter third number:");
double num3=sc.nextDouble();
if(num1>=num2 && num1>=num3){
System.out.println("greatest:"+num1);
}else if(num2>=num1 && num2>=num3){
System.out.println("greatest:"+num2);
}else{
System.out.println("greatest:"+num3);
}
sc.close();
}
}