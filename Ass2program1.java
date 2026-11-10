import java.lang.*;
class Ass2program1
{
public static void main(String args[])
{
int number=8465;
int total=0;
int temp=number;
while(temp!=0){
total=total+temp%10;
temp=temp/10;
}
System.out.println("Sum of digits:"+total);
}
}