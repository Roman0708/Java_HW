import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java_HW_4 {
    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;
        String answer = "";

        // 1
        try {
            writer = new FileWriter("task1.txt");
            String str = new String("Task 1");                
            writer.append(str);             
            writer.flush();

            reader = new FileReader("task1.txt");
            while (reader.ready()) {
                answer += (char)reader.read();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(answer);

        // 2
    //     try {

    //     }
    }
    
}
