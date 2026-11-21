public class ReverseAString {
    static void main(String[] args) {
        String str = "Competition";

        // with StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        // without Builders
        String reversed2 = "";
        for(int i=str.length() -1 ; i>=0; i--) {
            reversed2 += str.charAt(i);
        }
        System.out.println(reversed2);

    }
}
