import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class homeowrk3 {
    public static void main(String[] args) {
        task3();
    }

    public static int[] task3() {
        // 4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами (можно только одну из
        // диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему
        // принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = input.nextInt();

        int[][] arr1 = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                arr1[i][j] = rnd.nextInt(10) + 1;
            }
        }
        System.out.println(Arrays.deepToString(arr1));

        for (int i = 0; i < n; i++) {
            arr1[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(arr1));
        return arr1;
    }
}
public static void diagonal(int x, int y) {
    int[][] arr = new int[x][y];
    
    for (int i = 0; i < arr.length; i++) {
    arr[i][arr.length - i - 1] = 1;
    }
    for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++) {
    arr[i][i] = 1;
    System.out.print(arr[i][j] + " ");
    }
    System.out.println();
    }
    }