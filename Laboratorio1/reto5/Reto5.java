import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {
    public static Set<Integer> generarSet(int cantidad) {
        Set<Integer> set = new TreeSet<>();
        Random rand = new Random();
        while(set.size() < cantidad) {
            set.add(rand.nextInt(100));
        }

        return set.stream()
                  .filter(n -> n % 5 != 0)
                  .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        Set<Integer> set = generarSet(10);
        set.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
