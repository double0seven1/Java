package Review;


public class Man {
  
    private int age;
    private String name;

    // @Override // 如果名字相同，就比较年龄
    // public int compareTo(Man o) {
    //     return (this.name == o.name) ? 0 : this.age - o.age;
    // }
    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Man() {
    }

    @Override //要放入底层是Hash表的集合，一定得要同时重写equal和hashCode方法
    public boolean equals(Object obj) {
        // 先判断传进来的obj是否为空指针 和 是否为该类型
        if (obj == null || !(obj instanceof Man))
            return false;
        if (obj == this)
            return true;

        Man m = (Man) obj;
        return (this.age == m.age && this.name.equals(m.name));
    }
    @Override
    public String toString() {
        return this.age + this.name;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    


}

