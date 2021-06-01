import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" enter N : ");
        int n = scan.nextInt();
        String binary = " ";
        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        System.out.println(" result : " + binary);
    }
}