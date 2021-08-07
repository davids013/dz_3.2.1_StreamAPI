import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tЗадача 1: Работа с числами\n");
        Integer[] ints = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(ints));
        System.out.println("Исходный массив:\n" + intList);
        System.out.println("\tБез StreamAPI");
        long time = System.nanoTime();
        Iterator<Integer> iter = intList.iterator();
        while (iter.hasNext()) {
            int element = iter.next();
            if (element <= 0 || element % 2 != 0)
                iter.remove();
        }
        intList.sort(Comparator.naturalOrder());
        time = System.nanoTime() - time;
        System.out.println(intList + " - " + time/1000 + " мкс");
        System.out.println("\tC StreamAPI");
        long streamTime = StreamMain.main();
        System.err.println("Работа через StreamAPI медленнее в " + (float) streamTime/time + " раз!!!");
    }
}
