import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask ------1------");
        FirstTask.firstTask(10);

        System.out.println("\nTask ------2------");
        SecondTask.secondTask();

        System.out.println("\n\nTask ------3------");
        ThirdTask.thirdTask();

        System.out.println("\nTask ------4------");
        FourthTask.fourthTask("To to ti tI cat Cat and dog dOg doG");

        System.out.println("\nTask ------5------");
        HashMap <String, Integer> toSwitch = new HashMap <String, Integer>();
        toSwitch.put("one", 1);
        toSwitch.put("two", 2);
        toSwitch.put("three", 3);
        System.out.println(toSwitch);
        System.out.println(FifthTask.fifthTask(toSwitch));

    }
}
