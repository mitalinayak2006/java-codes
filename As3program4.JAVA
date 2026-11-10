import java.util.*;
class As3program4{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
double n;
System.out.print("Enter a number:");
n=sc.nextDouble();
sc.close();
if (n<0)
System.out.println(n+"is a negative numbe");
else if(n==0)
System.out.println("Given number is zero");
else
System.out.println(n+"is a positive number");
}
}