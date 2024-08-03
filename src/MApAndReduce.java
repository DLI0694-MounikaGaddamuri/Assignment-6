import java.util.*;
public class MApAndReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sumOfSquaresOfEvens=list.stream().filter(n->n%2==0).map(n->n*n).reduce((value1,value2)->{
            return value1+value2;
        });
        System.out.println(sumOfSquaresOfEvens.get());
    }
}
