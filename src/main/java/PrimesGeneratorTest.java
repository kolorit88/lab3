import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrimesGeneratorTest {
    PrimesGenerator generator;

    PrimesGeneratorTest(PrimesGenerator generator) {
        this.generator = generator;
    }

    public void test(Integer n){
        show(generator.nums, n);
        show(generator.nums.reversed(), n);
    }

    public void show(List<Integer> nums, Integer n){
        int i = 0;
        Iterator<Integer> iterator = nums.iterator();

        while (iterator.hasNext() && i < n) {
            System.out.print(iterator.next() + " ");
            i++;
        }
        System.out.println();
    }
}
