import java.util.Arrays;
import java.util.Random;

public class Java_HW_1 
{
    public static void main(String[] args) 
    {
        int i = new Random().nextInt(2000);
        System.out.println(String.valueOf(i));
        int n = Integer.toBinaryString(i).length();
        System.out.println(String.valueOf(n));

        int [] m1 = new int [0];
        for (int j = i; j <= Short.MAX_VALUE; j++)
        {
            if (j % i == 0)
            {
                int [] temp = Arrays.copyOf(m1, m1.length+1);
                temp[m1.length] = j;
                m1 = temp;
            }
        }
        // Проверка массива
        // for (int c = 0; c < m1.length-1; c++) System.out.print(String.valueOf(m1[c]) + " ");    

        int [] m2 = new int [0];
        for (int j = Short.MIN_VALUE; j < i; j++)
        {
            if (j % i != 0)
            {
                int [] temp = Arrays.copyOf(m2, m2.length+1);
                temp[m2.length] = j;
                m2 = temp;
            }
        }
        // Проверка массива, Оч много цифр, лучше не запускать
        // for (int c = 0; c < m2.length-1; c++) System.out.print(String.valueOf(m2[c]) + " ");    
        
    }

}