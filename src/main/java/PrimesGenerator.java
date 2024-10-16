import java.util.ArrayList;
import java.util.List;

public class PrimesGenerator {
    int n;
    List<Integer> nums = new ArrayList<Integer>();

    public PrimesGenerator(int n) {
        this.n = n;
        for (int i = 2; nums.size() < n; i++) {
            boolean prime = true;
            for(int num: nums) {
                if (i % num == 0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                nums.add(i);
            }
        }
    }
}
