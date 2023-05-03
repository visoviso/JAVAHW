import java.util.Scanner;
import java.util.Calendar;


public class homework4 {
    public static void main(String[] args) {
      
        task4();

    }   


public static int task4() {
// 4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя по английски: ");
        String name = iScanner.nextLine();


        final Calendar calendar = Calendar.getInstance();

        StringBuilder timeFull = (new StringBuilder().append(calendar.get(Calendar.HOUR_OF_DAY))
                .append(":").append(calendar.get(Calendar.MINUTE)).append(":")
                .append(calendar.get(Calendar.SECOND)).append(" "));
        System.out.println(timeFull);

        int timeH = (calendar.get(Calendar.HOUR_OF_DAY));

        if (timeH > 5 && timeH < 12) {
            //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
            System.out.printf("Доброе утро, %s!", name);
        }

        if (timeH > 12 && timeH < 18) {
            //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
            System.out.printf("Добрый день, %s!", name);
        }

        if (timeH > 18 && timeH < 23) {
            //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
            System.out.printf("Добрый вечер, %s!", name);
        }

        if (timeH > 0 && timeH < 5) {
            //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
            System.out.printf("Доброй ночи, %s!", name);
        }

        if (timeH == 23) {
            //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
            System.out.printf("Доброй ночи, %s!", name);
        }
        System.out.println();
        return timeH;
    }


}
