import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = -1;
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("a = " + a);
        int b = 0;
        try {
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("b = " + b);
        String znak = "-";
        try {
            znak = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(znak);
        if (znak.equals("-"))
            result = a - b;
        if (znak.equals("+"))
            result = a + b;
        if (znak.equals("/"))
            result = a / b;
        if (znak.equals("*"))
            result = a * b;
        System.out.println(result);
    }
}
