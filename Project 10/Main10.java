import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main10 {
    static HashMap<String, String> getPhoneListReverse(HashMap<String, String> dict) {
        var map = new HashMap<String, String>();

        for(var pair : dict.entrySet()) {
            map.put(pair.getValue(), pair.getKey());
        }

        return map;
    }
    public static void main(String[] args) {
        // type id;
        // type id = ...
        // var i = new ArrayList<Integer>();

        // key -> value
        // name -> number -> 905517020
        // domain -> ip -> 192.25.101.70
        // (type) id -> ...


//        HashMap<String, String> phoneList1 = new HashMap<>();
        HashMap<String, String> phoneList = new HashMap<>(
            Map.of(
               "Tom", "903357021",
               "Sam", "946652112",
               "Jessica", "933814015"
            )
        );
//        HashMap<String, String> phoneList3 = new HashMap<>(
//           Map.ofEntries(
//               Map.entry("Tom", "903357021"),
//               Map.entry("Sam", "946652112"),
//               Map.entry("Jessica", "933814015")
//           )
//        );
//
//        // ====> size, isEmpty
////        System.out.println(phoneList1);
////        System.out.println(phoneList2);
////        System.out.println(phoneList3);
//        HashMap<String, String> phoneList = new HashMap<>();
//
//        // ====> put
//        phoneList.put("Sam", "946652112");
//        phoneList.putAll(Map.ofEntries(
//            Map.entry("Tom", "903357021"),
//            Map.entry("Jessica", "933814015")
//        ));
////        System.out.println(phoneList.putIfAbsent("Tom", "777"));
//
//        // ====> containsKey, containsValue
////        if(!phoneList.containsKey("Tom"))
////            phoneList.put("Tom", "777");
//
//        // ====> remove, clear
////        System.out.println(phoneList.remove("Jessica")); // 933814015
////        System.out.println(phoneList.remove("Jessica")); // null
////        System.out.println(phoneList.remove("Tom", "933814015")); // false
////        phoneList.clear();
////        System.out.println(phoneList);
//
//
//        // ====> get, getOrDefault
        System.out.println(phoneList.get("Jessica"));
////        System.out.println(phoneList.getOrDefault("Sarah", "Guest"));
//
//        // ====> replace
////        System.out.println(phoneList.replace("Tom", "555"));
////        System.out.println(phoneList.replace("Tom", "322", "555")); // false
//
//        // ====> keySet, values, entrySet
//
////        for(String key : phoneList.keySet()) {
////            System.out.printf("%s -> %s\n", key, phoneList.get(key));
////        }
////        for(Map.Entry pair : phoneList.entrySet()) {
////            System.out.printf("%s -> %s\n", pair.getKey(), pair.getValue());
////        }
////        for(String value : phoneList.values()) {
////            System.out.printf("_ ->" va,
////        }

        // ====> Task 1
//        var phoneList = new HashMap<>(
//            Map.ofEntries(
//                Map.entry("Tom", "903357021"),
//                Map.entry("Sam", "946652112"),
//                Map.entry("Jessica", "933814015")
//            )
//        );
//        var phoneListReverse = getPhoneListReverse(phoneList);
//
//        System.out.println(phoneListReverse);
////        {
////            903357021=Tom,
////            946652112=Sam,
////            933814015=Jessica
////        }
//
//        // ====> Task 2
//        var ruEnDictionary = new HashMap<String, ArrayList<String>>(
//            Map.ofEntries(
//                Map.entry("бежать", new ArrayList<>(
//                    List.of("run", "escape")
//                )),
//                Map.entry("побег", new ArrayList<>(
//                        List.of("escape", "runaway", "shoot")
//                )),
//                Map.entry("плавать", new ArrayList<>(
//                        List.of("swim", "sail", "float")
//                )),
//                Map.entry("всплывать", new ArrayList<>(
//                        List.of("emerge", "surface", "float")
//                ))
//            )
//        );
//        var enRuDictionary = getEnRuDictionary(ruEnDictionary);
//        System.out.println(enRuDictionary);
//
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
//        var students = new HashMap<>(
//            Map.ofEntries(
//                Map.entry("Nicole", 5.5),
//                Map.entry("Jessica", 7.5),
//                Map.entry("Naomi", 8.5),
//                Map.entry("Mike", 6.0),
//                Map.entry("Sam", 6.5),
//                Map.entry("John", 8.0),
//                Map.entry("Rob", 7.5)
//            )
//        );
//
//        var student = getBestStudent(students);
//        System.out.printf("(name: %s, score: %f)", student.getKey(), student.getValue());
//        // (name: Naomi, score: 8.5)
//
//        // ====> Task 4
//        var students2 = new HashMap<>(
//            Map.ofEntries(
//                Map.entry("Nicole", // 46
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(5, 3, 4, 4))),
//                            Map.entry("History", new ArrayList<>(List.of(2, 3, 3, 3))),
//                            Map.entry("English", new ArrayList<>(List.of(5, 4, 5, 5)))
//                        )
//                    )
//                ),
//                Map.entry("Jessica", // 38
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(2, 2, 3, 2))),
//                            Map.entry("History", new ArrayList<>(List.of(5, 5, 4, 5))),
//                            Map.entry("English", new ArrayList<>(List.of(2, 2, 3, 3)))
//                        )
//                    )),
//                Map.entry("Naomi", // 44
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(4, 3, 3, 4))),
//                            Map.entry("History", new ArrayList<>(List.of(5, 4, 4, 3))),
//                            Map.entry("English", new ArrayList<>(List.of(2, 3, 4, 5)))
//                        )
//                    )),
//                Map.entry("Mike", // 41
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(2, 4, 4, 4))),
//                            Map.entry("History", new ArrayList<>(List.of(5, 5, 4, 4))),
//                            Map.entry("English", new ArrayList<>(List.of(2, 3, 2, 2)))
//                        )
//                    )),
//                Map.entry("Sam", // 43
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(5, 5, 5, 5))),
//                            Map.entry("History", new ArrayList<>(List.of(2, 3, 2, 2))),
//                            Map.entry("English", new ArrayList<>(List.of(5, 4, 2, 3)))
//                        )
//                    )),
//                Map.entry("John", // 54
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(5, 3, 4, 4))),
//                            Map.entry("History", new ArrayList<>(List.of(5, 4, 5, 5))),
//                            Map.entry("English", new ArrayList<>(List.of(5, 4, 5, 5)))
//                        )
//                    )),
//                Map.entry("Rob", // 41
//                    new HashMap<>(
//                        Map.ofEntries(
//                            Map.entry("Math", new ArrayList<>(List.of(4, 2, 2, 4))),
//                            Map.entry("History", new ArrayList<>(List.of(2, 2, 3, 2))),
//                            Map.entry("English", new ArrayList<>(List.of(5, 5, 5, 5)))
//                        )
//                ))
//            )
//        );
//        var bestStudent2 = getBestStudent2(students2);
//        System.out.printf("(name: %s, score: %d)", bestStudent2.getKey(), bestStudent2.getValue());
//        // (name: John, score: 65)
//
//        // ====> Task 5
//        var names = new ArrayList<>(
//            List.of(
//                "Naomi", "Tom", "Mike", "Jessica", "Nicole",
//                "Sam", "Teresa", "Monika", "Mark", "Scott",
//                "Ron", "Sarah", "John", "Simona", "Nina"
//            )
//        );
//
//        var getDict = getDictFromNames1(names);
//        for(var pair : getDict.entrySet()) {
//            System.out.printf("%c: %s", pair.getKey(), pair.getValue());
//        }
////        'N': ["Naomi", "Nicole", "Nina"],
////        'T': ["Tom", "Teresa"],
////        'M': ["Mike", "Monika", "Mark"],
////        'J': ["Jessica", "John"],
////        'S': ["Sam", "Scott", "Sarah", "Simona"],
////        'R': ["Ron"]
//
//        // ====> Bonus
//        var getDict2 = getDictFromNames2(names);
//        for(var pair : getDict2.entrySet()) {
//            System.out.printf("%c: %s", pair.getKey(), pair.getValue());
//        }
////        3: ["Ron", "Sam", "Tom"],
////        4: ["Nina", "Mike", "Mark", "John"],
////        5: ["Naomi", "Scott", "Sarah"],
////        6: ["Nicole", "Teresa", "Monika", "Simona"],
////        7: ["Jessica"]
      }
}
