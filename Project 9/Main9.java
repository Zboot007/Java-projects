import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main9 {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>(Set.of(5, 1, 2));
//
//        // ====> size, isEmpty
//        System.out.println(set.size());    // 3
//        System.out.println(set.isEmpty()); // false
//
//        // ====> add, addAll
//        set.add(5);                 // [1, 2, 5]
//        set.add(8);                 // [1, 2, 5, 8]
//        set.addAll(List.of(7, 4));  // [1, 2, 4, 5, 7, 8]
//
//        // ====> contains, containsAll
//
////        System.out.println(set.contains(4));                      // true
////        System.out.println(set.contains(3));                      // false
////        System.out.println(set.containsAll(List.of(5, 2, 1, 8))); // true
////        System.out.println(set.containsAll(Set.of(7, 1, 3, 5)));  // false
//
//        // ====> remove, removeAll, clear
//        // [1, 2, 4, 5, 7, 8]
//        System.out.println(set.remove(4));                  // true
//        // [1, 2, 5, 7, 8]
//        System.out.println(set.remove(4));                  // false
//        // [1, 2, 5, 7, 8]
//        System.out.println(set.removeAll(Set.of(4, 5, 1, 3))); // true
//        // [2, 7, 8]
//        System.out.println(set.removeAll(Set.of(1, 3, 5)));    // false
//        // [2, 7, 8]
////        Integer[] arr = (Integer[])set.toArray();
////        Integer[] arr = set.toArray(Integer[]::new);
////        List<Integer> list = set.stream().toList();
////        ArrayList<Integer> arrayList = new ArrayList<>(set);
//
//        set.clear();
//        // []
//
//        System.out.println(set);

//        int[] array = { 5, 10, 15 };
//        ArrayList<String> names = new ArrayList<>(List.of("Mike", "Teresa", "Sam"));
//        HashSet<Character> symbols = new HashSet<>(Set.of('a', 'b', 'c', 'd', 'e'));
//
//        for(int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for(String name : names) {
//            System.out.print(name + " ");
//        }
//        System.out.println();
//        for(char symbol : symbols) {
//            System.out.print(symbol + " ");
//        }
//        System.out.println();


        // red -> [1, 3, 2]
        // green -> [5, 2, 3, 8, 4]

        // intersection -> [3, 2]
        // difference -> [1]
        // symmetricDifference -> [1, 4, 5, 8]
        // union -> [1, 2, 3, 4, 5, 8]

        // yellow -> [1, 3]
        // blue -> [5, 3, 7, 1, 2]
        // purple -> [7, 3, 2, 5]

        // sub -> isSub(yellow, blue) -> true
        // sub -> isSub(yellow, purple) -> false

        // sup -> isSup(blue, yellow) -> true
        // sup -> isSup(purple, yellow) -> false


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
}
