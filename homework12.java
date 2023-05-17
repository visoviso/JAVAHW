
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
import java.util.*;
import java.util.Scanner;


public class homework12 {
    public static void main(String[] args) {

        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> bookName = new HashMap<Integer, String>();

        String name1 = new String("Ivanov Ivan");
        String name2 = new String("Petrova Svetlana");
        String name3 = new String("Vladimirova Anna");
       

        bookName.put(0, name1);
        bookName.put(1, name2);
        bookName.put(2, name3);
       

        for (int i = 0; i < bookName.size(); i++) {
            if (phoneBook.get(i) == null) {
                phoneBook.put(i, new ArrayList<String>());
                phoneBook.get(i).add("8-916-143-87-" + i + i + ";" + "8-916-365-78-" + i + i);

            }
            System.out.println("Номер телефона" + " " + bookName.get(i) + " :" + phoneBook.get(i));
        }
    }
}
