import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int min = max;

        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }

        sc.close();

        System.out.println("maximum = " + max + ", minimum = " + min);
    }
}