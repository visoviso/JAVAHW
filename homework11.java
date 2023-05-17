
// 2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
// Пусть дан список сотрудников:
import java.util.*;
import java.util.stream.Collectors;

public class homework11 {
    public static void main(String[] args) {

        HashMap<String, String> worker = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<String, Integer>();

        worker.put("Иванов", "Иван");
        worker.put("Петрова", "Светлана");
        worker.put("Белова", "Кристина");
        worker.put("Мусина", "Анна");
        worker.put("Крутова", "Анна");
        worker.put("Юрин", "Иван");
        worker.put("Лыков", "Петр");
        worker.put("Чернов", "Павел");
        worker.put("Чернышов", "Петр");
        worker.put("Федорова", "Мария");
        worker.put("Светлова", "Марина");
        worker.put("Савина", "Мария");
        worker.put("Рыкова", "Мария");
        worker.put("Лугова", "Марина");
        worker.put("Владимирова", "Анна");
        worker.put("Мечников", "Иван");
        worker.put("Петин", "Петр");
        worker.put("Ежов", "Иван");

        for (String nameCount : worker.values()) {
            if (!count.containsKey(nameCount)) {
                if (Collections.frequency(worker.values(), nameCount) > 1) {
                    count.put(nameCount, Collections.frequency(worker.values(), nameCount));
                }
            }
        }
        count.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
