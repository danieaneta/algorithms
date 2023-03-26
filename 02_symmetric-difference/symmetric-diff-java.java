import java.util.*;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<T> setA, Set<T> setB) {
        Set<T> difference = new HashSet<T>(setA);
        difference.addAll(setB);
        Set<T> intersection = new HashSet<T>(setA);
        intersection.retainAll(setB);
        difference.removeAll(intersection);
        return difference;
    }
    
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<Integer>(Arrays.asList(2, 3, 4));
        Set<Integer> symmetricDifference = symmetricDifference(setA, setB);
        System.out.println(symmetricDifference); // prints [1, 4]
    }
}
