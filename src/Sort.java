import java.util.*;
import java.util.stream.Stream;
class Person{
    String name;
    int age;
    float salary;

    Person(String name, int age, float salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
}
public class Sort {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("def",21,123.4f));
        list.add(new Person("abc",22,125.4f));
        list.add(new Person("xyz",25,126.4f));


    }
}

