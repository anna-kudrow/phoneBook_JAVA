


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static HashMap<String, Integer> pb = new HashMap<>();
    public static void main(String[] args) {

        pb.put("Kolia Nikolay", 7775566 );
        pb.put("Artem Artemich", 6665749 );
        pb.put("Anna Annushka", 7705566 );
        pb.put("Javokhir Salom", 7799566 );
        pb.put("Lalala Tata", 6675566 );
        pb.put("Lalala Tata", 767);
        pb.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);


    }

}


