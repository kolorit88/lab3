import java.util.Collections;
import java.util.HashMap;

public class FourthTask {
    public static void fourth_task(String text) {
        HashMap<String, Integer> word_count = new HashMap<>();

        String[] words = text.split(" ");

        for(int i = 0; i < words.length; i++) {
            word_count.put(words[i].toLowerCase(), word_count.getOrDefault(words[i].toLowerCase(), 0) + 1);
        }
        System.out.println(word_count);
    }
}
