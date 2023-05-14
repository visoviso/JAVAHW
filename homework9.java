
// 1. Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        ex09();
        
    }

    static void ex09(){
        Scanner scan = new Scanner(System.in);
        LinkedList<String> listOfWords= new LinkedList<>();
        while (true) {
            System.out.print("введите строку: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("stop")){
                break;
            } else if (input.equalsIgnoreCase("print")){
                printArrayReversal(listOfWords);
            } else if (input.equalsIgnoreCase("revert")){
                revertLastWord(listOfWords);
            } else {
                listOfWords.add(input);
            }
        }

    }

    private static void revertLastWord(LinkedList<String> listOfWords) {
        System.out.printf("слово: [%s] будет удалено из списка%n",listOfWords.getLast());
        String removed = listOfWords.removeLast();
       
    }

    private static void printArrayReversal(LinkedList<String> listOfWords) {
        for (int i = listOfWords.size()-1; i >= 0 ; i--) {
            try {
                System.out.println(listOfWords.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("неправильно: " + e.getMessage());
            }
        }
    }

}