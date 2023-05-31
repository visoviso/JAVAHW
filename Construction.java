package homework13;
import java.util.*;
class Construction {
    Object value;
    Double minValue;
    Double maxValue;
    boolean isQuantitative;
    String property;

    public Construction(String property, boolean isQuantitative, Object value, Double minValue, Double maxValue) {
        this.property = property;
        this.isQuantitative = isQuantitative;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public static Construction startGetting(Scanner scanner, String property, boolean isQuantitative) {

        if (isQuantitative) {

            String quest = "Выберите тип криетрия: " +
                    "\n 1. Значение поиска" +
                    "\n 2. Максимальное предельное значение" +
                    "\n 3. минимальное предельное значение" +
                    "\n 4. Разница между максимальным и минимальным";
            System.out.println(quest);

            String text = scanner.next();
            Construction criterion = null;

            if (text.equals("1")) {
                System.out.println("Введите значение поиска: ");
                int getValue = scanner.nextInt();
                criterion = new Construction(property, true, getValue, null, null);
            } else if (text.equals("2")) {
                System.out.println("Введите максимальное предельное значение: ");
                double getValue = scanner.nextDouble();
                criterion = new Construction(property, true, null, null, getValue);
            } else if (text.equals("3")) {
                System.out.println("Введите минимальное предельное значение: ");
                double getValue = scanner.nextDouble();
                criterion = new Construction(property, true, null, getValue, null);
            } else if (text.equals("4")) {
                System.out.println("Введите минимальное предельное значение: ");
                double getMin = scanner.nextDouble();
                System.out.println("Введите максимальное предельное значение: ");
                double getMax = scanner.nextDouble();
                criterion = new Construction(property, true, null, getMin, getMax);
            }

            return criterion;
        }

        System.out.println("Введите значение поиска: ");
        String getValue = scanner.next();
        return new Construction(property, false, getValue, null, null);
    }

}
