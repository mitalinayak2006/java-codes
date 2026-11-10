import java.util.*;
class As3program3{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
double buy,sell,diff,lp,pp;
System.out.print("enter buy price:");
buy=sc.nextDouble();
System.out.print("Enter sell price:");
sell=sc.nextDouble();
sc.close();
if (buy==sell)
System.out.println("No profit /loss");
else if (buy>sell){
diff=buy-sell;
lp=diff*100/buy;
System.out.println("loss percentage:"+lp+"%");
}
else
diff=sell-buy;
pp=diff*100/buy;
System.out.println("profit percentage:"+pp+"%");
}
}