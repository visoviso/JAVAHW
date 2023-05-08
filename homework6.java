
// 2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//     1 Расширение файла: txt
//     2 Расширение файла: pdf
//     3 Расширение файла: 
//     4 Расширение файла: jpg
import java.io.File;


public class homework6 {
    public static void main(String[] args) {
  

        File dir = new File("C:\\Users\\user\\Desktop\\учеба\\Java\\папка для задания");
        for (File item : dir.listFiles()) {
            
            if (item.isDirectory()) {
                System.out.println(item.getName() + " \t folder");
            } else {
                String fileName = item.getName();
                if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
                    System.out.println(item.getName() + " \t file" + " Расширение файла: " + fileName.substring(fileName.lastIndexOf(".") + 1));
                }
            }
        }

    }

}

