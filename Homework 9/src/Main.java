import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> green = new ArrayList<>(List.of(1, 3, 2));
        ArrayList<Integer> red = new ArrayList<>(List.of(5, 2, 3, 8, 4));
        // ====> Task 1
        System.out.println(intersection(green, red)); // [2, 3]
        // ====> Task 2
        System.out.println(difference(green, red)); // [1]
        System.out.println(difference(red, green)); // [5, 8, 4]
        // ====> Task 3
        System.out.println(symmetricDifference(green, red)); // [1, 5, 8, 4]
        // ====> Task 4
        System.out.println(union(green, red)); // [1, 2, 3, 4, 5, 8]
        // ====> Task 5
        ArrayList<Integer> yellow = new ArrayList<>(List.of(1, 3));
        ArrayList<Integer> blue = new ArrayList<>(List.of(5, 3, 7, 1, 2));
        ArrayList<Integer> purple = new ArrayList<>(List.of(7, 3, 2, 5));

        System.out.println(isSub(yellow, blue));   // -> true
        System.out.println(isSub(yellow, purple)); // -> false

        System.out.println(isSup(blue, yellow));   // -> true
        System.out.println(isSup(purple, yellow)); // -> false
    }
    static ArrayList<Integer> intersection(ArrayList<Integer> green, ArrayList<Integer> red) {
        ArrayList<Integer> result = new ArrayList<>(List.of());
        for(Integer value : green)
            if(red.contains(value) && !result.contains(value))
                result.add(value);
        return result;
    }
    static ArrayList<Integer> difference(ArrayList<Integer> green, ArrayList<Integer> red) {
        ArrayList<Integer> result = new ArrayList<>(List.of());
        for(Integer value : green)
            if(!red.contains(value) && !result.contains(value))
                result.add(value);
        return result;
    }
    static ArrayList<Integer> symmetricDifference(ArrayList<Integer> green, ArrayList<Integer> red) {
        ArrayList<Integer> result = new ArrayList<>(List.of());
        for(Integer value : green) {
            if (!red.contains(value) && !result.contains(value))
                result.add(value);
            for(Integer innerValue : red)
                if (!green.contains(innerValue) && !result.contains(innerValue))
                    result.add(innerValue);
        }
        return result;
    }
    static ArrayList<Integer> union(ArrayList<Integer> green, ArrayList<Integer> red) {
        ArrayList<Integer> result = new ArrayList<>(List.of());
        for(Integer value : green)
            if (!result.contains(value))
                result.add(value);
        for(Integer value : red)
            if (!result.contains(value))
                result.add(value);
        return result;
    }
    static boolean isSub(ArrayList<Integer> firstColor, ArrayList<Integer> secondColor) {
        boolean result = false;
        for(Integer color : firstColor) {
            if (secondColor.contains(color))
                result = true;
            else
                return false;
        }
        return result;
    }
    static boolean isSup(ArrayList<Integer> firstColor, ArrayList<Integer> secondColor) {
        boolean result = false;
        for(Integer color : secondColor) {
            if (firstColor.contains(color))
                result = true;
            else
                return false;
        }
        return result;
    }
}