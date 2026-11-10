import java.lang.*;
class As6program4{
public static void main(String args[])
{
int[]arr={1,2,35,5,6,6,7,2};
   for(int i=0; i<arr.length; i++)
{
   for(int j=i+1; j<arr.length; i++)
{
   if(arr[i]==arr[j]){
   System.out.println("Duplicate element:"+arr[i]);
 break;
     }
    }
   }
  }
 }