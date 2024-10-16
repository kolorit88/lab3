import java.util.ArrayList;
import java.util.List;

public class PrimesGenerator {
    int n;
    List<Integer> nums = new ArrayList<Integer>();

    public PrimesGenerator(int n) {
        this.n = n;
        if (n >= 2) {
            for (int i = 2; nums.size() <= n; i++) {
                if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) ||i == 2|| i == 3 || i == 5 || i == 7) {
                    nums.add(i);
                }
            }
        }
    }
}
