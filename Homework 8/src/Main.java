import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    // Task 1
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(
                List.of(
                        "Tom", "Teresa", "Mike", "Naomi", "Sarah",
                        "Nicole", "Jessica", "Monika", "John", "Samanta", "Alex"
                )
        );

        removeNameWithSymbolA(names);

        System.out.println(names);
        // [Tom, Mike, Nicole, John]

        // Task 2

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

        // Task 3

        ArrayList<String> array = new ArrayList<>(
                List.of(
                        "5314232", "285", "372", "824", "928",
                        "432321", "5555", "913"
                )
        );

        removeEvenSum(array);

        System.out.println(array);
        // [285, 372, 928, 913, 432321]

        // Task 4

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

        // Task 5

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
        System.out.println();
        burst(one);    // [2, 2, 3, 2]
        burst(two);    // [3]
        burst(three);  // []
        System.out.println(one); // [2, 2, 3, 2]
        System.out.println(two); // [3]
        System.out.println(three); // []

    }
    static void removeNameWithSymbolA(ArrayList<String> names) {
        for (int index = 0; index < names.size(); index += 1) {
            if (names.get(index).contains("a")) {
                names.remove(names.get(index));
                index -= 1;
            }
        }
    }
    static int removeElement(ArrayList<Integer> numbers, int remover) {
        int counterNumber = 0;

        for (int index = 0; index < numbers.size(); index += 1) {
            if (numbers.get(index) == remover) {
                counterNumber += 1;
                numbers.remove(numbers.get(index));
                index -= 1;
            }
        }
        return counterNumber;
    }
    static void  removeEvenSum(ArrayList<String> array) {
        for (int index = 0; index < array.size(); index += 1) {
            String str = array.get(index);
            int result = 0;

            for (int innerIndex = 0; innerIndex < str.length(); innerIndex += 1) {
                result += Integer.parseInt(Character.toString(str.charAt(innerIndex)));
            } if(result % 2 == 0) {
                array.remove(array.get(index));
                index -= 1;
            }
        }
    }
    static void distinct(ArrayList<Integer> array) {
        for (int index = 1; index < array.size(); index += 1) {
            if (array.get(index - 1).equals(array.get(index))) {
                array.remove(array.get(index));
                index -= 1;
            }
        }
    }
    static void burst(ArrayList<Integer> numbers) {
        boolean checker = true;
        while(checker) {
            checker = false;
            for (int index = 0; index < numbers.size() - 2; index += 1) {
                int firstNumber = numbers.get(index);
                int secondNumber = numbers.get(index + 1);
                int thirdNumber = numbers.get(index + 2);

                if (firstNumber == secondNumber && secondNumber == thirdNumber) {
                    int innerIndex = index + 2;
                    while (innerIndex < numbers.size() && firstNumber == numbers.get(innerIndex)) {
                        numbers.remove(innerIndex);
                    }
                    numbers.remove(index + 1);
                    numbers.remove(index);
                    checker = true;
                    break;
                }
            }
        }
    }
}