
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;


public class Java_HW_4 {
    public static void main(String[] args) {
        FileWriter writer = null;
        // FileReader reader = null;
        String answer = "";

        // 1
        // try {
        // writer = new FileWriter("task1.txt");
        // String str = new String("Task 1");
        // writer.append(str);
        // writer.flush();

        // reader = new FileReader("task1.txt");

        // while (reader.ready()) {
        // answer += (char)reader.read();
        // }
        // }
        // catch (IOException e) {
        // System.out.println(e.getMessage());
        // }
        // System.out.println(answer);

        // 2

        try {
            System.out.println();
            FileReader fr = new FileReader("List.txt");
            String text = "";
            while (fr.ready()) {
                text += (char) fr.read();
            }
            System.out.println(text);

            System.out.println("-----------");
            String[] parts = text.split("\r\n");
            System.out.println(Arrays.toString(parts));

            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> surname = new ArrayList<>();
            ArrayList<String> lastname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> gender = new ArrayList<>();
            ArrayList<Integer> index = new ArrayList<>();


            for (String s: parts) {
                String[] help = s.split(" ");
                surname.add(help[0]);
                name.add(help[1]);
                lastname.add(help[2]);
                age.add(Integer.parseInt(help[3]));
                gender.add(help[4].contains("F")?false:true);
                System.out.println(Arrays.toString(help));
            }



            for (int i = 0; i < parts.length; i++) {
                System.out.println(surname.get(i) + " " + name.get(i).charAt(0)+ ". " + lastname.get(i).charAt(0) + ". " + age.get(i) + " " + (gender.get(i)?("M"):"F"));
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
