package seminar_5;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        String[] staff = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        countDublicateNamesAndSort(staff);
//        sortCountNames();
    }


    private static void countDublicateNamesAndSort(String[] staff) {
        List<String> names = new ArrayList<>();

        for (String employee : staff) {
            names.add(employee.split(" ")[0]);
        }

        System.out.print(names);
        System.out.println(" ");

        Set<String> setNames = new HashSet<>(names);
        System.out.println(setNames);
        Map<String, Integer> countNames = new LinkedHashMap<>();

        for (String setName: setNames) {
            int count = 0;
            for (String name : names) {
                if (setName.equals(name)) count++;
            }
            countNames.put(setName, count);
        }

        System.out.print(countNames);
        System.out.println(" ");

        Comparator<Map.Entry<String, Integer>> comparesByValue = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };

        List<Map.Entry<String, Integer>> sortCountNames = new ArrayList<Map.Entry<String, Integer>>();
        sortCountNames.addAll(countNames.entrySet());
        Collections.sort(sortCountNames, comparesByValue);

        System.out.print(sortCountNames);
    }
}
