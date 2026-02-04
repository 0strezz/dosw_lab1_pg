import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diego {
    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> e : lista) {
            map.putIfAbsent(e.getKey(), e.getValue());
        }
        return map;
    }

    public static Map<String, Integer> combinar(Map<String, Integer> mapA, Map<String, Integer> mapB) {
    	Map<String, Integer> combinado = new HashMap<>(mapA);
    	mapB.forEach((k, v) -> combinado.put(k, v));
    	return combinado;
    }
}
