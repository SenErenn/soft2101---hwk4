import java.util.Scanner;

public class RangePrinter {

    public static void printNumbersBetween(int a, int b) {
    int start = Math.min(a, b) + 1;
    int end = Math.max(a, b) - 1;

    for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        printNumbersBetween(x, y);

        sc.close();
    }
}
