
// 1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
// Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.valueOf;
import static javax.swing.UIManager.get;

public class homework7 {

    public static void main(String[] args) {
        task07();
    }
    private static boolean task07() {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(list);

        ArrayList<String> del = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            String elem = list.get(i);

            try {
                Integer.parseInt(elem);
                del.add(elem);
            } catch (Exception e) {
            }
        }
        list.removeAll(del);
        System.out.println(list);
        return false;
    }

}
