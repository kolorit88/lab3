import java.util.HashMap;
import java.util.*;

public class FifthTask {

    public static HashMap<Integer, List<String>> fifthTask(HashMap <String, Integer> mapToSwitch) {
        HashMap<Integer, List<String>> switchedMap = new HashMap<Integer, List<String>>();

        for (Map.Entry<String, Integer> entry : mapToSwitch.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if(!switchedMap.containsKey(value)) {
                List<String> tmp = new ArrayList<String>();
                tmp.add(key);
                switchedMap.put(value, tmp);
            }
            else {
                switchedMap.get(value).add(key);
            }

        }
        return switchedMap;
    }
}
