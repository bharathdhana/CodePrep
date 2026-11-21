public class ReverseNumber {
    static void main(String[] args) {
        int num = 10056;
        int reversed = 0;

        while (num != 0){
            reversed = (reversed * 10) + (num % 10); // last one -> digit separation
            num /= 10;
        }
        System.out.println(reversed);
    }
}
