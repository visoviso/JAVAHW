import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class homeowrk3 {
    public static void main(String[] args) {
        task3();
    }

    public static int[][] task3() {
        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы
        // единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему
        // принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число  : ");
        int n = input.nextInt();

        int[][] array3 = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                array3[i][j] = rnd.nextInt(10) + 1;
            }
        }
        System.out.println(Arrays.deepToString(array3));

        for (int i = 0; i < n; i++) {
            array3[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(array3));
        return array3;
    }
}
