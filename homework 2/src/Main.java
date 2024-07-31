import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework №1");
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number0 = input2.nextInt();
        for(int i = 1, sum = 0; i <= 10 ; i++)
        {
            sum = number0 * i;
            System.out.println(number0 + " * " + i + " = " + sum);
        }

        System.out.println("Homework №2");
        System.out.print("Enter Fibonacci sequence: ");
        number0 = input2.nextInt();
        for(int i = 0, number1 = 1, number2 = 0, number3 = 0, counter = 1; counter <= number0; counter++)
        {
            number3=number1+number2;
            System.out.print(number3 + " ");
            number1=number2;
            number2=number3;
        }

        System.out.print("\nHomework №3");
        Scanner input = new Scanner(System.in);
        int number = 1, maxValue = 0 ,minValue = 9999, counter = 1;
        double totalSum = 0, averageSum = 0;
        while(true)
        {
            System.out.print("\nEnter number: ");
            number = input.nextInt();
            if(number < 0){
                break;
            }
            if(maxValue <= number)
            {
                maxValue = number;
            }
            if(minValue >= number)
            {
                minValue = number;
            }
            totalSum += number;
            counter++;
        }
        averageSum = totalSum/counter;
        System.out.println("\nMaximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Total sum: " + totalSum);
        System.out.println("Average: " + averageSum);
    }
}