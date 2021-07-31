public class newTest {

    public static void main(String args[]) {

        int val = 600, res = 0, notes = 0;

        if (val % 2 == 0) {
            notes = 200;
            for (int i = 1; i <= (val/notes) ; i++) {
                res = notes * i;
            }
            if (res == val) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        if (val % 2 == 0) {
            notes = 500;
            for (int i = 1; i <= (val/notes); i++) {
                res = notes * i;
                System.out.println("nootes of  500 =" + res);
            }
            if (res == val) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }



        else {
            notes = 100;
            for (int i = 1; i <= (val/notes); i++) {
                res = notes * i;
                System.out.println("nootes of  100 =" + res);
            }
            if (res == val) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
