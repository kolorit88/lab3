import java.util.*;

public class Main {
    public static void first_task(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int n = scan.nextInt();
        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        List<Integer> list_form_arr = new ArrayList<>(Arrays.asList(arr));

        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(list_form_arr.get(i) + " ");
        }
        System.out.println("\n");

        Collections.sort(list_form_arr);
        System.out.println(list_form_arr + "сортировка" + "\n");

        Collections.reverse(list_form_arr);
        System.out.println(list_form_arr + "перевернули список" + "\n");

        Collections.shuffle(list_form_arr);
        System.out.println(list_form_arr +  "перемешали" + "\n");

        Collections.rotate(list_form_arr, 1);
        System.out.println(list_form_arr + "сдвинули на 1 индекс все элементы" + "\n");

        list_form_arr.add(list_form_arr.getFirst());
        System.out.println(list_form_arr + "\n");
        List<Integer> no_duplications = list_form_arr.stream().filter(x -> Collections.frequency(list_form_arr, x) == 1).toList();
        System.out.println(no_duplications + "\n");
        List<Integer> duplications = list_form_arr.stream().filter(x -> Collections.frequency(list_form_arr, x) > 1).toList();
        System.out.println(duplications + "\n");

        Integer[] arr2 = new Integer[list_form_arr.size()];
        list_form_arr.toArray(arr2);

        for(int i = 0; i <= n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");

        HashMap<Integer, Integer> num_count = new HashMap<>();

        for(int i = 0; i < n; i++) {
            num_count.put(arr2[i], Collections.frequency(list_form_arr, arr2[i]));
        }
        System.out.println(num_count + "\n");


        scan.close();
    }
    public static void main(String[] args) {
        first_task();

    }
}
