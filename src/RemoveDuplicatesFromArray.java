import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String args[]){

        List<Integer> prime = new ArrayList<Integer>();
        prime.add(1);
        prime.add(5);
        prime.add(150);
        prime.add(1);
        System.out.println("prime ="+prime);

        Set<Integer> newprime =new LinkedHashSet<Integer>();
        newprime.addAll(prime);
        System.out.println("newprime ="+newprime);
    }
}
