package DO;

public class User extends Human implements Comparable<User>{
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(User o) {
        // 字符串的compare方法已经改写
        return (this.age == o.age) ? this.name.compareTo(o.name) : this.age - o.age;
    }
    @Override
    public String toString() {
        return this.name + "= " + this.age;
    }
    
    
}
