package assignment;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the number of rows for the tree and triangle: ");
        int rows = scan.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }


        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("2");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("1");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

