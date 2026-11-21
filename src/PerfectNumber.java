public class PerfectNumber {
    static void main(String[] args) {

        // perfect numbers are equal to the sum of its own divisors
        int num = 28;
        int sum = 0;

        for(int i=1; i<num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num) System.out.println("perfect");
        else System.out.println("Not perfect");
    }
}
