package task1;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QuantityListNumber {
    private Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

    public Map<Integer, Integer> countListElements(List<Integer> list) {
        for (Integer listElement : list) {
            if (!map.containsKey(listElement)) {
                map.put(listElement, 1);
            } else {
                Integer count = map.get(listElement);
                map.put(listElement, count + 1);
            }
        }
        return map;
    }
}

