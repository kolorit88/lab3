import java.util.*;

public class ThirdTask {
    public static void thirdTask() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Liza", "Berdnichkowa", 999999 <3 ? 1: 0));
        humans.add(new Human("Timofey", "Kislichkin", 999999));
        humans.add(new Human("Kseniya", "Gorbyshkina", 3 + 1999));
        humans.add(new Human("Kirill", "Kozlowsky", 69420));
        humans.add(new Human("Alina", "Gorynowka", -21));
        humans.add(new Human("Alisa", "Ateistdanowa", 666));
        humans.add(new Human("Polina", "topAkowa", 0-0));
        humans.add(new Human("Shasha", "BurdukOFF", 404));

        // Сортировка людей по фамилии при помощи Comparable
        System.out.println("Сортировка по фамилии с использованием Comparable:");
        Collections.sort(humans);
        for (Human human : humans) {
            System.out.println(human.getLastName());
        }

        // Сортировка людей по фамилии при помощи HumanComparatorByLastName
        System.out.println("Сортировка по фамилии с использованием HumanComparatorByLastName:");
        HumanComparatorByLastName comparator = new HumanComparatorByLastName();
        humans.sort(comparator);
        for (Human human : humans) {
            System.out.println(human.getLastName());
        }

        Collections.shuffle(humans);
        // Обычный сет без учета последовательности
        HashSet<Human> hSet = new HashSet<>(humans);
        System.out.println(hSet);

        // Сет который сохраняет последовательность, добавляя ссылки на предыдущий и следующий элемент
        LinkedHashSet<Human> lhSet = new LinkedHashSet<>(humans);
        System.out.println(lhSet);

        // Сет который для хранения использует красно-ченое дерево, реализует интерфейс Comparable
        TreeSet<Human> treeSet = new TreeSet<>(humans);
        System.out.println(treeSet);

        // Реализует интерфейс Comparator
        TreeSet<Human> treeSetWithComp = new TreeSet<>(comparator);
        treeSetWithComp.addAll(humans);
        System.out.println(treeSetWithComp);

        //Сортировка с учетом анонимного компоратора
        TreeSet<Human> treeSetWithCompAge = new TreeSet<>((h1, h2 ) -> Integer.compare(h1.getAge(), h2.getAge()));
        treeSetWithCompAge.addAll(humans);
        System.out.println(treeSetWithCompAge);
    }
}
