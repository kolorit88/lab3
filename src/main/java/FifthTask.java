import java.util.HashMap;
import java.util.Objects;

public class FifthTask {

    public static HashMap<Integer, String> fifthTask(HashMap <String, Integer> mapToSwitch) {

        HashMap<Integer, String> switchedMap = new HashMap<Integer, String>();
        mapToSwitch.forEach((key, value) -> switchedMap.put(value, key));

        return switchedMap;
    }
}
