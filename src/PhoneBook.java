
import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Map;

public class PhoneBook {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Лебедева", 7_159_555_77, bookPhone);
        addNumber("Иванов", 7_159_555_85, bookPhone);
        addNumber("Лебедева", 7_478_147_22, bookPhone);
        addNumber("Сидоров", 7_158_148_55, bookPhone);
        addNumber("Фруктова", 7_159_159_55, bookPhone);
        addNumber("Фруктов", 7_159_159_00, bookPhone);
        addNumber("Фруктова", 7_159_159_44, bookPhone);
        addNumber("Фруктова", 7_159_159_77, bookPhone);
        addNumber("Петров", 7_147_147_57, bookPhone);
        printBook(bookPhone);
    }
}