import java.util.*;

public class PhoneBook {
    static HashMap<String, Integer> pb = new HashMap<>();
    public static void main(String[] args) {
        Map<String, HashSet<String>> map = new HashMap<>();

        updateBook(map, "Artem Artemich", "6665749" );
        updateBook(map, "Anna Annushka", "7705566" );
        updateBook(map, "Javokhir Salom", "7799566" );
        updateBook(map, "Lalala Tata", "6675566" );
        updateBook(map, "ASD Tata", "9999999" );
        updateBook(map, "ASD Tata", "8888888" );
        updateBook(map, "ASD Tata", "8888888" );

        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashSet<String> value = entry.getValue();
            System.out.println(key + value);
//            System.out.println();
        }
        pb.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
    private static void updateBook(Map<String, HashSet<String>> map, String key, String value) {
        if (map.containsKey(key)) {
            HashSet<String> oldVal = map.get(key);
            oldVal.add(value);
        } else {
            HashSet<String> newList = new HashSet<>();
            newList.add(value);
            map.put(key, newList);
        }
    }
}

