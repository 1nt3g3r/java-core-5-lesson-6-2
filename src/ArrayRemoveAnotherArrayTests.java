import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayRemoveAnotherArrayTests {
    public static void main(String[] args) {
        String[] source = {"a", "b", "c", "d"};
        String[] toRemove = {"b", "d"};

        String[] result = new ArrayCleaner().removeArray(source, toRemove);

        System.out.println(Arrays.toString(result));

        //Cool way
        LinkedHashSet<String> allItems = new LinkedHashSet<>(Arrays.asList(source));
        allItems.removeAll(Arrays.asList(toRemove));
        String[] cleanedArray = allItems.toArray(new String[0]);
        System.out.println(Arrays.toString(cleanedArray));
    }
}
