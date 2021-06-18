public class SumOfDigits {

    public static void main(String args[]) {

        int num = 1234, snum = 0, val = 0;

        while (num > 0) {
            snum = num % 10;
            num = num / 10;
            //val=snum;
            val =val+snum;
        }
        System.out.println("sum of digits " + val);
    }
}

