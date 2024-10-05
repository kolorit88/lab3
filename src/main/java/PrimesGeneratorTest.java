import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrimesGeneratorTest {

    PrimesGeneratorTest(PrimesGenerator generator) {

        Iterator<Integer> iterator = generator.nums.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Iterator<Integer> iterator1 = generator.nums.reversed().iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }


    }
}
