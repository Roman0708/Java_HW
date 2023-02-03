import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java_HW_4 {
    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;
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

            
            
            
            // create a buffer for all rows from file
            // ArrayList<String> buffer = new ArrayList<>();
            // BufferedReader br = new BufferedReader(new FileReader("List.txt"));
            
            // ArrayList<String> list = new ArrayList<>();
            // int counter = 0;
            // String line = br.readLine();
            // while (line != null) {


            //     String[] parts = line.split(" "); //
            //     list.add(parts.toString()); //
            //     //Fill the buffer

            //     buffer.add(line);
            //     line = br.readLine();
            //     counter++;
            // }
            
            // System.out.println(list);
            
            // for (String s : buffer) {

            //     //Loop the buffer and parse each row data, split by space

            //     String[] parts = s.split(" ");

            //     System.out.println(Arrays.toString(parts));

            // }

            // System.out.println(buffer);


            System.out.println();
            FileReader fr = new FileReader("List.txt");
            String text = "";
            while (fr.ready()) {
                text += (char)fr.read();
            }
            System.out.println(text);

            System.out.println("-----------");
            String[] parts = text.split("\r\n");
            System.out.println(Arrays.toString(parts));

            




            ArrayList<String> list = new ArrayList<>();

            for (String temp: parts) {
                list.add(temp);
            }

            System.out.println(list.toString());

            for (int i = 0; i < list.size(); i++) {
                String str = parts[i].split(" ").toString();
                list.set(i, str); 
            }

            System.out.println(list.toString());

            // // System.out.print(Arrays.toString(parts));
            // br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
