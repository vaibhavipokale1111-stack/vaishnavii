import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,3,4,5,4,5,4,3,3));
        ArrayList<Integer> result = new ArrayList<>();
        for (int num :list){
            if(!result.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
