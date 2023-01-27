
public class Java_HW_2 
{
    public static void main(String[] args)
    {
        // Задача 1
        String s1 = new String("object");       // Можно было сделать считывание строк из консоли, файла и т.д.
        String s2 = new String("ect");          // Но такого задания не было, поэтому сделал только логику проверки
        System.out.println(s1.contains(s2));
        
        // Задача 2
        char[] c = new char[]{};

        if (s1.length() > s2.length())
        {
            c = s2.toCharArray();
        }
        else
        {
            c = s1.toCharArray();  
        }

        reverse(c, 0, c.length - 1);
        String s3 = new String(c);
        System.out.println(s1.contains(s3));
        task4();   
    }

    // Задача 3
    private static void swap(char[] c, int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void reverse(char[] c, int l, int h)
    {
        if (l < h)
        {
            swap(c, l, h);                              // Не уверен что сделал с помощью правильного инструментария
            reverse(c, l + 1, h - 1);                   // Но через Stringbuilder вообще не получилось
        }
    }

    // Задача 4
    public static void task4 () 
    {
        int num1 = 3;
        int num2 = 56;

        StringBuilder str1 = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
        StringBuilder str2 = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
        StringBuilder str3 = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        StringBuilder str4 = new StringBuilder().append(num1).append(" / ").append(num2).append(" = ").append(num1 / num2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // task5(str1);
        // task5(str2);
        // task5(str3);
        // task5(str4);

        task5(str1);
        task5(str2);
        task5(str3);
        task5(str4);

        task7();
    }

    // Задача 5
    public static void task5 (StringBuilder str) 
    {
        int index = str.indexOf("=");
        str.deleteCharAt(index);
        str.insert(index, "равно");
        System.out.println(str.toString());
    }

    // Задача 6
    public static void task6 (StringBuilder str) 
    {
        int index = str.indexOf("=");
        str.replace(index, index, "равно");
    }

    // Задача 7
    public static void task7 () 
    {
        StringBuilder toomach = new StringBuilder();
        for (int i = 0; i < 10000.; i++) toomach.append("=");
        System.out.println(toomach.toString());
    }
}
