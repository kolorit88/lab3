import java.util.HashMap;
import java.util.Objects;

public class FifthTask {

    public static HashMap<Integer, String> fifth_task(HashMap <String, Integer> map_to_switch) {

        HashMap<Integer, String> switched_map = new HashMap<Integer, String>();
        map_to_switch.forEach((key, value) -> switched_map.put(value, key));

        return switched_map;
    }
}
