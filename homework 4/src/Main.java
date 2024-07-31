import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Task №1");
            Scanner input = new Scanner(System.in);
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < array.length; i += 1)
            {
                array[i] *= 10;
            }
            System.out.println(Arrays.toString(array));
        }
        {
            System.out.println("Task №2");
            int[] balls = { 5, 2, 3, 4, 4, 3, 4, 5, 4, 5, 3, 2, 4, 2, 3 };
            int num1 = 0,num2 = 0,num3 = 0, num4 = 0;
            for(int i = 0; i<balls.length;i++)
            {
                if(balls[i] == 2 )
                {
                    num1 = balls[i];
                    num1 += 1;
                }
                else if(balls[i] == 3 )
                {
                    num2 = balls[i];
                    num2 += 1;
                }
                else if(balls[i] == 4 )
                {
                    num3 = balls[i];
                    num3 += 1;
                }
                else if(balls[i] == 5 )
                {
                    num4 = balls[i];
                    num4 += 1;
                }
            }
            System.out.println("Count 2: " + num1);
            System.out.println("Count 3: " + num2);
            System.out.println("Count 4: " + num3);
            System.out.println("Count 5: " + num4);
        }
        {
            System.out.println("Task №3");
            String[] fruits = { "banana", "apple", "orange", "orange", "banana", "apple", "apple", "orange" };
            String[] apples;
            String[] bananas = new String[fruits.length];
            String[] oranges = new String[fruits.length];
            int counter1 = 0, counter2 = 0, counter3 = 0;
            for(int i = 0; i< fruits.length;i++)
            {
                if(fruits[i].equals("apple"))
                {
                    counter1 += 1;
                }
                if(fruits[i].equals("banana"))
                {
                    counter2 += 1;
                }
                if(fruits[i].equals("orange"))
                {
                    counter3 += 1;
                }
            }
            apples = new String[counter1];
            bananas = new String[counter2];
            oranges = new String[counter3];
            counter1 = 0;
            counter2 = 0;
            counter3 = 0;
            for(int i = 0; i < fruits.length; i++)
            {
                if(fruits[i].equals("apple"))
                {
                    apples[counter1] = fruits[i];
                    counter1++;
                }
                else if(fruits[i].equals("banana"))
                {
                    bananas[counter2] = fruits[i];
                    counter2++;
                }
                else if(fruits[i].equals("orange"))
                {
                    oranges[counter3] = fruits[i];
                    counter3++;
                }
            }
            System.out.println(Arrays.toString(apples));  // [apple, apple, apple]
            System.out.println(Arrays.toString(bananas)); // [banana, banana]
            System.out.println(Arrays.toString(oranges)); // [orange, orange, orange]
        }
        {
            System.out.println("Task №4");
            int[] numbers = { 5, -2, 1, 3, -5, -7, 8, 4, 3, -4, -1, 2 };
            int countPositive = 0;
            int sumNegative = 0;
            for(int index = 0; index<numbers.length;index++)
            {
                if(numbers[index] >= 0)
                {
                    countPositive += 1;
                }
                else
                {
                    sumNegative += numbers[index];
                }
            }
            System.out.println("count positive -> " + countPositive); // 7
            System.out.println("sum negative -> " + sumNegative);     // - 19
        }
    }
}