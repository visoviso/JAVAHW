
import java.util.Scanner;
import java.util.Arrays;



public class homework1{
    public static void main(String[] args) {
        task1();
       

    }

    public static int[] task1() {
        //1. Написать метод, принимающий на вход два аргумента:
        // len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;

        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int len = input.nextInt();

        int[] arr_output = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Элемент массива: ");
            int initialValue = input.nextInt();
            arr_output[i] = initialValue;

        }
        System.out.println(Arrays.toString(arr_output));
        return arr_output;
    }
}