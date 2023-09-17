


import java.util.*;
import java.util.function.BiFunction;

public class PhoneBook {
    static HashMap<String, Integer> pb = new HashMap<>();
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        updateBook(map, "Artem Artemich", "6665749" );
        updateBook(map, "Anna Annushka", "7705566" );
        updateBook(map, "Javokhir Salom", "7799566" );
        updateBook(map, "Lalala Tata", "6675566" );
        updateBook(map, "ASD Tata", "9999999" );
        updateBook(map, "ASD Tata", "8888888" );

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + value);
//            System.out.println();
        }
        pb.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
    private static void updateBook(Map<String, List<String>> map, String key, String value) {
        if (map.containsKey(key)) {
            List<String> oldVal = map.get(key);
            oldVal.add(value);
        } else {
            List<String> newList = new ArrayList<>();
            newList.add(value);
            map.put(key, newList);
        }
    }
}

