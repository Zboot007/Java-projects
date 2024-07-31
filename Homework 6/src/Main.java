import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println();
        String s1 = "this is a simple text";
        String s2 = "JAvA is thE most PoPuLar LanguaGe in thE wOrld!";

        System.out.println(countVowels(s1)); // 6
        System.out.println(countVowels(s2)); // 15

        // Task 2
        System.out.println();
        System.out.println(removeVowels(s1)); // ths s  smpl txt
        System.out.println(removeVowels(s2)); // Jv s th mst PPLr LngG n th wrld!

        // Task 3
        System.out.println();
        String num1 = "12345";
        String num2 = "745";
        String num3 = "7";

        System.out.println(sumNums(num1)); // 15
        System.out.println(sumNums(num2)); // 16
        System.out.println(sumNums(num3)); // 7

        // Task 4
        System.out.println();
        String text1 = "A man, a plan, a canal, Panama!";
        String text2 = "Never a foot too far, even.";
        String text3 = "Red roses run no risk sir, on Nurse’s order.";

        System.out.println(isPalindrome(text1)); // true
        System.out.println(isPalindrome(text2)); // true
        System.out.println(isPalindrome(text3)); // true

        // Task 5
        System.out.println();
        String text4 = "A man a plan a canal Panama";
        String text5 = "Never a foot too far even";
        String text6 = "Red roses run no risk sir on Nurse’s order";

        System.out.println(reverseOnlyGreaterFive(text4));
        // A man a plan a lanac amanaP
        System.out.println(reverseOnlyGreaterFive(text5));
        // reveN a foot too far even
        System.out.println(reverseOnlyGreaterFive(text6));
        // Red sesor run no risk sir on s'esruN redro

        //Bonus task

        String str1 = "si4mple tex5t a3 thi1s i2s";
        String str2 = "i7n Jav1a th8e i2s th3e worl9d! pop5ular lan6guage mos4t";

        System.out.println(sortedWord(str1));
        // this is a simple text
        System.out.println(sortedWord(str2));
        // Java is the most popular language in the world!

    }
    static int countVowels(String s) {
        String[] s2 = s.toLowerCase().trim().split("");
        int quantity = 0;
        for(int index = 0; index < s.length(); index += 1)
            if(s2[index].equals("a") || s2[index].equals("e") || s2[index].equals("i") || s2[index].equals("o") || s2[index].equals("u"))
                quantity += 1;
        return quantity;
    }
    static String removeVowels(String str) {
        String[] s2 = str.toLowerCase().split("");
        for(int index = 0; index < str.length(); index += 1)
            if(s2[index].equals("a") || s2[index].equals("e") || s2[index].equals("i") || s2[index].equals("o") || s2[index].equals("u"))
                s2[index] = "";
        String s = String.join("", s2);
        return s;
    }
    static int sumNums(String nums) {
        int firstQuantity = Integer.parseInt(nums);
        int secondQuantity = 0;
        int thirdQuantity = 0;
        int fourthQuantity = 0;
        int sum = 0;

        for(int index = 1; index <= nums.length(); index += 1) {
            fourthQuantity = (int)Math.pow(10, index);
            secondQuantity = firstQuantity % fourthQuantity;
            thirdQuantity = firstQuantity % (fourthQuantity / 10);
            sum += (secondQuantity - thirdQuantity) / (fourthQuantity / 10);
        }
        return sum;
    }
    static boolean isPalindrome(String text) {
        String temp = text.toLowerCase();
        String[] arrayText = temp.split("");
        String secondTemp = "";
        String newSecondArray = "";

        for(int index = 0; index < arrayText.length; index += 1) {
            if(arrayText[index].equals(",") || arrayText[index].equals("!")|| arrayText[index].equals(" ") || arrayText[index].equals("’") || arrayText[index].equals("."))
                arrayText[index] = "";
        }

        temp = String.join("", arrayText);

        for(int index = 0; index < arrayText.length / 2; index += 1) {
            newSecondArray = arrayText[index];
            arrayText[index] = arrayText[arrayText.length - index - 1];
            arrayText[arrayText.length - index - 1] = newSecondArray;
        }

        secondTemp = String.join("", arrayText);

        return secondTemp.equals(temp);
    }
    static String reverseOnlyGreaterFive(String text) {
        String[] str = text.split(" ");
        String capacitor = "";

        for(int index = 0; index < str.length; index += 1) {
            capacitor = str[index];

            if(capacitor.length() >= 5) {
                String[] newStr = capacitor.split("");
                String transformer = "";

                for(int innerIndex = 0; innerIndex < newStr.length / 2; innerIndex += 1) {
                    String temp = newStr[innerIndex];
                    newStr[innerIndex] = newStr[newStr.length - innerIndex - 1];
                    newStr[newStr.length - innerIndex - 1] = temp;
                    transformer = String.join("", newStr);
                }
                str[index] = transformer;
            }
        }
        capacitor = String.join(" ", str);
        return capacitor;
    }
    static String sortedWord(String str) {
        int number = 0;
        String position = "";
        String[] temp = str.split(" ");
        String[] array= {};
        String analyzer = "";

        for(int index = 0; index < temp.length; index += 1) {
            analyzer = temp[index];
            array = analyzer.split("");

            for(int innerIndex = 0; innerIndex < array.length; innerIndex += 1) {

                for(int inner = 1; inner <= array.length; inner += 1) {
                    position = "" + inner;
                    String capacitor = "";
                    if (array[innerIndex].equals(position)) {
                        array[innerIndex] = "";
                        number = Integer.parseInt(position);
                        capacitor = temp[number - 1];
                        temp[number - 1] = String.join("", array);
                        temp[index] = capacitor;
                    }
                    else if(position.equals(array[innerIndex]))
                        array[innerIndex] = "";
                }
            }
        }
        str = String.join(" ", temp);
        return str;
    }
}