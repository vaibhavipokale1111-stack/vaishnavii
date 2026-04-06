import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(11);
        data.add(12);
        data.add(13);
        for (int num:data){
            System.out.println(num);
        }
    }
}
