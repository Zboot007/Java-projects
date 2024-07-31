import java.util.*;

public class Main {
    // Task 1
    static HashMap<String, String> getPhoneListReverse(HashMap<String, String> map) {
        var answer = new HashMap<String, String>();

        for (var pair : map.entrySet())
            answer.put(pair.getValue(), pair.getKey());

        return answer;
    }

    // Task 2
    static HashMap<String, ArrayList<String>> getEnRuDictionary(HashMap<String, ArrayList<String>> ruEnDictionary) {
        HashMap<String, ArrayList<String>> result = new HashMap<>();

        for (var entry : ruEnDictionary.entrySet()) {
            String ruWord = entry.getKey();
            ArrayList<String> enWords = entry.getValue();

            for (var enWord : enWords) {
                if (!result.containsKey(enWord))
                    result.put(enWord, new ArrayList<>());

                result.get(enWord).add(ruWord);
            }
        }

        return result;
    }

    // Task 3
    static HashMap<String, Double> getBestStudent(HashMap<String, Double> students) {
        double number = 0;
        String name = "";
        HashMap<String, Double> result = new HashMap<>();
        for (var student : students.values())
            if (number < student)
                number = student;
        for (var value : students.entrySet())
            if (number == value.getValue())
                name = value.getKey();

        result.put(name, number);
        return result;
    }

    // Task 4
    static HashMap<String, Integer> getBestStudent2(HashMap<String, HashMap<String, ArrayList<Integer>>> student) {
        HashMap<String, Integer> result = new HashMap<>();
        String name = "";
        int temp = 0, counterValue = 0;
        int sum = 0, previousStudentGrade = 0;

        for (var entry : student.entrySet()) {
            counterValue += 1;
            for (var innerMapValue : entry.getValue().values()) {
                for (var innerValue : innerMapValue) {
                    sum += innerValue;
                }
            }
            if (sum > previousStudentGrade) {
                name = entry.getKey();
                temp = sum;
                previousStudentGrade = sum;
            }
            sum = 0;
        }

        result.put(name, temp);
        return result;
    }

    // Task 5
    static HashMap<String, ArrayList<String>> getDictFromNames1(ArrayList<String> words) {
        HashMap<String, ArrayList<String>> result = new HashMap<>();
        result.put("N", new ArrayList<>());
        result.put("T", new ArrayList<>());
        result.put("M", new ArrayList<>());
        result.put("J", new ArrayList<>());
        result.put("S", new ArrayList<>());
        result.put("R", new ArrayList<>());

        for (String word : words) {
            if (word.startsWith("N")) {
                result.get("N").add(word);
            } else if (word.startsWith("T")) {
                result.get("T").add(word);
            } else if (word.startsWith("M")) {
                result.get("M").add(word);
            } else if (word.startsWith("J")) {
                result.get("J").add(word);
            } else if (word.startsWith("S")) {
                result.get("S").add(word);
            } else if (word.startsWith("R")) {
                result.get("R").add(word);
            }
        }
        return result;
    }

    //Task Bonus
    static HashMap<Integer, ArrayList<String>> getDictFromNames2(ArrayList<String> words) {
        int counter = 0;
        HashMap<Integer, ArrayList<String>> result = new HashMap<>();
        ArrayList<Integer> lengthArr = new ArrayList<>();
        for(var word : words) {
            if(!lengthArr.contains(word.length())) {
                lengthArr.add(word.length());
                counter += 1;
            }
        }
        for(int index = 0; index < counter; index += 1) {
            result.put(lengthArr.get(index), new ArrayList<>());
        }

        for(var word : words)
        {
            for(var len : lengthArr) {
                if(word.length() == len) {
                    result.get(len).add(word);
                }
            }
        }
        return result;
    }

