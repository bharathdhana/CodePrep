public class PrimeNumber {
    static void main(String[] args) {
        int num = 13;
        boolean check = true;

        if(num <= 1) check = false;

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                check = false;
            }
        }

        if(check) System.out.println("prime");
        else System.out.println("not prime");
    }
}
