import java.util.Collections;
import java.util.HashMap;

public class FourthTask {
    public static void fourthTask(String text) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");

        for(int i = 0; i < words.length; i++) {
            wordCount.put(words[i].toLowerCase(), wordCount.getOrDefault(words[i].toLowerCase(), 0) + 1);
        }
        System.out.println(wordCount);
    }
}
