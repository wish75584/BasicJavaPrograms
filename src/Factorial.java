public class Factorial {
    public static void main(String args[]) {


        int val = 10, fract = val;
        for (int i = 1; i < val; i++) {
            fract = fract * (val - i);
        }
        System.out.println("fraction of 10 is " + fract);
    }
}
