import java.util.Scanner;

public class palindrome {
    public static void palindrome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check palindrome=");
        String a = sc.nextLine();

        int left = 0;
        int right = a.length() - 1;

        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                System.out.println("String is NOT palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("String IS palindrome");
    }

    public static void main(String[] args) {
        palindrome();
    }
}
