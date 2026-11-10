import java.util.*;
class As3Pogram2
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
double GS,basic,HRA,DA;
System.out.print("Enter Basic Salary:");
basic=sc.nextDouble();
sc.close();
HRA=basic*0.1;
DA=basic*0.6;
GS=basic+DA+HRA;
System.out.println("Gross salary calculated:RS"+GS);
}
}

