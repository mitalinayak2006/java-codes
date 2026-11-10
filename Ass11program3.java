import java.util.Scanner;
public class Ass11program3 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.print("Enter a string:");
String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                System.out.println(ch + " = " + i);
            }
        }
      sc.close();
    }
}
