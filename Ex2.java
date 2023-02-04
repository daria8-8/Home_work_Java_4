import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String el  = "";
        String num="";
        LinkedList<String> list = new LinkedList<>();
        list.add("6");
        list.add("9");
        list.add("5");
        list.add("2");
        while (!el.equals("0")){
            System.out.println("1-поместить элемент в конец очереди:"); 
            System.out.println("2-вернуть первый элемент из очереди и удалить его:");
            System.out.println("3-вернуть первый элемент из очереди, не удаляя его:");
            el = scan.nextLine();
            switch (el){
            case ("1"):
                System.out.println("введите элемент списка:");
                el = scan.nextLine();
                list  = enqueue(list, el);
                break;
            case ("2"):                
                num = list.get(0);
                list  = dequeue(list);
                System.out.printf("Первый элемент списка: %s \n", num);
                break;
            case ("3"):
                num= first(list);
                System.out.printf("Первый элемент списка: %s \n", num);
                break;
            }
            System.out.println("Список");
            System.out.println(list);
        }
        scan.close();
    }
    public static LinkedList<String> enqueue(LinkedList<String> list, String str) {
        list.add(str);
        return list;
    }

    public static LinkedList<String> dequeue(LinkedList<String> list) {
        if (!list.isEmpty()){
            list.remove(0);   
        }
        return list;
    }

    public static String first(LinkedList<String> list) {
        String firstnum = (String) list.get(0);
        return firstnum;
    }
}