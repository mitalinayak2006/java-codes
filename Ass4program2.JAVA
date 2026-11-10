import java.lang.*;
import java.util.Scanner;
public class Ass4program2
{
public static void main(String scp[])
{
Scanner sc=new Scanner(System.in);
System.out.print("input 1st floating point number:");
double n1=sc.nextDouble();
System.out.print("input 2nd floating point number:");
double n2=sc.nextDouble();
if(Math.round(n1*1000)==Math.round(n2*1000)){
System.out.println("they are the same up to 3 decimal places:");
}else{
System.out.println("they are different:");
}
sc.close();
}
}