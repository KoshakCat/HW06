package task1;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7);
        QuantityListNumber qln = new QuantityListNumber();
        Map<Integer, Integer> result = qln.countListElements(list);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Number " + entry.getKey() + " repeated " + entry.getValue() + " time" + ((entry.getValue() == 1) ? "":"s"));
        }
    }
}
