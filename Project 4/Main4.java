import java.util.Arrays;
import java.util.Scanner;
// ====> DZ3 from main3
// ====> DZ 3
// enter number: 4
// enter number: 3
// enter number: 1
// enter number: 8
// enter number: 7
// enter number: 5
// enter number: 2
// enter number: -1

//int minValue = 0, maxValue = 0, counter = 0, totalSum = 0;
//Scanner input = new Scanner(System.in);
//
//        while(true) {
//                System.out.print("enter number: ");
//int number = input.nextInt();
//            if(number < 0) {
//        break;
//        }
//
//        if(counter == 0) {
//totalSum = minValue = maxValue = number;
//            } else {
//                    if(number > maxValue) {
//maxValue = number;
//                } else if(number < minValue) {
//minValue = number;
//                }
//totalSum = totalSum + number;
//            }
//
//                    ++counter;
//        }
//
//
//                System.out.printf("min value -> %d\n", minValue);
//        System.out.printf("max value -> %d\n", maxValue);
//        System.out.printf("total sum -> %d\n", totalSum);
//        System.out.printf("average sum -> %d\n", totalSum / counter);
//
//// min value -> 1
//// max value -> 8
//// max value -> 8
//// total sum -> 34
//// average sum -> 34 / 7 -> 4.857142857142857
////        System.out.printf("%.2f", 4.857142857142857);


public class Main4 {
    public static void main(String[] args) {
        // 0 '\0' false null

        int day1 = 500;
        int day2 = 350;
        int day3 = 425;
        int day4 = 730;
        int day5 = 1280;
        int day6 = 1080;
        int day7 = 1300;


        // < 0 .. salary.length - 1 >
//        int[] salary4;
//        salary4 = new int[]{ 500, 350, 425, 730, 1280, 1080, 1300 };
//        salary4 = new int[]{ 500, 350 };
//        int[] salary3 = new int[]{ 500, 350, 425, 730, 1280, 1080, 1300 };
//        int[] salary2 = { 500, 350, 425, 730, 1280, 1080, 1300 };
//        int[] salary;
//        salary = new int[7]; // [0, 0, 0, 0, 0, 0, 0]
//        salary[0] = 500;
//        salary[1] = 350;
//        salary[2] = 425;
//        salary[3] = 730;
//        salary[4] = 1280;
//        salary[5] = 1080;
//        salary[6] = 1300;
//        System.out.println(salary[5]);  // 1080
//
//        System.out.println(Arrays.toString(salary)); // [500, 350, 425, 730, 1280, 1080, 1300]

//        int[] salary = { 500, 350, 425, 730, 1280, 1080, 1300 };
//
//        int minValue = salary[0];
//        int maxValue = salary[0];
//        int totalSum = salary[0];
//
//        for(int index = 1; index < salary.length; index += 1) {
//            if(salary[index] > maxValue) {
//                maxValue = salary[index];
//            } else if(salary[index] < minValue) {
//                minValue = salary[index];
//            }
//            totalSum += salary[index];
//        }
//
//        System.out.printf("min value -> %d\n", minValue);                   // 350
//        System.out.printf("max value -> %d\n", maxValue);                   // 1300
//        System.out.printf("total sum -> %d\n", totalSum);                   // 5665
//        System.out.printf("average sum -> %d\n", totalSum / salary.length); // 809

//        int[] arr = { 1, 2, 3 };
//        int[] arr2 = arr;
//
//        arr[0] = 55;
//
//        System.out.println(Arrays.toString(arr));  // [55, 2, 3]
//        System.out.println(Arrays.toString(arr2)); // [55, 2, 3]
//
//        int[] numbers = new int[] { 1, 2, 3 };
//        int[] numbers2 = new int[3]; // [0, 0, 0]
//
//        for(int index = 0; index < numbers.length; index += 1) {
//            numbers2[index] = numbers[index];
//        }
//        // [1, 2, 3]
//
//        numbers2[0] = 55;
//
//        System.out.println(Arrays.toString(numbers));   // [1, 2, 3]
//        System.out.println(Arrays.toString(numbers2));  // [55, 2, 3]

        // ====> DZ 1
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //...

        System.out.println(Arrays.toString(array)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // ====> DZ 2
        int[] balls = { 5, 2, 3, 4, 4, 3, 4, 5, 4, 5, 3, 2, 4, 2, 3 };

        // ...

        System.out.println("count 5: "); // count 5: 3
        System.out.println("count 4: "); // count 4: 5
        System.out.println("count 3: "); // count 3: 4
        System.out.println("count 2: "); // count 3: 3

        // ====> DZ 3
        String[] fruits = { "banana", "apple", "orange", "orange", "banana", "apple", "apple", "orange" };
        String[] apples = new String[0];
        String[] bananas = new String[0];
        String[] oranges = new String[0];

        //...

        System.out.println(Arrays.toString(apples));  // [apple, apple, apple]
        System.out.println(Arrays.toString(bananas)); // [banana, banana]
        System.out.println(Arrays.toString(oranges)); // [orange, orange, orange]

        // ====> DZ 4
        int[] numbers = { 5, -2, 1, 3, -5, -7, 8, 4, 3, -4, -1, 2 };
        int countPositive = 0;
        int sumNegative = 0;

        //...

        System.out.println("count positive -> " + countPositive); // 7
        System.out.println("sum negative -> " + sumNegative);     // - 19

    }
}

