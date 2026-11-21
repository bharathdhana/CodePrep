public class StringPalindrome {
    static void main(String[] args) {
        String str = "madam";
        String str2 = "";


        // without built in
        for(int i=str.length()-1; i>=0; i--) {
            str2 += str.charAt(i);
        }

        if(str.equals(str2)) {
            System.out.println("Palindrome");
        } else System.out.println("not palindrome");

        // two pointers
        int first = 0;
        int last = str.length() -1;
        boolean isPalindrome = true;

        while (first < last) {
            if(str.charAt(first) != str.charAt(last)) {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }
        System.out.println(isPalindrome ? "true" : "false");

        // Number palindrome
        int num = 121;
        int temp = num;
        int rev = 0;

        while(num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if(temp == rev) {
            System.out.println("palindrome");
        } else System.out.println("Not palindrome");
    }
}
