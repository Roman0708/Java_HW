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
            // FileReader fr = new FileReader("List.txt");
            String text = "";

            
            BufferedReader reader = new BufferedReader(new FileReader("List.txt"));
            String line = reader.readLine();
            
            // create a buffer for all rows from file
            ArrayList<String> buffer = new ArrayList<>();
            while (line != null) {

                //Fill the buffer

                buffer.add(line);
                line = reader.readLine();
            }

            for (String s : buffer) {

                //Loop the buffer and parse each row data, split by whitespace
                //Create a user

                String[] parts = s.split(" ");

                User u = new User();

                u.lastName = parts[0];

                System.out.println(Arrays.toString(parts));
                System.out.println(u);
                
            }

            // System.out.println(text);
            // System.out.println("-----------");
            // String[] parts = text.split("\n");

            // System.out.print(Arrays.toString(parts));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    
}

class User {
    public String lastName;

    @Override
    public String toString() {
        return lastName;
    }
}
