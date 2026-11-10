import java.lang.*;
class Ass1program5 
{
public static void main(String args[])
{
double a=30,b=40,c=50;
double s=(a+b+c)/2.0;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println ("Area of the triangle:" +area);
}
}