import java.lang.*;
class As6program5{
public static void main(String args[])
{
String[]arr1={"python","java","c++","sql"};
String[]arr2={"mysql","sql","oracle","java"};
System.out.print("common element:[");
boolean first=true;
   for(int i=0; i<arr1.length; i++)
{
   for(int j=0; j<arr2.length; j++)
{
   if(arr1[i].equals(arr2[j])){
if (!first) {
                        System.out.print(", ");
                    }

                    System.out.print(arr1[i]);
                    first = false;
     }
    }
   }
System.out.println("]");
  }
 }
}