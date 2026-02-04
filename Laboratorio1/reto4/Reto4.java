import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {

    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> e : lista) {
            map.putIfAbsent(e.getKey(), e.getValue());
        }
        return map;
    }
}

