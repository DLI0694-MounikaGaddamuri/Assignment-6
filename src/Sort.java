import java.util.*;
import java.util.stream.Collectors;
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
        list.add(new Person("def",30,123.4f));
        list.add(new Person("abc",22,125.4f));
        list.add(new Person("xyz",25,126.4f));

        list.stream().sorted(Comparator.comparingInt(p -> p.age)).forEach(s-> System.out.println(s.name+" "+s.age+" "+s.salary));

        //sortedByAge.forEach(System.out::println);

    }
}

