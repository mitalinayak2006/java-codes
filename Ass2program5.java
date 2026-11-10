import java.lang.*;
class Ass2program5
{
public static void main (String args[])
{
int totalMinute=800000;
int totalDays=totalMinute/1440;
int years=totalDays/365;
int days=totalDays%365;
System.out.println("years="+years);
System.out.println("Days="+days);
}
}