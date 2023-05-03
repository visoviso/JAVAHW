
import java.util.IntSummaryStatistics;
import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
      
        task2();

    }
public static void task2() {
    //2. Задать одномерный массив и
    // найти в нем минимальный и максимальный элементы.
    int[] array2 = {1, 8, 15, 46, 79, 2, 0};
    IntSummaryStatistics find = Arrays.stream(array2).summaryStatistics();
    System.out.println("min elem: " + find.getMin());
    System.out.println("max elem: " + find.getMax());

    //Arrays.sort(array2);
    // System.out.println("min elem: " + array2[0]);
    // System.out.println("max elem: " + array2[array2.length - 1]);

}
}