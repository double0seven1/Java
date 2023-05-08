package Handle1;

import java.util.Comparator;

public class Ctor implements Comparator<Man> {

    // 比较年龄
    public int compare(Man o1, Man o2) {
        return o1.age - o2.age;
    }
    
    // 比较名字
    public static Comparator<Man> compareByName(Man o1, Man o2) {
        return new Comparator<Man>() {

            @Override
            public int compare(Man o1, Man o2) {
                return 1;
            }

        };
    }
    
}
