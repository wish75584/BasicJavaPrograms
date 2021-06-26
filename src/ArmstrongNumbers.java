public class ArmstrongNumbers {
    public static void main(String args[]) {

        double val = 10, original;
        double temp, armstrong = 0, count = 0;

        original = val;

        while (val > 0) {
            count = count + 1;
            val = val / 10;
        }
        while (val > 0) {
            temp = val % 10;
            temp = Math.pow(temp, count);
            armstrong = armstrong + temp;
            val = val / 10;
        }
        if (armstrong == original) {
            System.out.println("value is armstrong");
        } else {
            System.out.println("value is not armstrong");
        }
    }
}