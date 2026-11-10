import java.lang.*;
class Bank
{
Double getRateofInterest{
return 0;
}
}
class SBI extends Bank{
double rate(){
return 8.4;
}
}
class ICICI extends Bank{
doubl rate (){
return 7.3;
}
}
class Axis extends Bank{
double getRateofInterest(){
return 9.7;
}
}
public class Ass10program1 {
public static void main (String args[]){
Bank b;
b=new SBI();
System.out.println("SBI Interest Rate:"+b.getRateofInterest()+"%");
b=new ICICI();
System.out.println("ICICI Interest Rate:"+b.getRateofInterest()+"%");
b=new Axis();
System.out.println("Axis Interest Rate:"+b.getRateofInterest()+"%");
}
}
