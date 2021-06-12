public class Test {
    public static void main(String[] args) {
        int count = 0;
        int x = 0, y = 1, z = 0, n = 15;
        while (count <= 15) {
            //0=1
            if (count == 0) {
                z = 0;
                System.out.println(z);
            }
           else {
                x = y;//1//0//1//2
                y = z;//0//1//2//3
                z = x + y;//1//1//3//5
                System.out.println(z);
            }
            ++count;
        }
    }
}
