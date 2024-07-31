import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
//        // ====> Task 2
//        int[] nums1 = { 5, 1, 7, 3 };
//        int[] nums2 = { 1, 8, 2, 10, 13 };
//        int[] nums3 = { 4, 5, 1, 7, 2 };
//
//        System.out.println(goodPair(nums1, 9));   // ""
//        System.out.println(goodPair(nums2, 10));  // "(2,8)"
//        System.out.println(goodPair(nums3, 9));   // "(4,5), (7, 2)"

//        int[] numbers = { 5, 2, 1, 8, 3, 7, 10, 12, 11, 4 };
//
//        System.out.println(Arrays.toString(getPositionsOnlyEven(numbers))); // [1, 3, 6, 7, 9]

        // ====> contains, indexOf, lastIndexOf, startsWith, endsWith
//        String name = "Pagemaster";
//
//        System.out.println(name.contains("e")); // true
//        System.out.println(name.contains("Z")); // false
//
//        System.out.println(name.indexOf('e'));                 // 3
//        System.out.println(name.indexOf('e', 4)); // 8
//        System.out.println(name.indexOf("game"));              // -1
//        System.out.println(name.indexOf("mas"));               // 4
//
//        System.out.println(name.lastIndexOf('e'));                 // 8
//        System.out.println(name.lastIndexOf('e', 4));     // 3
//        System.out.println(name.lastIndexOf("game"));              // -1
//        System.out.println(name.lastIndexOf("mas", 3));   // -1
//
//        System.out.println(name.startsWith("Pa"));                 // true
//        System.out.println(name.startsWith("Pa", 1)); // false
//
//        System.out.println(name.endsWith("master"));                 // true
//        System.out.println(name.endsWith("mas"));                    // false

        // ====> toLowerCase, toUpperCase, toCharArray, substring, concat
//        System.out.println("Mike".toLowerCase()); // mike
//        System.out.println("Mike".toUpperCase()); // MIKE
//        char[] symbols = "Mike".toCharArray();    // {'M', 'i', 'k', 'e'};
//        System.out.println(Arrays.toString(symbols));
//
//        String s = "Pagemaster";
//
//        System.out.println(s.substring(0)); // Pagemaster
//        System.out.println(s.substring(4)); // master
//        System.out.println(s.substring(0, 4));        // Page
//        System.out.println("Mike" + "!!!");
//        System.out.println("Mike".concat("!!!"));

        // ====> trim == strip, stripLeading, stripTrailing
//        String name = "   Mike ";
//
//        System.out.printf("|%s|\n", name);                 // |   Mike |
//        System.out.printf("|%s|\n", name.trim());          // |Mike|
//        System.out.printf("|%s|\n", name.strip());         // |Mike|
//        System.out.printf("|%s|\n", name.stripLeading());  // |Mike |
//        System.out.printf("|%s|\n", name.stripTrailing()); // |   Mike|

        // ====> charAt(int index), length(), isEmpty(), isBlank(), repeat()
//        System.out.println("Mike".charAt(0));        // M
//        System.out.println("Mike".length());         // 4
//        System.out.println("".isEmpty());            // true
//        System.out.println("   ".isBlank());         // true
//        System.out.println("Mike".repeat(3));  // MikeMikeMike


        // ====> replace, replaceFirst, replaceAll
//        String s = "aaabacbaaaaabaabaaaabar";
//
//        System.out.println(s.replace("aaab", "==="));
//        // ===acbaa===aaba===ar
//        System.out.println(s.replaceFirst("aaab", "==="));
//        // ===acbaaaaabaabaaaabar
//        System.out.println(s.replaceAll("aaab", "==="));
//        // ===acbaa===aaba===ar

        // ====> split, join

//        String s = "Anna Sofia Rob";
//
//        String[] r1 = s.split(" ");
//        String[] r2 = s.split("o");
//        String[] r3 = s.split("z");
//        String[] r4 = s.split("");
//
//        System.out.println(Arrays.toString(r1)); // [Anna, Sofia, Rob]
//        System.out.println(Arrays.toString(r2)); // [Anna S, fia R, b]
//        System.out.println(Arrays.toString(r3)); // [Anna Sofia Rob]
//        System.out.println(Arrays.toString(r4)); // [A,n,n,a, ,S,o,f,i,a, ,R,o,b]
//
//        System.out.println(String.join(" ", r1));   // Anna Sofia Rob
//        System.out.println(String.join("o", r2));   // Anna Sofia Rob
//        System.out.println(String.join("fds", r3)); // Anna Sofia Rob
//        System.out.println(String.join("", r4));    // Anna Sofia Rob

//        System.out.println("Mike".toUpperCase().replace('M', 'B'));

        // ====> Character -> isDigit, isLetter, isSpaceChar, toLowerCase, toUpperCase, toString


        // ====> Task 1
        // aeiou
        String s1 = "this is a simple text";
        String s2 = "JAvA is thE most PoPuLar LanguaGe in thE wOrld!";

        System.out.println(countVowels(s1)); // 6
        System.out.println(countVowels(s2)); // 15

        // ====> Task 2
        System.out.println(removeVowels(s1)); // ths s  smpl txt
        System.out.println(removeVowels(s2)); // Jv s th mst PPLr LngG n th wrld!

        // ====> Task 3
        String num1 = "12345";
        String num2 = "745";
        String num3 = "7";

        System.out.println(sumNums(num1)); // 15
        System.out.println(sumNums(num2)); // 16
        System.out.println(sumNums(num3)); // 7

        // ====> Task 4
        String text1 = "A man, a plan, a canal, Panama!";
        String text2 = "Never a foot too far, even.";
        String text3 = "Red roses run no risk sir, on Nurse’s order.";

        System.out.println(isPalindrome(text1)); // true
        System.out.println(isPalindrome(text2)); // true
        System.out.println(isPalindrome(text3)); // true

        // ====> Task 5
        String text4 = "A man a plan a canal Panama";
        String text5 = "Never a foot too far even";
        String text6 = "Red roses run no risk sir on Nurse’s order";

        System.out.println(reverseOnlyGreaterFive(text4));
        // A man a plan a lanac amanaP
        System.out.println(reverseOnlyGreaterFive(text5));
        // reveN a foot too far even
        System.out.println(reverseOnlyGreaterFive(text6));
        // Red sesor run no risk sir on s'esruN redro

        // ====> Task Bonus
        String str1 = "si4mple tex5t a3 thi1s i2s";
        String str2 = "i7n Jav1a th8e i2s th3e worl9d! pop5ular lan6guage mos4t";

        System.out.println(sortedWord(str1));
        // this is a simple text
        System.out.println(sortedWord(str2));
        // Java is the most popular language in the world!
    }
    static int[] getPositionsOnlyEven(int n[]) {
        int q = 0, j = 0;
        for(int i = 0; i < n.length; i += 1) {
            if(n[i] % 2 != 0) {
                q += 1;
            }
        }
        int[] m = new int[q];
        for(int i = 0; i < n.length; i += 1) {
            if(n[i] % 2 == 0) {
                m[j] = i;
                j += 1;
            }
        }
        return m;
    }
    static String goodPair(int ns[], int d) {
        String temp = "";

        for(int outer = 0; outer < ns.length - 1; outer += 1) {
            for(int inner = outer + 1; inner < ns.length; inner += 1) {
                if(ns[outer] + ns[inner] == d) {
					temp += "(" + ns[outer] + ", " + ns[inner] + ") ";
//                    temp += String.format("(%d, %d)", ns[outer], ns[inner]);
                }
            }
        }

        return temp;
    }
}
