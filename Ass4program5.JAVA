import java.lang.*;
import java.util.Scanner;
public class Ass4program1
{
public static void main(String scp[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a single character from the alphabet:");
String str=sc.next();
if(str.length()!=1){
System.out.println("Error");
}else{
char ch=str.charAt(0);
ch=character.to Lowercase(ch);
if(ch=='e'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("vowel");
}else{
System.out.println("consonant");
}
}
sc.close();
}
}