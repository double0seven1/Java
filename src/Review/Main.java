package Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    // 玩一下ArrayList里面的增删查改，循环遍历
    public static void main(String[] args) {
        // ArrayList<Integer> myArrayList = new ArrayList<>(11);
        // myArrayList.add(1);
        // myArrayList.add(2);
        // myArrayList.add(3);
        // myArrayList.add(1);
        // for (Integer integer : myArrayList) {
        //     System.out.println(integer);
        // }

        // List接口，能让你在某个位置增加元素
        // myArrayList.add(3, 10000);
        // Iterator it = myArrayList.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        
        // 玩一下entrySet
        // HashMap<Integer, String> hs = new HashMap<>();
        // hs.put(100, "kong");
        // hs.put(2, "deng");
        // hs.put(33, "chun");
        // hs.put(22, "tian");

        // 怎么循环遍历呀？ value拿出值，ketSet拿出ket,EntrySet直接拿出键值对
        // Set<Map.Entry<Integer, String>> s = hs.entrySet();
        // System.out.println(s);
        
        // System.out.println(hs.get(2));


        
        // 自定义类放入哈希表中，一定要'同时'改写hashcode和equal方法。
        // Man m1 = new Man(1, "zjl");
        // Man m2 = new Man(1, "zjl");
        // System.out.println(m1.equals(m2));



        // 喂，你自定义的类，不可直接就放进TreeMap中
        // 单独比较名字
        TreeSet<Man> ts = new TreeSet<>(new Ctor().compareByName());
        Man m1 = new Man(1, "k");
        Man m2 = new Man(4, "d");
        Man m3 = new Man(3, "t");
        ts.add(m1);
        ts.add(m2);
        ts.add(m3);
        System.out.println(ts);

        // 整形
        // TreeSet<Integer> ts1 = new TreeSet<>();
        // ts1.add(42);
        // ts1.add(51);
        // ts1.add(1);
        // ts1.add(43);
        // ts1.add(10);
        // System.out.println(ts1);

        // 字符类型
        
    }
}
