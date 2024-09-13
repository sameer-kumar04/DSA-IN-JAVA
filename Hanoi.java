import java.util.Scanner;

public class Hanoi { // for this question everytime take n=3 to think logic of tower of hanoi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Disks : ");
        int n = sc.nextInt();

        towerofhanoi(n, "S", "H", "D");

        sc.close();
    }

    public static void towerofhanoi(int n, String source, String helper, String destination) {
        // Base case: If only one disk, move it from source to destination
        if (n == 1) {
            System.out.println("Transfering " + n + " disks from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to helper, using helper as as destination
        towerofhanoi(n - 1, source, destination, helper);

        // Move the nth disk from source to destination
        System.out.println("Transfering " + n + " disks from " + source + " to " + destination);

        // Move the n-1 disks from helper to destination, using source as a helper tower
        towerofhanoi(n - 1, helper, source, destination);
    }
}
