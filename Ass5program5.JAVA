import  java.lang.*;
class Ass5program5
{
public static void main(String args[]){
int count=0;
System.out.println("Three digit numbers using 1,2,3:");
for(int i=1;i<=3;i++){
for(int j=1;j<=3;j++){
for(int k=1;k<=3;k++){
if (i!=j && j!=k && i!=k){
int num =1*100+j*10+k;
System.out.println(num);
count++;
}
}
}
}
System.out.println("Total three digit numbers="+count);
}
} 