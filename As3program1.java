import java.util.*;
class As3program1{
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        double s1,s2,s3,s4,s5,t,per;
        System.out.print("enter subject-1 marks:");
        s1=sc.nextDouble();
        System.out.print("enter subject-2 marks:");
        s2=sc.nextDouble();
        System.out.print("enter subject-3 marks:");
        s3=sc.nextDouble();
        System.out.print("enter subject-4 marks:");
        s4=sc.nextDouble();
        System.out.print("enter subject-5 marks:");
        s5=sc.nextDouble();
        sc.close();
        t=s1+s2+s3+s4+s5;per=t/5 ;
        System.out.println("total marks:"+t);
        System.out.println("percentage:"+per);

    }
}