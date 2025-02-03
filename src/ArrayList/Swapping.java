package ArrayList;
import java.util.ArrayList;

public class Swapping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(3);
        System.out.println(list);

        int i1=2, i2=4;
        swap(list, i1, i2);
        System.out.println(list);
    }
    static void swap(ArrayList<Integer> list, int i1, int i2){
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }
}
