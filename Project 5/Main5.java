import java.util.Arrays;

public class Main5 {
    public static void main(String... args) {
//        String name1 = "Anna";
//        String name2 = "Mike";

//        display("hi", name1);
//        display("Good Morning", name2);
//        display("John");
//        display();

//        sum(5, 10);
//        sum(5.5, 10);


//        int result = add(5, 10);
//        System.out.println(result);
//        System.out.println(add(add(5, 10), add(7, add(3, 10))));

//        int max = maxValue(5, 1, 2, 7, 8, 3, 0, -1, -5);
//        int[] arr = { 1, 3, 2 };
//        System.out.println(max);
//        System.out.println(maxValue(5, 7, 1));
//        System.out.println(maxValue(-3, 0, -2));
//        System.out.println(maxValue(arr));
//        int a = 5;
//        int b = 10;
//        swap(a, b);
//        System.out.println(a); // 10
//        System.out.println(b); // 5

//        int[] arr = { 1, 2, 3 };
//        set(arr, 0, 55);
//        System.out.println(Arrays.toString(arr)); // [55, 2, 3]

//        int[] balls = { 5, 2, 3, 4, 4, 3, 4, 5, 4, 5, 3, 2, 4, 2, 3 };

        // ...

//        System.out.println("count 5: " + count(balls, 5)); // count 5: 3
//        System.out.println("count 4: " + count(balls, 4)); // count 4: 5
//        System.out.println("count 3: " + count(balls, 3)); // count 3: 4
//        System.out.println("count 2: " + count(balls, 2)); // count 3: 3

        // ====> Task 1
        int[] arr1 = { 5, 7, 3 };
        int[] arr2 = { 1, 3, 8, 12, 15 };
        int[] arr3 = { 3, 1, 5, 8, 10 };
        int[] arr4 = { 5, 7, 13, 18 };
        int[] arr5 = { 1, 7, 3, 8, 19 };

        System.out.println(isSort(arr1)); // false
        System.out.println(isSort(arr2)); // true
        System.out.println(isSort(arr3)); // false
        System.out.println(isSort(arr4)); // true
        System.out.println(isSort(arr5)); // false

        // ====> Task 2
        int[] nums1 = { 5, 1, 7, 3 };
        int[] nums2 = { 1, 8, 2, 10, 13 };
        int[] nums3 = { 4, 5, 1, 7, 2 };

        System.out.println(goodPair(nums1, 9));   // ""
        System.out.println(goodPair(nums2, 10));  // "(2,8)"
        System.out.println(goodPair(nums3, 9));   // "(4,5), (7, 2)"

        // ====> Task 3
        int[] numbers = { 5, 2, 1, 8, 3, 7, 10, 12, 11, 4 };

        System.out.println(Arrays.toString(getPositionsOnlyEven(numbers))); // [1, 3, 6, 7, 9]

        // ====> Task 4
        int[] array1 = { 33, 52, 11, 80 };
        int[] array2 = { 18, 42, 14, 51, 73 };

        sortArray(array1);
        sortArray(array2);

        System.out.println(Arrays.toString(array1)); // [80, 11, 52, 33]
        System.out.println(Arrays.toString(array2)); // [73, 51, 14, 42, 18]

        // ====> Task 5
        // "X++" | "++X" | "X--" | "--X"
        String[] expression1 = { "X++", "X--", "--X", "X++", "++X", "++X" };
        String[] expression2 = { "--X", "X--", "X++", "--X", "++X", "X--", "--X" };

        System.out.println(execute(expression1)); // 2
        System.out.println(execute(expression2)); // -3
    }

    static int count(int[] array, int searchValue) {
        int counter = 0;

        for(int index = 0; index < array.length; index += 1)
            if(array[index] == searchValue)
                counter += 1;

        return counter;
    }
    static void set(int[] array, int index, int value) {
//        array = new int[] { 55, 2, 3 };
        array[index] = value;
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static int maxValue(int... args) { // []
        if(args.length == 0)
            return 0;

        int temp = args[0];

        for(int index = 1; index < args.length; index += 1)
            if(args[index] > temp)
                temp = args[index];

        return temp;
    }
    static int add(int a, int b) {
        return a + b;
    }
    static void sum(int a, int b) {
        System.out.println(a + b);
    }
    static void sum(double a, double b) {
        System.out.println(a + b);
    }
    static void display(String hi, String name) {
        System.out.println(hi + ", " + name);
    }
    static void display(String name) {
        display("Hello", name);
    }
    static void display() {
        display("Guest");
    }
}
