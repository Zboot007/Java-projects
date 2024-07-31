import java.util.Arrays;

public class Main7 {

    static int countVowels(String s) {
        int count = 0;

        for(int index = 0; index < s.length(); index += 1) {
            String symbol = Character.toString(s.charAt(index));
            if("aeiouAEIOU".contains(symbol)) {
                count += 1;
            }
        }

        return count;
    }
    static String removeVowels(String s) {
        String temp = "";

        for(int index = 0; index < s.length(); index += 1) {
            String symbol = Character.toString(s.charAt(index));
            if(!"aeiouAEIOU".contains(symbol)) {
                temp += symbol;
            }
        }

        return temp;
    }
    static int sumNums(String s) {
        int result = 0;

        for(int index = 0; index < s.length(); index += 1)
            result += Integer.parseInt(Character.toString(s.charAt(index)));

        return result;
    }
    static String getOnlyLetters(String s) {
        String temp = "";

        for(int index = 0; index < s.length(); index += 1) {
            if(Character.isLetter(s.charAt(index))) {
                temp += Character.toLowerCase(s.charAt(index));
            }
        }

        return temp;
    }
    static boolean isPalindrome(String s) {
        String temp = getOnlyLetters(s);

        for(int index = 0; index < temp.length() / 2; index += 1) {
            if(temp.charAt(index) != temp.charAt(temp.length() - index - 1)) {
                return false;
            }
        }

        return true;
    }
    static String reverseString(String s) {
        String temp = "";

        for(int right = s.length() - 1; right >= 0; right -= 1) {
            temp += s.charAt(right);
        }

        return temp;
    }
    static String reverseOnlyGreaterFive(String s) {
        String[] words = s.split(" ");

        for(int index = 0; index < words.length; index += 1) {
            if(words[index].length() >= 5) {
                words[index] = reverseString(words[index]);
            }
        }

        return String.join(" ", words);
    }
    static int getPositionNumber(String s) {
        for(int index = 0; index < s.length(); index += 1) {
            if(Character.isDigit(s.charAt(index))) {
                return index;
            }
        }

        return -1;
    }
    static String sortedWord(String s) {
        String[] words = s.split(" ");
        String[] array = new String[words.length];

        for(int index = 0; index < words.length; index += 1) {
            int number = getPositionNumber(words[index]);
            int position = Integer.parseInt(Character.toString(words[index].charAt(number)));
            array[position - 1] = words[index].substring(0, number) + words[index].substring(number + 1);
        }

        return String.join(" ", array);
    }
    public static void main(String[] args) {
        // ====> Task 1
        // aeiou
//        String s1 = "this is a simple text";
//        String s2 = "JAvA is thE most PoPuLar LanguaGe in thE wOrld!";

//        System.out.println(countVowels(s1)); // 6
//        System.out.println(countVowels(s2)); // 15

        // ====> Task 2
//        System.out.println(removeVowels(s1)); // ths s  smpl txt
//        System.out.println(removeVowels(s2)); // Jv s th mst PPLr LngG n th wrld!
//
        // ====> Task 3
//        String num1 = "12345";
//        String num2 = "745";
//        String num3 = "7";
//
//        System.out.println(sumNums(num1)); // 15
//        System.out.println(sumNums(num2)); // 16
//        System.out.println(sumNums(num3)); // 7

        // ====> Task 4
//        String text1 = "A man, a plan, a canal, Panama!";
//        String text2 = "Never a foot too far, even.";
//        String text3 = "Red roses run no risk sir, on Nurse’s order.";
//
//        System.out.println(isPalindrome(text1)); // true
//        System.out.println(isPalindrome(text2)); // true
//        System.out.println(isPalindrome(text3)); // true
//
//        // ====> Task 5
//        String text4 = "A man a plan a canal Panama";
//        String text5 = "Never a foot too far even";
//        String text6 = "Red roses run no risk sir on Nurse’s order";
//
//        System.out.println(reverseOnlyGreaterFive(text4));
//        // A man a plan a lanac amanaP
//        System.out.println(reverseOnlyGreaterFive(text5));
//        // reveN a foot too far even
//        System.out.println(reverseOnlyGreaterFive(text6));
//        // Red sesor run no risk sir on s'esruN redro
//
//        // ====> Task Bonus
//        String str1 = "si4mple tex5t a3 thi1s i2s";
//        String str2 = "i7n Jav1a th8e i2s th3e worl9d! pop5ular lan6guage mos4t";
//
//        System.out.println(sortedWord(str1));
//        // this is a simple text
//        System.out.println(sortedWord(str2));
//        // Java is the most popular language in the world!


        // ====> Task 1
        String[] names = {
            " anna sofia-rob ", "- teresa palmer", "Jessica Simpson",
            " -mike meyers ", " tom "
        };
        normalize(names);
        System.out.println(Arrays.toString(names));
//        [
//            "Anna Sofia Rob", "Teresa Palmer", "Jessica Simpson",
//            "Mike Meyers", "Tom"
//        ]

        // ====> Task 2
        String text = "this is a simple text";

        System.out.println(count(text, 'i'));  // 3
        System.out.println(count(text, 'e'));  // 2
        System.out.println(count(text, 'z'));  // 0
        System.out.println(count(text, 'a'));  // 1

        // ====> Task 3
        String s1 = "Mike is playing golf";
        String s2 = "Naomi is swimming";
        String s3 = "Tom doesn't like Nicole";

        System.out.println(pigIt(s1)); // ikeMay siay layingpay olfgay
        System.out.println(pigIt(s2)); // aomiNay siay wimmingsay
        System.out.println(pigIt(s3)); // omTay oesn'tday ikelay icoleNay

        // ====> Task 4
        String[] words = {
            "nru", "wkor", "palpe",
            "mimngswi"
        };
        int[] positions = {
          "201", "0312", "20314",
          "35467012"
        }1

        System.out.println(Arrays.toString(test(words, positions)));
        // [run, work, apple, swimming]
    }
}
