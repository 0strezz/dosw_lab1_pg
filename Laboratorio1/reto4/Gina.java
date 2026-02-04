import java.util.*;

import java.util.stream.Collectors;



public class Cofre {



    public static Map<String, Integer> combinarMapas(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {


        return Stream.concat(hashMap.entrySet().stream(), hashTable.entrySet().stream())

                     .collect(Collectors.toMap(

                         e -> e.getKey().toUpperCase(),

                         Map.Entry::getValue,

                         (v1, v2) -> v2,

                         LinkedHashMap::new

                     ));

    }



    public static void imprimirMapOrdenado(Map<String, Integer> map) {

        map.entrySet().stream()

           .sorted(Map.Entry.comparingByKey())

           .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

    }



    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("a", 1);

        hashMap.put("b", 2);



        Map<String, Integer> hashTable = new Hashtable<>();

        hashTable.put("b", 20);

        hashTable.put("c", 3);



        Map<String, Integer> finalMap = combinarMapas(hashMap, hashTable);

        imprimirMapOrdenado(finalMap);

    }

}

