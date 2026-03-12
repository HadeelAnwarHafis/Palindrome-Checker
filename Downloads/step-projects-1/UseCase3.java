import java.util.Scanner;

public class UseCase3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Checker (Case Insensitive)");
        System.out.println("Type 'exit' to quit\n");
        
        while (true) {
            System.out.print("Enter a word: ");
            String text = scanner.nextLine();
            
            if (text.toLowerCase().equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            if (isPalindrome(text)) {
                System.out.println("✓ It is a palindrome\n");
            } else {
                System.out.println("✗ Not a palindrome\n");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase(); // make it case insensitive
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}