import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = { 2, 2, 2, 2, 2, 2 };
        checkIdentical(arr);
    }

    public static <T> void checkIdentical(T array[])
    {
        Set<T> set = new HashSet<>(Arrays.asList(array));

        if (set.size() == 1 || set.isEmpty()) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
        // Yes
    }
}