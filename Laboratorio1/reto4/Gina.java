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
}

