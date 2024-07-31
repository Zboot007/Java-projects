import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
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

        //Task 2
        System.out.println("Task 2");
        int[] nums1 = { 5, 1, 7, 3 };
        int[] nums2 = { 1, 8, 2, 10, 13};
        int[] nums3 = { 4, 5, 1, 7, 2};

        System.out.println(goodPair(nums1, 9));   // ""
        System.out.println(goodPair(nums2, 10));  // "(2,8)"
        System.out.println(goodPair(nums3, 9));   // "(4,5), (7, 2)"

        //Task 3
        System.out.println("Task 3");
        int[] numbers = { 5, 2, 1, 8, 3, 7, 10, 12, 11, 4 };

        System.out.println(Arrays.toString(getPositionsOnlyEven(numbers))); // [1, 3, 6, 7, 9]

        //Task 4 :(
        System.out.println("Task 4");
        int[] array1 = { 33, 52, 11, 80 };
        int[] array2 = { 18, 42, 14, 51, 73};

        sortArray(array1);
        sortArray(array2);

        System.out.println(Arrays.toString(array1)); // [80, 11, 52, 33]
        System.out.println(Arrays.toString(array2)); // [73, 51, 14, 42, 18]

        //task 5
        System.out.println("Task 5");
        String[] expression1 = { "X++", "X--", "--X", "X++", "++X", "++X" };
        String[] expression2 = { "--X", "X--", "X++", "--X", "++X", "X--", "--X" };

        System.out.println(execute(expression1)); // 2
        System.out.println(execute(expression2)); // -3

    }
    static boolean isSort(int[] array){
        boolean a = true;

        int[] arrayCopy = array;
        int counter = 1;

        for (int i = 0; i < array.length; i += 1)
        {
            if(array[i] <= arrayCopy[counter]) {
                a = true;
                if(counter < array.length - 1)
                    counter += 1;

            } else
                return false;
        }
        return a;
    }
    static String goodPair(int[] nums, int combinationValue){

        String emptyLine = "' '";
        String nothing = "";

        int sum = 0;
        int[] capacitor = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                sum = nums[i] + nums[j];
                if(sum == combinationValue && j < i) {
                    System.out.printf("'(%d, %d)'\n", nums[i], nums[j]);
                }
                else if(sum == combinationValue && nums[j] == nums[i])
                {
                    capacitor[i] = nums[i];
                    capacitor[j] = nums[j];
                    if(i < j)
                        System.out.printf("'(%d, %d)'\n", capacitor[i], capacitor[j]);
                }
                else
                    sum = 0;
            }
        }
        return nothing;
    }
    static long[] getPositionsOnlyEven(int[] numbers){
        int counter = 0;
        long[] arrayCopy;

        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] % 2 == 0)
                counter += 1;

        arrayCopy = new long[counter];
        counter = 0;

        for(int i = 0; i < numbers.length; i += 1)
            if(numbers[i] % 2 == 0) {
                arrayCopy[counter] = i;
                counter += 1;
            }

        return arrayCopy;
    }
    static void sortArray(int[] array){
        int firstNumber = 0, lastNumber = 0;

        for(int i = 0; i < array.length / 2; i += 1)
        {
            firstNumber = array[i];
            lastNumber = array[array.length - 1 - i];
            array[i] = lastNumber;
            array[array.length - 1 - i] = firstNumber;
        }
    }
    static int execute(String[] expression){
        int adder = 0;
        for(int i = 0 ; i < expression.length; i += 1){
            if(expression[i].equals("X++") || expression[i].equals("++X"))
                adder += 1;
            if(expression[i].equals("X--") || expression[i].equals("--X"))
                adder -= 1;
        }
        return adder;
    }
}