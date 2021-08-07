import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static long main() {
        List<Integer> inputList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        long time = System.nanoTime();
        List<Integer> outputList = inputList.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        time = System.nanoTime() - time;
        System.out.println(outputList + " - " + time/1000 + " мкс");
        return time;
    }
}
