// 2. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;

    

public class homework10 {
    public static void main(String[] args) {
        ex10();
       
    }

    static void ex10(){
         LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList); 
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}