    // Main
    public static void main(String[] args) {
        var phoneList = new HashMap<>(
                Map.ofEntries(
                        Map.entry("Tom", "903357021"),
                        Map.entry("Sam", "946652112"),
                        Map.entry("Jessica", "933814015")
                )
        );
        var phoneListReverse = getPhoneListReverse(phoneList);

        System.out.println(phoneListReverse);

        // ====> Task 2
        var ruEnDictionary = new HashMap<String, ArrayList<String>>(
                Map.ofEntries(
                        Map.entry("бежать", new ArrayList<>(
                                List.of("run", "escape")
                        )),
                        Map.entry("побег", new ArrayList<>(
                                List.of("escape", "runaway", "shoot")
                        )),
                        Map.entry("плавать", new ArrayList<>(
                                List.of("swim", "sail", "float")
                        )),  Map.entry("всплывать", new ArrayList<>(

                                List.of("emerge", "surface", "float")
                        ))
                )
        );
        var enRuDictionary = getEnRuDictionary(ruEnDictionary);
        System.out.println(enRuDictionary);
////        {
////            "run": ["бежать"],
////            "escape": ["бежать", "побег"],
////            "runaway": ["побег"],
////            "shoot": ["побег"],
////            "swim": ["плавать"],
////            "sail": ["плавать"],
////            "float": ["плавать", "всплывать"],
////            "emerge": ["всплывать"],
////            "surface": ["всплывать"],
////        }
////
//        // ====> Task 3
        var students = new HashMap<>(
                Map.ofEntries(
                        Map.entry("Nicole", 5.5),
                        Map.entry("Jessica", 7.5),
                        Map.entry("Naomi", 8.5),
                        Map.entry("Mike", 6.0),
                        Map.entry("Sam", 6.5),
                        Map.entry("John", 8.0),
                        Map.entry("Rob", 7.5)
                )
        );

        var student = getBestStudent(students);
        System.out.println(student); // {Naomi=8.5}
//        System.out.printf("(name: %s, score: %d)", student.getKey(), student.getValue());
//         (name: Naomi, score: 8.5)
//
//        // ====> Task 4
        var students2 = new HashMap<>(
                Map.ofEntries(
                        Map.entry("Nicole", // 46
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(5, 3, 4, 4))),
                                                Map.entry("History", new ArrayList<>(List.of(2, 3, 3, 3))),
                                                Map.entry("English", new ArrayList<>(List.of(5, 4, 5, 5)))
                                        )
                                )
                        ),
                        Map.entry("Jessica", // 38
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(2, 2, 3, 2))),
                                                Map.entry("History", new ArrayList<>(List.of(5, 5, 4, 5))),
                                                Map.entry("English", new ArrayList<>(List.of(2, 2, 3, 3)))
                                        )
                                )),
                        Map.entry("Naomi", // 44
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(4, 3, 3, 4))),
                                                Map.entry("History", new ArrayList<>(List.of(5, 4, 4, 3))),
                                                Map.entry("English", new ArrayList<>(List.of(2, 3, 4, 5)))
                                        )
                                )),
                        Map.entry("Mike", // 41
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(2, 4, 4, 4))),
                                                Map.entry("History", new ArrayList<>(List.of(5, 5, 4, 4))),
                                                Map.entry("English", new ArrayList<>(List.of(2, 3, 2, 2)))
                                        )
                                )),
                        Map.entry("Sam", // 43
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(5, 5, 5, 5))),
                                                Map.entry("History", new ArrayList<>(List.of(2, 3, 2, 2))),
                                                Map.entry("English", new ArrayList<>(List.of(5, 4, 2, 3)))
                                        )
                                )),
                        Map.entry("John", // 54
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(5, 3, 4, 4))),
                                                Map.entry("History", new ArrayList<>(List.of(5, 4, 5, 5))),
                                                Map.entry("English", new ArrayList<>(List.of(5, 4, 5, 5)))
                                        )
                                )),
                        Map.entry("Rob", // 41
                                new HashMap<>(
                                        Map.ofEntries(
                                                Map.entry("Math", new ArrayList<>(List.of(4, 2, 2, 4))),
                                                Map.entry("History", new ArrayList<>(List.of(2, 2, 3, 2))),
                                                Map.entry("English", new ArrayList<>(List.of(5, 5, 5, 5)))
                                        )
                                ))
                )
        );
        var bestStudent2 = getBestStudent2(students2);
        System.out.println(bestStudent2);
//        System.out.printf("(name: %s, score: %d)", bestStudent2.getKey(), bestStudent2.getValue());
        // (name: John, score: 54)

        // ====> Task 5
        var names = new ArrayList<>(
                List.of(
                        "Naomi", "Tom", "Mike", "Jessica", "Nicole",
                        "Sam", "Teresa", "Monika", "Mark", "Scott",
                        "Ron", "Sarah", "John", "Simona", "Nina"
                )
        );

        var getDict = getDictFromNames1(names);
        for(var pair : getDict.entrySet()) {
            System.out.printf("%s: %s\n", pair.getKey(), pair.getValue());
        }
//        'N': ["Naomi", "Nicole", "Nina"],
//        'T': ["Tom", "Teresa"],
//        'M': ["Mike", "Monika", "Mark"],
//        'J': ["Jessica", "John"],
//        'S': ["Sam", "Scott", "Sarah", "Simona"],
//        'R': ["Ron"]

        // ====> Bonus
        var getDict2 = getDictFromNames2(names);
        System.out.println();
        for(var pair : getDict2.entrySet()) {
            System.out.printf("%d: %s\n", pair.getKey(), pair.getValue());
        }
//        3: ["Ron", "Sam", "Tom"],
//        4: ["Nina", "Mike", "Mark", "John"],
//        5: ["Naomi", "Scott", "Sarah"],
//        6: ["Nicole", "Teresa", "Monika", "Simona"],
//        7: ["Jessica"]
    }
}