import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Java_HW_3 {
    public static void main(String[] args) {
        // 1
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("orange");
        color.add("yellow");
        color.add("green");
        color.add("blue");
        color.add("violet");
        
        color.forEach((c) -> System.out.println(c));

        System.out.println("-----");
        
        // 2
        for (int i = 0; i < color.size(); i++) {
            String temp = color.get(i) + "!";
            color.set(i, temp);
        }

        // 3
        color.add(1,"white");

        // 4
        System.out.println(color.get(1));

        System.out.println("-----");

        // 5
        color.set(color.size()-1,"black");

        // 6
        color.remove(3);

        // 7
        System.out.println(color.get(color.indexOf("black")));

        System.out.println("-----");
        
        // 8
        ArrayList<String> l2 = new ArrayList<>();
        for (int i = 0; i < color.size(); i++) {
            Random chance = new Random();                               // С рандомным добавлением как-то веселее
            if (chance.nextBoolean() == true) l2.add(color.get(i));
        }

        l2.forEach((c) -> System.out.println(c));
        System.out.println("-----");
        
        // 9
        color.retainAll(l2);
        color.forEach((c) -> System.out.println(c));
        System.out.println("-----");

        // 10
        Collections.sort(color);
        color.forEach((c) -> System.out.println(c));
    }
}
