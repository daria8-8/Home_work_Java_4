import java.util.ArrayList;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst= new LinkedList<>();
        for (int i = 0;i<10;i++){
            lst.add(i);
        }
        System.out.println(lst);
        System.out.println(ReverseList(lst));
    }
    public static LinkedList<Integer> ReverseList(LinkedList<Integer> lst) {
        ArrayList<Integer> arr= new ArrayList<>(); 
        arr.addAll (lst);
            for (int i = 0; i<lst.size(); i++){
                lst.set(i,arr.get(lst.size()-1-i));
            }
        return lst;      
    }
}