import java.util.HashMap;
import java.util.HashSet;
// import java.util.TreeMap;

public class class1 {
   public static void main(String[] args) {
      // String name = "Rizu";
      // int code = name.hashCode();
      // System.out.println(code);

      HashMap<String, Integer> map = new HashMap<>();
      // TreeMap<String, Integer> map = new TreeMap<>();

      map.put("Rizwana", 98);
      map.put("Nusrat", 95);
      map.put("Jasmine", 80);

      System.out.println(map.get("Rizwana"));
      System.out.println(map.getOrDefault("Razia",99));
      System.out.println(map.containsKey("Rizwana"));

      HashSet<Integer> set = new HashSet<>();
      set.add(45);
      set.add(25);
      set.add(15);
      set.add(65);
      set.add(75);
      set.add(5);
      set.add(45);

      System.out.println(set);
   }
}