public class PrimeNumbers {

    public static void main(String args[]) {

        int i = 0, n = 55, m, flag = 0;
        m = n / 2;

        if (n == 1 || n == 0) {
            System.out.println("number is prime");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("number is  not prime");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("number is prime");
        }
    }
}
