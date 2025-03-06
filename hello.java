package Java;
import java.util.*;

public class hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        if(originalNum == reversedNum){
            return true;
        }
        else{
            return false;
        }
    }
}
}
