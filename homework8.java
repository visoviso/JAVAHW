
// 2. Каталог товаров книжного магазина сохранен в виде двумерного списка 
// List<ArrayList<String>> 
// так, что на 0й позиции каждого внутреннего списка содержится название жанра,
// а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры(можно через консоль).
// Пример:
// "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
// "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
// "Детектив", "Десять негритят".
// "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class homework8 {

    public static void main(String[] args) {
        task08();
    }

    private static void task08() {

        Scanner bookScanner = new Scanner(System.in);
        List<ArrayList<String>> bookList = new ArrayList<>();

        int Size = 2;

        for (int i = 0; i < Size; i++) {
            System.out.printf("Жанр книги: ");
            String inputMainList = bookScanner.nextLine();

            ArrayList<String> mainList = new ArrayList<>();
            mainList.add(inputMainList);

            System.out.printf("количество книг в жанре: ");
            int bookQty = Integer.parseInt(bookScanner.nextLine());

            for (int j = 0; j < bookQty; j++) {
                System.out.printf("название книги: ");
                String inputBookName = bookScanner.nextLine();
                mainList.add(inputBookName);
            }

            bookList.add(mainList);
        }
        bookList.forEach(System.out::println);

    }

}
