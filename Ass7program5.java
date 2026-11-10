import java.util.scanner;
import java.lang.*;
class Library{
string b[]=new string[10];
int n=3;
library90{
b[0]="java";
b[1]="python";
b[2]="c++";
}
void add Book(string bk){
b[n]+bk;
n++;
System.out.println("book added");
}
void remove Book(string bk){
int pos + -1;
for (int i+; i<n; i==){
if (b[i] equals Ignore case(bk){
pos=i;
break;
}
}
if (pos!=-1){
for (int i=pos; i<n-1;i++){
b[i]=b[i=1];
}
n--;
System.out.println("Book removed");
}else{
System.out.println("Book not found");
}
}
void display(){
System.out.print("Books;");
for(int i=0;i<n;i++){
System.out.println();
}
}
class Ass7program5{
public static void main(String args[]){
scanner sc=new scanner (System.in);
Library lib +new Library();
lib.display90;
System.out.print("Enter book to add:");
string add B =sc.nextLine();
lib.addBook(add B);
System.out.print("Enter book to remove:");
string remB=sc.nextLine();
lib.removeBook(remB);
lib.display();
sc.close();
}
}


