package Review;

import java.util.Comparator;

// 这个比较器（Comparator）专为了Man这个类型而服务，这里有许多的比较方法
public class Ctor implements Comparator<Man> {

    @Override // 单独比较年龄
    public int compare(Man o1, Man o2) {
        return o1.getAge() - o1.getAge();
    }
    
    // 单独比较名字
    public  Comparator<Man> compareByName() {
        return new Comparator<Man>() {

            @Override
            public int compare(Man o1, Man o2) {
                return o1.getName().compareTo(o2.getName());
            }

        };
    }
    
    // 年龄如果相同的话，就比较名字
    public  Comparator<Man> compareByAgeAndName() {
        return new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return (o1.getAge() == o2.getAge()) ? 0 : o1.getName().compareTo(o2.getName());
            }
            
        };
    }
}
