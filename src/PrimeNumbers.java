public class PrimeNumbers {

    public static void main(String args[]){
        int val= 12;
        if(val%3 == 0 || val%2 == 0){
            if(val == 3 || val == 2){
                System.out.println("value is prime");
            }
            else {
                System.out.println("value is  not prime");
            }
        }else{
        System.out.println("Value is prime");
    }
    }
}
