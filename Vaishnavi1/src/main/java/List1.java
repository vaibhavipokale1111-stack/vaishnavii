import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
      //  ArrayList<String> List = new ArrayList<>();
        List.add("banana");
        List.add("Apple");
        List.add("Grapes");
        List.add("Kiwi");

        for (String s:List){
            System.out.println(s);
        }


    }
}
