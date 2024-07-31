import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        // byte short int long char float double
        // Byte Short Integer Long Character Float Double
//        Integer[] item = new Integer[10]; // size * 3 / 2 + 1 -> size * 2
//        ArrayList<Integer> array1 = new ArrayList<>();
//        ArrayList<Integer> array2 = new ArrayList<>(10);
//        ArrayList<Integer> array3 = new ArrayList<>(List.of(1, 2, 3)); // [1, 2, 3]

//        System.out.println(array1); // []
//        System.out.println(array2); // []
//        System.out.println(array3); // [1, 2, 3]

        // ====> size()
//        System.out.println(array1.size()); // 0
//        System.out.println(array1.size()); // 0
//        System.out.println(array1.size()); // 3

//        ArrayList<Integer> array = new ArrayList<>();
//
//        // ====> add, addAll
//        array.add(5);                         // [5]
//        array.add(7);                         // [5, 7]
//        array.add(0, 3);         // [3, 5, 7]
//        array.add(2, 6);         // [3, 5, 6, 7]
//
//        array.addAll(List.of(9, 10, 15, 5));  // [3, 5, 6, 7, 9, 10, 15, 5]
//        array.addAll(0, List.of(1, 2));  // [1, 2, 3, 5, 6, 7, 9, 10, 15, 5]

        // ====> contains, containsAll, indexOf, lastIndexOf
//        System.out.println(array.contains(6)); // true
//        System.out.println(array.contains(8)); // false
//
//        System.out.println(array.containsAll(List.of(5, 7, 10, 9, 2))); // true
//        System.out.println(array.containsAll(List.of(1, 7, 5, 4, 3)));  // false

//        System.out.println(array.indexOf(5)); // 3
//        System.out.println(array.indexOf(8)); // -1
//
//        System.out.println(array.lastIndexOf(5)); // 9
//        System.out.println(array.lastIndexOf(4)); // -1

//        // ====> remove, remove, removeAll, retainAll, clear
//        // [1, 2, 3, 5, 6, 7, 9, 10, 15, 5]
//        System.out.println(array.remove(5)); // 7
//        // [1, 2, 3, 5, 6, 9, 10, 15, 5]
//        System.out.println(array.remove(Integer.valueOf(5))); // true
//        // [1, 2, 3, 6, 9, 10, 15, 5]
//        System.out.println(array.remove(Integer.valueOf(4))); // false
//        // [1, 2, 3, 6, 9, 10, 15, 5]
//        System.out.println(array.removeAll(List.of(
//                3, 7, 8, 4, 10, 2
//        ))); // true
//        // [1, 6, 9, 15, 5]
//
//        System.out.println(array.retainAll(List.of(3, 2, 8, 15, 7, 1))); // true
//        // [1, 15]
//        array.clear();
//        // []
//        System.out.println(array);
        // arr2.toArray(Integer[]::new)

//        ArrayList<Integer> arr1 = new ArrayList<>(List.of(
//            10, 20, 30, 40, 50, 60, 70, 80, 90, 100
//        ));
//        ArrayList<Integer> arr2 = new ArrayList<>(List.of(
//            5, 10, 8, 2, 1, 7, 4, 6, 9, 3
//        ));

//        System.out.println(arr1.subList(0, arr1.size())); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
//        System.out.println(arr1.subList(5, arr1.size())); // [60, 70, 80, 90, 100]
//        System.out.println(arr1.subList(0, 5));           // [10, 20, 30, 40, 50]
//        System.out.println(arr1.subList(3, 7));           // [40, 50, 60, 70]


//        arr2.sort((a, b) -> a.compareTo(b));
//
//        System.out.println(arr2);
//        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//        ArrayList<Integer> arr1 = new ArrayList<>(List.of(
//            10, 20, 30, 40, 50, 60, 70, 80, 90, 100
//        ));
//        // ====> set get
//        arr1.set(2, 55);
//
//        System.out.println(arr1.get(9));  // 100
//        System.out.println(arr1.get(2));  // 30

        // ====> Task 1
        ArrayList<String> names = new ArrayList<>(
            List.of(
                "Tom", "Teresa", "Mike", "Naomi", "Sarah",
                "Nicole", "Jessica", "Monika", "John", "Samanta"
            )
        );

        removeNameWithSymbolA(names);

        System.out.println(names);
        // [Tom, Mike, Nicole, John]

        // ====> Task 2
        ArrayList<Integer> numbers = new ArrayList<>(
            List.of(5, 1, 7, 4, 5, 5, 8, 2, 1, 3, 5, 1, 2, 8)
        );

        System.out.println(removeElement(numbers, 5)); // -> 4
        System.out.println(numbers); // [1, 7, 4, 8, 2, 1, 3, 1, 2, 8]
        System.out.println(removeElement(numbers, 1)); // -> 3
        System.out.println(numbers); // [7, 4, 8, 2, 3, 2, 8]
        System.out.println(removeElement(numbers, 3)); // -> 1
        System.out.println(numbers); // [7, 4, 8, 2, 2, 8]
        System.out.println(removeElement(numbers, 9)); // -> 0
        System.out.println(numbers); // [7, 4, 8, 2, 2, 8]

        // ====> Task 3
        ArrayList<String> array = new ArrayList<>(
            List.of(
                "5314232", "285", "372", "824", "928",
                "432321", "5555", "913"
            )
        );

        removeEvenSum(array);

        System.out.println(array);
        // [285, 928, 913]

        // ====> Task 4
        ArrayList<Integer> arr1 = new ArrayList<>(
            List.of(
                1, 1, 2, 3, 5
            )
        );
        ArrayList<Integer> arr2 = new ArrayList<>(
            List.of(
                5, 7, 7, 7, 8, 8, 9, 9, 10
            )
        );
        ArrayList<Integer> arr3 = new ArrayList<>(
            List.of(
                2, 5, 6, 7, 8, 9, 9, 9, 9, 9, 10, 12, 12, 12, 12
            )
        );

        distinct(arr1);
        distinct(arr2);
        distinct(arr3);

        System.out.println(arr1); // [1, 2, 3, 5]
        System.out.println(arr2); // [5, 7, 8, 9, 10]
        System.out.println(arr3); // [2, 5, 6, 7, 8, 9, 10, 12]

        // ====> Task 5
        ArrayList<Integer> one = new ArrayList<>(
            List.of(
                2, 2, 1, 1, 1, 1, 1, 3, 2
            )
        );
        ArrayList<Integer> two = new ArrayList<>(
            List.of(
                1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 2, 1, 1, 3
            )
        );
        ArrayList<Integer> three = new ArrayList<>(
            List.of(
                3, 3, 2, 2, 1, 1, 2, 2, 3, 3, 3, 2, 2, 1, 2, 2, 2, 3
            )
        );

        burst(one);    // [2, 2, 3, 2]
        burst(two);    // [3]
        burst(three);  // []
    }
}
