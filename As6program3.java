import java.lang.*;
class As6program3{
public static void main(String args[]){
int[] arr={25,14,56,15,36,56,77,18,29,49};
int max=arr[0];
int min=arr[0];
for(int i=1;i<arr.length;i++)
{
    if(arr[i]>max){
    max=arr[i];
}
    if(arr[i]<min){
    min=arr[i];
}
}
System.out.println("maximum value for the above array="+max);
System.out.println("minimum value for the above array="+min);
}
}