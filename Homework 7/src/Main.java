import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
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

        // Task 2
        String text = "this is a simple text";

        System.out.println(count(text, 'i'));  // 3
        System.out.println(count(text, 'e'));  // 2
        System.out.println(count(text, 'z'));  // 0
        System.out.println(count(text, 'a'));  // 1

        // Task 3
        String s1 = "Mike is playing golf";
        String s2 = "Naomi is swimming";
        String s3 = "Tom doesn't like Nicole";

        System.out.println(pigIt(s1)); // ikeMay siay layingpay olfgay
        System.out.println(pigIt(s2)); // aomiNay siay wimmingsay
        System.out.println(pigIt(s3)); // omTay oesn'tday ikelay icoleNay
        // Task 4
        String[] words = {
                "nru", "wkor", "palpe",
                "mingswi"
        };
        String[] positions = {
                "120", "0231", "13024",
                "4560123"
        };

        System.out.println(Arrays.toString(test(words, positions)));
        // [run, work, apple, swimming]
    }
    // Task 1 functions
    static void titleMaker(String[] words, int index) {
        for(int inner = 0; inner < words.length; inner += 1) {
            words[inner] = getTitleCase(words[inner]);
        }
    }
    static void replacer(String[] names, int index) {
        String tempWords = names[index].strip();

        if(tempWords.contains("-")) {
            tempWords = tempWords.replace("-", " ");
            names[index] = tempWords;
        }
    }
    static String getTitleCase(String word) {
        word = word.strip();
        if(word.isBlank() || word.isEmpty())
            return word;
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
    static void normalize(String[] names) {
        for(int index = 0; index < names.length; index += 1) {
            replacer(names,index);
            String[] words = names[index].strip().split(" ");
            titleMaker(words,index);
            names[index] = String.join(" ", words);
        }
    }
    // Task 2 functions
    static int count(String text, char letter) {
        int counter = 0 ;
        for(int index = 0; index < text.length(); index += 1) {
            if(text.charAt(index) == letter) {
                counter += 1;
            }
        }
        return counter;
    }
    // Task 3 functions
    static String getReverseLetterWithAY(String[] temp) {
        for(int index = 0; index < temp.length; index += 1) {
            String word = temp[index];
            temp[index] = word.substring(1) + word.charAt(0) + "ay";
        }
        return String.join(" ", temp);
    }
    static String pigIt(String s) {
        String[] temp = s.split(" ");
        return getReverseLetterWithAY(temp);
    }
    // Task 4
    static String[] test(String[] words, String[] positions) {
        int position;
        for(int index = 0; index < positions.length; index += 1) {
            for (int innerIndex = 0; innerIndex < positions[index].length(); innerIndex += 1) {
                position = Integer.parseInt(Character.toString(positions[index].charAt(innerIndex)));
                String[] tempLetterCapacity = words[index].split("");
                getFixedWord(tempLetterCapacity, position, innerIndex);
                words[index] = String.join("",tempLetterCapacity);
            }
        }
        return words;
    }
    static void getFixedWord(String[] tempLetterCapacity, int position, int innerIndex) {
        String temp = tempLetterCapacity[innerIndex];
        tempLetterCapacity[innerIndex] = tempLetterCapacity[position];
        tempLetterCapacity[position] = temp;
    }
}