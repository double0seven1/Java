package IO;

import java.io.Serializable;

// 得实现标识接口（）
public class Man implements Serializable {
    String name;
    int age;
    @Override
    public String toString() {
        return "Man [name=" + name + ", age=" + age + "]";
    }
}

