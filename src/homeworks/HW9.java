package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Christmas tree size");
        int treeSize = scanner.nextInt();

        for (int i = 1; i <= treeSize; i++) {
            for (int star = treeSize - i; star > 0; star--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        } for (int i = 1; i <= treeSize-1; i++){
            System.out.print(" ");
        }
        for (int j= treeSize-3; j > 0; j--){
            System.out.print(" ");
        } for (int k= 1; k > 0; k--){
            System.out.print(" # ");
        }
        System.out.println();
    }
}
