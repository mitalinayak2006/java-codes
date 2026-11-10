public class Ass11program5 {
    public static void main(String[] args) {
        String str = "successes";
        int max1 = 0, max2 = 0;
        char first = '\0', second = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            if (ch == ' ') {
                continue;
            }

            boolean alreadyChecked = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(k) == ch) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > max1) {
                max2 = max1;
                second = first;
                max1 = count;
                first = ch;
            } else if (count > max2 && count < max1) {
                max2 = count;
                second = ch;
            }
        }

        if (max2 == 0) {
            System.out.println("No second most frequent character");
        } else {
            System.out.println("Second most frequent character: " + second);
            System.out.println("Frequency: " + max2);
        }
    }
}
