import java.lang.*;
import java.util.Scanner;
public class Ass4program3
{
public static void main(String scp[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter month(1-12):");
int month=sc.nextInt();
System.out.print("Enter year:");
int year=sc.nextInt();
switch(month)
{
case 1:case 3:case 5:case 7:case 8:case 10:case 12:
System.out.println("31days:");
break;
case 2:
if(((year%4==0)&&(year%100!=0))||(year%400==0)){
System.out.println("29 days");
}else{
System.out.println("28 days");
}
default:
System.out.println("invalid month input");
}
sc.close();
}
}