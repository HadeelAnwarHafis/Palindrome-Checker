public class UseCase2 {
    public static void main(String[] args){
        System.out.println("Palindrome Checker (Case Insensitive)");
        System.out.println("Type 'exit' to quit\n");
        
        while (true) {
            String text = "Malayalam";
            System.out.print("Word: "+text);
            
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
    }
    
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase(); // make it case insensitive
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}