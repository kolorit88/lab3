import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask ------1------");
        FirstTask.first_task(10);

        System.out.println("\nTask ------2------");
        SecondTask.second_task();

        System.out.println("\n\nTask ------3------");
        ThirdTask.third_task();

        System.out.println("\nTask ------4------");
        FourthTask.fourth_task("To to ti tI cat Cat and dog dOg doG");

        System.out.println("\nTask ------5------");
        HashMap <String, Integer> to_switch = new HashMap <String, Integer>();
        to_switch.put("one", 1);
        to_switch.put("two", 2);
        to_switch.put("three", 3);
        System.out.println(to_switch);
        System.out.println(FifthTask.fifth_task(to_switch));

    }
}
