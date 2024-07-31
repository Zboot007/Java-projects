public class Main11 {
    public static void main(String[] args) {
//        var result = repeat("Mike", 3);
//        System.out.println(result); // MikeMikeMike


//        StringBuilder builder = new StringBuilder();
//        // ====> indexOf, lastIndexOf, substring, isEmpty, length, replace
//
//        // ====> append, insert
//        builder.append("Mike")
//               .append(" is")
//               .append(" playing ")
//               .append("football!");
//
//        builder.insert(4, "===");
//
//        // ====> setCharAt
//        builder.setCharAt(0, 'B');
//
//        // ====> delete, deleteCharAt
//        builder.delete(4, 7)
//               .deleteCharAt(0)
//               .insert(0, 'M');
//
//
//        System.out.println(builder);
//        System.out.println((char)65);
//        System.out.println((int)'A');

        // ====> Task 1
        String s1 = "This is A sImple text";
        String s2 = "Mike is plaYing football";
        String s3 = "JavaScript is The Most poPuLar LanGuaGe iN The wOrld";

        String r1 = getAlphabetPosition(s1);
        String r2 = getAlphabetPosition(s2);
        String r3 = getAlphabetPosition(s3);

        System.out.println(r1);
        // "20 8 9 19 9 19 16 12 1 25 9 14 7 6 15 15 20 2 1 12 12"
        System.out.println(r2);
        // ...
        System.out.println(r3);
        // ...

        // ====> Task 2
        System.out.println(getAlphabet(r1)); // "t h i s i s a s i m p l e t e x t"
        System.out.println(getAlphabet(r2)); // ...
        System.out.println(getAlphabet(r3)); // ...

        // ====> Task 3
        String str1 = "aaaabbaaferrea";
        String str2 = "dfffffffffffffffffaeferfrrr";
        String str3 = "edaaaerrrffffaeerrrre";

        String result1 = encode(str1);
        String result2 = encode(str2);
        String result3 = encode(str3);

        System.out.println(result1); // "a4b2a2f1e1r2e1a1"
        System.out.println(result2); // "d1f17a1e1f1e1r1f1r3"
        System.out.println(result3); // "e1d1a3e1r3f4a1e2r4e1"

        // ====> Task 4
        System.out.println(decode(result1)); // "aaaabbaaferrea"
        System.out.println(decode(result2)); // "dfffffffffffffffffaeferfrrr"
        System.out.println(decode(result3)); // "edaaaerrrffffaeerrrre"

        // ====> Task 5
        String text1 = "aabbbecccrrreeee";
        String text2 = "abfcde";
        String text3 = "aarrfffeeeeff";
        String text4 = "rrrraabba";
        String text5 = "aabbddeffaabb";

        System.out.println(maxRepeatSymbol(text1)); // e
        System.out.println(maxRepeatSymbol(text2)); // f
        System.out.println(maxRepeatSymbol(text3)); // e
        System.out.println(maxRepeatSymbol(text4)); // r
        System.out.println(maxRepeatSymbol(text5)); // f
    }
    static String repeat(String s, int count) {
        StringBuilder stringBuilder = new StringBuilder();

        while(--count >= 0)
            stringBuilder.append(s);

        return stringBuilder.toString();
    }
}
