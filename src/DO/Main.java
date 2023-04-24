package DO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 怎么去遍历HashMap？
        // HashMap<Integer, String> hm = new HashMap<>();
        // hm.put(1, "k");
        // hm.put(3, "d");
        // hm.put(2, "d");
        // hm.put(4, "z");
        // // 拿key
        // Set<Integer> s = hm.keySet();
        // for (Integer integer : s) {
        //     System.out.println(integer);
        // }
        // // 拿value
        // Collection<String> c = hm.values();
        // for (String string : c) {
        //     System.out.println(string);
        // }
        // key和value一起拿
        // Set<Map.Entry<Integer, String>> set = hm.entrySet();
        // System.out.println(set);

        // Iterator<Map.Entry<Integer, String>> it = set.iterator();
        // it.remove();
        // while (it.hasNext()) {

        //     System.out.println(it.next());
        // }

    
    
        
        // TreeSet<Integer> ts = new TreeSet<>();
        // ts.add(34);
        // ts.add(2);
        // ts.add(53);
        // ts.add(43);
        // ts.add(0);
        // System.out.println(ts);
        // TreeMap


        TreeSet<User> t = new TreeSet<>();
        User u1 = new User("kzx", 43);
        User u2 = new User("dcc", 23);
        User u3 = new User("zne", 23);
        User u4 = new User("trx", 21);
        t.add(u1);
        t.add(u2);
        t.add(u3);
        t.add(u4);
        System.out.println(t);
    }
}
