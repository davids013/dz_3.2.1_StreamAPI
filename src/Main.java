import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tЗадача 1: Работа с числами\n");
        List<Integer> inputList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> outputList = inputList.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(inputList);
        System.out.println(outputList);
    }
}
