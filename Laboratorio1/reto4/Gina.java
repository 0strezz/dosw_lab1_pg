import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Gina {
    public static Map<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> lista) {
        Map<String, Integer> table = new Hashtable<>();
        for (Map.Entry<String, Integer> e : lista) {
            table.putIfAbsent(e.getKey(), e.getValue());
        }
        return table;
    }
	
	public static Map<String, Integer> combinar(Map<String, Integer> mapA, Map<String, Integer> mapB) {
    	Map<String, Integer> combinado = new HashMap<>(mapA);
    	mapB.forEach(combinado::put);
    	return combinado;
	}
}

