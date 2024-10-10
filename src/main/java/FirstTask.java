import java.util.*;

public class FirstTask {
    public static void firstTask(Integer n){
        Random rand = new Random();

        System.out.println("\n" + "a)");
        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\n" + "b)");

        List<Integer> listFromArray = new ArrayList<>(Arrays.asList(arr));

        for(int i = 0; i < n; i++) {
            System.out.print(listFromArray.get(i) + " ");
        }

        System.out.println("\n\n" + "c)");

        Collections.sort(listFromArray);
        System.out.println(listFromArray + "сортировка");

        System.out.println("\n" + "d)");
        Collections.reverse(listFromArray);
        System.out.println(listFromArray + "перевернули список");

        System.out.println("\n" + "e)");
        Collections.shuffle(listFromArray);
        System.out.println(listFromArray +  "перемешали");

        System.out.println("\n" + "f)");
        Collections.rotate(listFromArray, 1);
        System.out.println(listFromArray + "сдвинули на 1 индекс все элементы");

        System.out.println("\n" + "g)");
        listFromArray.add(listFromArray.getFirst()); //для гарантии появления дубликата
        System.out.println(listFromArray);
        List<Integer> noDuplications = listFromArray.stream().filter(x -> Collections.frequency(listFromArray, x) == 1).toList();
        System.out.println(noDuplications);

        System.out.println("\n" + "h)");
        List<Integer> duplications = listFromArray.stream().filter(x -> Collections.frequency(listFromArray, x) > 1).toList();
        System.out.println(duplications);

        System.out.println("\n" + "i)");
        Integer[] arr2 = new Integer[listFromArray.size()];
        listFromArray.toArray(arr2);

        for(int i = 0; i <= n; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n\n" + "j)");

        HashMap<Integer, Integer> numCount = new HashMap<>();

        for(int i = 0; i < n; i++) {
            numCount.put(arr2[i], Collections.frequency(listFromArray, arr2[i]));
        }
        System.out.println(numCount + "\n");
    }
}
