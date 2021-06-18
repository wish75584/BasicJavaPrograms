


public class Palindrome {
    public static void main(String args[]) {

        String s1 = "bob";
        String s2 =new StringBuilder(s1).reverse().toString();
        System.out.println(s2);
        System.out.println(s1.compareTo(s2));
    }
    }
