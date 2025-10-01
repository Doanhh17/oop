import java.util.Scanner;

public class AllEqual {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        if(x == y && x == z) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
