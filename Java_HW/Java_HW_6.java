import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Java_HW_6 {
    public static void main(String[] args) {
        MySet mySet = new MySet();

        mySet.add(2);
        mySet.add(6);
        mySet.add(367);
        mySet.add(4);
        mySet.add(0);

        System.out.println(mySet);
        System.out.println(mySet.index(1));
    }

    
}

class MySet {
    private HashMap<Integer, Object> map = new HashMap<>();
    private final Object OBJ = new Object();

    public boolean add(Integer i) {
        map.put(i, OBJ);
        return true;
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public Integer index(Integer i) {

        Set<Integer> set = map.keySet();

        Iterator<Integer> iterator = set.iterator();
        ArrayList<Integer> list = new ArrayList<>();
        
        while (iterator.hasNext()) {
            list.add((iterator.next()));
        }
        return list.get(i);
        }

}
