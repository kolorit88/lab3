import java.util.*;

public class FirstTask {
    public static void first_task(Integer n){
        Random rand = new Random();

        System.out.println("\n" + "a)");
        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\n" + "b)");

        List<Integer> list_form_arr = new ArrayList<>(Arrays.asList(arr));

        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(list_form_arr.get(i) + " ");
        }
        System.out.println("\n\n" + "c)");

        Collections.sort(list_form_arr);
        System.out.println(list_form_arr + "сортировка");

        System.out.println("\n" + "d)");
        Collections.reverse(list_form_arr);
        System.out.println(list_form_arr + "перевернули список");

        System.out.println("\n" + "e)");
        Collections.shuffle(list_form_arr);
        System.out.println(list_form_arr +  "перемешали");

        System.out.println("\n" + "f)");
        Collections.rotate(list_form_arr, 1);
        System.out.println(list_form_arr + "сдвинули на 1 индекс все элементы");

        System.out.println("\n" + "g)");
        list_form_arr.add(list_form_arr.getFirst()); //для гарантии появления дубликата
        System.out.println(list_form_arr);
        List<Integer> no_duplications = list_form_arr.stream().filter(x -> Collections.frequency(list_form_arr, x) == 1).toList();
        System.out.println(no_duplications);

        System.out.println("\n" + "h)");
        List<Integer> duplications = list_form_arr.stream().filter(x -> Collections.frequency(list_form_arr, x) > 1).toList();
        System.out.println(duplications);

        System.out.println("\n" + "i)");
        Integer[] arr2 = new Integer[list_form_arr.size()];
        list_form_arr.toArray(arr2);

        for(int i = 0; i <= n; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n\n" + "j)");

        HashMap<Integer, Integer> num_count = new HashMap<>();

        for(int i = 0; i < n; i++) {
            num_count.put(arr2[i], Collections.frequency(list_form_arr, arr2[i]));
        }
        System.out.println(num_count + "\n");
    }
}
