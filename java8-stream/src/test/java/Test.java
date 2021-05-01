import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author jun
 * @date 2021年04月29日 11:25
 */
public class Test {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        List<String> ints = Arrays.asList(array);
        List<String> list = new ArrayList<String>(ints);
        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int i1 = random.nextInt(list.size());
            System.out.print(list.get(i1));
            list.remove(i1);
        }
        System.out.println();
        StraemUUID();
    }

    public static void StraemUUID() {
        new Random().ints(1, 9)
                .distinct()
                .limit(4)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::print);
    }
}
